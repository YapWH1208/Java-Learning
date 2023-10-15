package Lecture_5;

import java.util.Scanner;

public class SentinelValue2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play Additional Quiz?(Insert Y to continue)");
        char confirmation = scanner.next().charAt(0);

        while(confirmation == 'Y'||confirmation =='y'){
            int num1 = (int)(Math.random()*100);
            int num2 = (int)(Math.random()*100);

            System.out.printf("What is the sum of %d and %d\n", num1, num2);
            int ans = scanner.nextInt();

            while(ans != num1 + num2){
                System.out.println("Too Bad, you're wrong");
                System.out.println("Please try again");
                ans = scanner.nextInt();
            }

            System.out.println("Do you want to play Additional Quiz?(Insert Y to continue)");
            confirmation = scanner.next().charAt(0);
        }

        System.out.println("Bye bye");
        System.out.println("（ ᗜ ‸ ᗜ ）");
        System.out.println("ጿ ኈ ቼ ዽ ጿ ኈ ቼ ዽ ጿ ኈ");
    }
}
