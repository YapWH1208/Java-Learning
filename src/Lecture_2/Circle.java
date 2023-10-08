package Lecture_2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        System.out.printf("The area of the circle is %.2f", radius * radius * 3.1415926);
    }
}