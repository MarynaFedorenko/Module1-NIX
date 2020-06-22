package nix;

import java.awt.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class LifeGame {

    static final int GRID_ROWS = 15;
    static final int GRID_COLS = 50;
    static final int[][]GRID = new int [GRID_ROWS][GRID_COLS];
    private static Random random;

    static int checkNeighbors(int col, int row, int grid[][]) {
        int sum = 0;
        for (int y = -1; y <= 1; y++) {
            for (int x = -1; x <= 1; x++) {
                if (x != 0 || y != 0) {
                    try {
                        sum += grid[y + row][x + col];
                    }
                    catch (ArrayIndexOutOfBoundsException e) {
                        // just ignore
                    }
                }
            }
        }
        return sum;
    }

    static final int[][] GRID_TMP = new int[GRID_ROWS][GRID_COLS];

    static void simulate(int grid[][]) {
        for (int row = 0; row < GRID_ROWS; row++) {
            for (int col = 0; col < GRID_COLS; col++) {
                int sum = checkNeighbors(col, row, grid);
                if (grid[row][col] == 0 && sum == 3) {
                    GRID_TMP[row][col] = 1;
                }
                else if (grid[row][col] == 1 && (sum == 2 || sum == 3)) {
                    GRID_TMP[row][col] = 1;
                }
                else {
                    GRID_TMP[row][col] = 0;
                }
            }
        }
        for (int row = 0; row < GRID_TMP.length; row++) {
            int cols[] = GRID_TMP[row];
            System.arraycopy(cols, 0, grid[row], 0, cols.length);
        }
    }

    static void printGrid(int grid[][]) {
        try {
            Runtime.getRuntime().exec("cls");
        } catch (IOException e) {
        }
        System.out.println(Arrays.deepToString(GRID)
                .replace("],", "],\n")
                .replaceAll("[ ,\\[\\]]", "")
                .replace("1", "X")
                .replace("0", " "));
    }

    public static void main(String[] args) {
        random = new Random();
        for(int i=0; i<GRID_ROWS; i++){
            for(int j=0; j<GRID_COLS; j++){
                GRID[i][j] = random.nextInt(2);
            }
        }

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                printGrid(GRID);
                simulate(GRID);

            }
        }, 100, 100);
    }
}
