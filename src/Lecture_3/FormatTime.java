package Lecture_3;

import java.util.Scanner;

public class FormatTime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the seconds: ");
        int input = scanner.nextInt();

        if(input < 60){
            System.out.println(input + "Seconds");
        } else if (input < 3600) {
            int minute = input / 60;
            int second = input % 60;
            System.out.println(minute + "Minutes" + second + "Seconds");
        }else {
            int hour = input / 3600;
            int minute = input % 3600;
            int second = input % 60;
            System.out.println(hour + "Hours" + minute + "Minutes" + second + "Seconds");
        }
    }
}
