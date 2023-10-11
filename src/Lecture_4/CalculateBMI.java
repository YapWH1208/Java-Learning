package Lecture_4;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in pounds");
        double weight = scanner.nextDouble() * 0.45359237;
        System.out.println("Enter your height in inches");
        double height = scanner.nextDouble() * 0.0254;

        double BMI = weight / Math.pow(height,2);
        System.out.printf("Your BMI rate is %.1f", BMI);

        if(BMI < 18.5)System.out.println("You're underweight");
        else if(BMI<=25.0) System.out.println("You're normal");
        else if(BMI<30.0) System.out.println("You're overweight");
        else System.out.println("You're obese");
    }
}
