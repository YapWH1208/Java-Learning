package Lecture_3;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price: ");
        float price = scanner.nextFloat();
        float tax = price * (float) 0.06; // 0.06 is default as a double

        // Limiting the output digits
        System.out.println("The tax is " + (int)(tax * 100)/100.0);
        System.out.printf("The tax is %.2f", tax);
    }
}
