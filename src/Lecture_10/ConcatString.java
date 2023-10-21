package Lecture_10;

import java.util.Scanner;

public class ConcatString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = " Aiyo ";
        String str2 = "niganma";

        System.out.println(str1+", "+str2);
        System.out.println(str1.length() + " " + str2.length());
        // Trim the white spaces in the front and back
        System.out.println(str1.trim().length() + " " + str2.length());

//        System.out.println("Enter a sentence: ");
//        // Gets only a word
//        String str3 = scanner.next();
//        // Gets a whole sentence in a line
//        System.out.println("Enter a sentence: ");
//        scanner.nextLine();
//        String str4 = scanner.nextLine();
//
//        System.out.println(str3 + "\n" + str4);

        System.out.println(str1.compareTo(str2));
    }
}
