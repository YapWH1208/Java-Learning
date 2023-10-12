package Lecture_5;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a number between 1 - 10");
            num = scanner.nextInt();
        } while (!(num >= 1 && num <= 10));

        System.out.println("==========Printing==========");
        for (int i = 1; i <= num; i++) {
            if (i == 3 || i == 7) continue;
            System.out.println(i);
        }
    }
}
