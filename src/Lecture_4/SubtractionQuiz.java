package Lecture_4;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        if(num1 < num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("What's the answer when " + num1 + "-" + num2);
        int ans = scanner.nextInt();
        if(ans == (num1-num2)){
            System.out.println("You are correct");
        }else{
            System.out.println("Too bad you're wrong");
            System.out.println("The correct answer is " + (num1-num2));
        }
    }
}
