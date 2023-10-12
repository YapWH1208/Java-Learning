package Lecture_5;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;

        do{
            System.out.println("Enter a digit(0 to quit)");
            num = scanner.nextInt();

            sum += num;
        }while(num != 0);
        System.out.println("The sum is " + sum);
    }
}
