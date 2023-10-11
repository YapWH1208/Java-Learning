package Lecture_4;

import java.util.Scanner;

public class CirclePlus {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = scanner.nextDouble();

        if(radius <= 0) System.out.println("Invalid radius");
        double pi = 3.14159267;
        double area = radius * radius * pi;

        System.out.printf("The area of the circle is %.2f", area);
    }
}
