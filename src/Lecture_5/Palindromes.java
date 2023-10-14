package Lecture_5;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.next();
        input = input.toLowerCase();

        int low = 0;
        int high = input.length()-1;
        boolean isPalindrome = true;

        while(low<high){
            if(input.charAt(low) != input.charAt(high)){
                isPalindrome = false;
                break;
            }
            low ++;
            high --;
        }

        if(isPalindrome)System.out.println(input + " is Palindrome");
        else System.out.println(input + " is not Palindrome");
    }
}
