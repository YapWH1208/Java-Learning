package Lecture_3;

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the interest rate: ");
        float interestRate = scanner.nextFloat();
        System.out.print("Enter the loan amount: ");
        long loadAmount = scanner.nextLong();
        System.out.print("Enter the number of years to pay: ");
        float paymentYears = scanner.nextInt();

        double monthlyPayment = (loadAmount * interestRate) / (1 - (1 / Math.pow(1 + interestRate, paymentYears * 12)));
        double totalPayment = monthlyPayment * paymentYears * 12;

        System.out.printf("The monthly payment of the loan is %.2f", monthlyPayment);
        System.out.println();
        System.out.printf("The total payment of the loan is %.2f", totalPayment);
    }
}
