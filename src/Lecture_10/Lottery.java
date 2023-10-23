package Lecture_10;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of digits to guess");
        int place = scanner.nextInt();

        String lottery = "" + (int)(Math.random() * Math.pow(10, place));

        System.out.printf("Enter your pick (%d digits): ", place);
        String pick = scanner.next();

        int same_count = 0;
        int odd_count = 0;

        for(int i=0; i<lottery.length(); i++){
            if(lottery.charAt(i) == pick.charAt(i)){
                same_count ++;
                continue;
            }
            for(int j=0; j<pick.length(); j++){
                if(lottery.charAt(i)==pick.charAt(j)){
                    odd_count ++;
                    continue;
                }
            }
        }

        System.out.printf("\nThe lottery number is %d and your pick is %d\n", Integer.parseInt(lottery), Integer.parseInt(pick));
        if(same_count == lottery.length())System.out.println("You will $10,000");
        else if(odd_count == lottery.length())System.out.println("You win $5,000");
        else if((odd_count+same_count) > 1)System.out.println("You win $1,000");
        else System.out.println("No match");
    }
}
