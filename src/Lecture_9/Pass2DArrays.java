package Lecture_9;

import java.util.Scanner;

public class Pass2DArrays {
    public static void main(String[] args){
        int[][] arr = getArray();
        System.out.println("\nThe sum of the matrix is "+sum(arr)+"\n");
        printArr(arr);
    }

    public static int[][] getArray(){
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print("Enter the number for column " + i + " row " + j + ": ");
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

    public static int sum(int[][] arr){
        int sum = 0;
        for (int[] i : arr) {
            for (int j : i) {
                sum += j;
            }
        }
        return sum;
    }

    public static void printArr(int[][] arr){
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}