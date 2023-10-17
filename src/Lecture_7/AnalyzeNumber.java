package Lecture_7;

import java.util.Scanner;

public class AnalyzeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int number = scanner.nextInt();
        double[] list = new double[number];
        double sum = 0;

        System.out.println("Enter the numbers: ");
        for(int i=0; i<number; i++){
            list[i] = scanner.nextDouble();
            sum += list[i];
        }

        double average = sum / number;
        int count = 0;

        for(double i:list) if(i>average) count++;

        System.out.println("Average is " + average);
        System.out.println("There is " + count + " number in the list larger than the average");
    }
}
