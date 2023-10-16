package Lecture_6;

import java.util.Scanner;

public class Char {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score");
        double score = scanner.nextDouble();

        System.out.println(getGrade(score));
    }

    public static char getGrade(double score) {
        if(score>=90)return 'A';
        else if(score>=80) return 'B';
        else if(score>=70) return 'C';
        else if(score>=60) return 'D';
        else return 'E';
    }
}
