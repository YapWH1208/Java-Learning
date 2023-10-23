package Lecture_10;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of string: ");
        String str = scanner.nextLine();
        System.out.printf("There are %d letter", countLetters(str));
    }

    public static int countLetters(String s){
        //return s.replace(" ","").length();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))) count++;
        }
        return count;
    }
}
