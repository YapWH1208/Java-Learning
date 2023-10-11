package Lecture_4;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int input = scanner.nextInt();

        if(input == 5) System.out.println("Hi Five");
        if(input == 2) System.out.println("Hi Even");

    }
}
