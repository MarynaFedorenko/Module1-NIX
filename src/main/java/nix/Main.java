package nix;


import java.util.Random;

public class Main {
    private static Random random;

    public static void main(String[] args) {
        Level1 first = new Level1();
        random = new Random();

        ///////////////Найти количество уникальных чисел в массиве////////////////
        for(int i=0; i<5; i++){
            int size = random.nextInt(20);
            int [] array = new int[size];
            for(int j=0; j<size; j++){
                array[j] = random.nextInt(10);
                System.out.print(array[j]+"   ");
            }
            System.out.println();
            first.countUniqueNumbers(array);
        }
        System.out.println();

        ///////////////Возможен ли ход конём ?/////////////////
        int currentX; int currentY;   int nextX;  int nextY;
        for(int i=0; i<5; i++){
            currentX =-5+random.nextInt(10);
            currentY =-5+random.nextInt(10);
            nextX =-5+random.nextInt(10);
            nextY =-5+random.nextInt(10);
            first.chessHorse(currentX, currentY, nextX, nextY);
        }
        System.out.println();

        ///////////////Площадь треигольника/////////////////
        for(int i=0; i<5; i++){
            int [] A = new int[]{-5+random.nextInt(10), -5+random.nextInt(10)};
            int [] B = new int[]{-5+random.nextInt(10), -5+random.nextInt(10)};
            int [] C = new int[]{-5+random.nextInt(10),-5+random.nextInt(10)};
            first.AbcTriangle(A, B, C);
        }





    }



}
