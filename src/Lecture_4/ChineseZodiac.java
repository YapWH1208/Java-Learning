package Lecture_4;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year");
        int year = scanner.nextInt();

        switch (year % 12){
            case 0: System.out.println("Your zodiac is monkey");break;
            case 1: System.out.println("Your zodiac is rooster");break;
            case 2: System.out.println("Your zodiac is dog");break;
            case 3: System.out.println("Your zodiac is pig");break;
            case 4: System.out.println("Your zodiac is rat");break;
            case 5: System.out.println("Your zodiac is ox");break;
            case 6: System.out.println("Your zodiac is tiger");break;
            case 7: System.out.println("Your zodiac is rabbit");break;
            case 8: System.out.println("Your zodiac is dragon");break;
            case 9: System.out.println("Your zodiac is snake");break;
            case 10: System.out.println("Your zodiac is horse");break;
            case 11: System.out.println("Your zodiac is sheep");break;
        }
    }
}
