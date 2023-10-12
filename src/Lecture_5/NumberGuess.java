package Lecture_5;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 100");
        int input = scanner.nextInt();
        int num = (int)(Math.random() * 100);

        while(input != num){
            if(input<0 || input>100)System.out.println("Out of range");
            if(input<num)System.out.println("Too small");
            else System.out.println("Too big");
            input = scanner.nextInt();
        }
        System.out.println("Congrats! You get the correct number");
    }
}
