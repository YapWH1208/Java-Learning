package Lecture_2;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double n1 = scanner.nextDouble();
        System.out.print("Enter number 2: ");
        double n2 = scanner.nextDouble();
        System.out.print("Enter number 3: ");
        double n3 = scanner.nextDouble();

        double average = ((n1+n2+n3)/3);
        System.out.print("The average of "+n1+" "+n2+" "+n3+" is ");
        //System.out.format("%.2f", average); //Is the same
        System.out.printf("%.2f", average);
    }
}
