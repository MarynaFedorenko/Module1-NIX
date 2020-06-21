package nix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Level1Test {
    Level1 level1 = new Level1();

    @Test
    public void ArrayOfUniqueNumbers(){
        int [] arr1 = new int[]{1,4,5,1,1,3};
        int [] arr2 = new int[]{0,0,440,4,4,10,2,440};
        int [] arr3 = new int[]{0,0,0,0,0,0};
        assertEquals(level1.countUniqueNumbers(arr1), (4));
        assertEquals(level1.countUniqueNumbers(arr2), (5));
        assertEquals(level1.countUniqueNumbers(arr3), (1));

    }

    @Test
    public void chessHorseMoving(){
        assertTrue(level1.chessHorse(1,1,2,3));
        assertFalse(level1.chessHorse(6,6,6,8));
        assertFalse(level1.chessHorse(2,2,2,2));
        assertTrue(level1.chessHorse(-5,-2,-3,-3));

    }

    @Test
    public void countingTriangleArea(){
        int [] A = new int[]{1, 3};
        int [] B = new int[]{2, -5};
        int [] C = new int[]{-8, 4};
        int [] AA = new int[]{5, 1};
        int [] BB = new int[]{2, 3};
        int [] CC = new int[]{10, 16};
        assertEquals(level1.AbcTriangle(A,B,C), (35.5));
        assertEquals(level1.AbcTriangle(AA,BB,CC), (27.5));
        assertEquals(level1.AbcTriangle(A,B,A), (0));
        assertEquals(level1.AbcTriangle(B,B,B), (0));


    }

}
