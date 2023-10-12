package Lecture_5;

import java.util.Scanner;

public class AdditionQuizPlus {
    public static void main(String[] args){
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the sum of " + num1 + " and " + num2);
        int ans = scanner.nextInt();

        while(ans!=num1+num2){
            System.out.println("You're Wrong. Try Again!");
            ans = scanner.nextInt();
        }

    }
}
