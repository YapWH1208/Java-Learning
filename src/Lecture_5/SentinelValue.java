package Lecture_5;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit(0 to quit): ");
        int input = scanner.nextInt();
        int sum = 0;
        while(input!=0){
            sum += input;
            System.out.println("Enter a digit(0 to quit): ");
            input = scanner.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
