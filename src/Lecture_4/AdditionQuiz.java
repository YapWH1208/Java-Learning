package Lecture_4;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args){
        int number1 = (int)(System.currentTimeMillis() % 100);
        int number2 = (int)(System.currentTimeMillis() / 100 % 100);

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the answer of addition between " + number1 + " and " + number2 + ": ");
        int answer = scanner.nextInt();

        System.out.println("Your answer is " + (number1+number2==answer));
        //System.out.println(number1+number2==answer?"Correct":"False");
    }
}
