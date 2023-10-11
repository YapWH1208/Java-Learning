package Lecture_4;

import java.util.Scanner;

public class LargestNumberExercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int temp = scanner.nextInt();
        System.out.print("\nEnter second integer: ");
        int num2 = scanner.nextInt();
        if(num2>temp) temp = num2;
        System.out.print("\nEnter third integer: ");
        int num3 = scanner.nextInt();
        if(num3>temp) temp = num3;

        System.out.println("\nThe largest number is "+temp);
    }
}
