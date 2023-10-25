package Lecture_10;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for(int[] i:arr){
            for(int j:i){
                j = scanner.nextInt();
            }
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int high = 0;

        for(int i=0; i<arr.length; i++){
            sum = 0;
            for(int j=0; j<arr[i].length; j++){
                sum += j;
            }
            if(sum>max){
                max = sum;
                high = i;
            }
        }

        System.out.printf("The row with highest sum is %d with value of %d", high, max);
    }
}
