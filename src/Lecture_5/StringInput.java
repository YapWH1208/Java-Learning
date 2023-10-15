package Lecture_5;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Read till space
        //String input = scanner.next();
        //System.out.println(input);
        
        String inputline = scanner.nextLine();
        System.out.println(inputline);
    }
}
