package nix;

import java.awt.*;

public class Level1 {

    public int countUniqueNumbers(int [] arr){
        if(arr.length==1) return 1;
        boolean [] unique = new boolean [arr.length];
        for(int i=0; i<arr.length; i++)
            unique[i] = true;

        int result = 0;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(unique[i]){
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j] && unique[j]) {
                    if(count>=1) {
                    unique[j] = false;}
                    else { count++; }
                }
            }
            count = 0;
            }
        }
        for(int i=0; i<unique.length; i++){
            if(unique[i]){
                result++;
            }
        }
        System.out.println(result);
        return result;

    }

    public boolean chessHorse(int currentX, int currentY, int nextX, int nextY){
        System.out.println("Current position: ("+currentX+";"+currentY+")");
        System.out.println("Next position: ("+nextX+";"+nextY+")");
        if(Math.abs(currentX-nextX)==2 && Math.abs(currentY-nextY)==1) {
            System.out.println("Possible move!");return true;}
        else if(Math.abs(currentY-nextY)==2 && Math.abs(currentX-nextX)==1) {
            System.out.println("Possible move!");return true;}
        else {
            System.out.println("Impossible move!");return false;}

    }

    public double AbcTriangle(int [] A, int [] B, int [] C){
        double S;
        System.out.println("A: ("+A[0]+";"+A[1]+")   "+"B: ("+B[0]+";"+B[1]+")    "+"C: ("+C[0]+";"+C[1]+")");
        if(A[0]==B[0]&&A[1]==B[1]||A[0]==C[0]&&A[1]==C[1]||B[0]==C[0]&&B[1]==C[1]) {
            S=0;  System.out.println("S = "+S);
            return S;}
        int [][]array = new int[2][2];
        array[0][0] = A[0] - C[0];
        array[0][1] = A[1] - C[1];
        array[1][0] = B[0] - C[0];
        array[1][1] = B[1] - C[1];
        S = 0.5*Math.abs(array[0][0]*array[1][1] - array[1][0]*array[0][1]);
        System.out.println("S = "+S);
        return S;


    }



}
