package Lecture_3;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit degrees: ");
        double temp = scanner.nextDouble();

        System.out.printf("The Celsius of Fahrenheit degrees %.2f is %.2f", temp, ((5.0/9)*(temp-32)));
    }
}
