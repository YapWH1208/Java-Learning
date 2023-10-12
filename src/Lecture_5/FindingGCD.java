package Lecture_5;

import java.util.Scanner;

public class FindingGCD {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number to find the GCD: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = 1;
        for(int k=2;k<=num1&&k<=num2;k++){
            if(num1%k==0&&num2%k==0)gcd=k;
            k++;
        }

        System.out.printf("The GCD of number %d and number %d is %d", num1, num2, gcd);
    }
}
