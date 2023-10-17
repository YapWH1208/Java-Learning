package Lecture_7;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] list1 = new double[5];
        for(int i=0; i<list1.length; i++){
            System.out.println("Enter value "+(i+1));
            list1[i] = scanner.nextDouble();
        }

        double[] list2 = new double[5];
        for(int i=0; i<list1.length; i++){
            list2[i] = list1[i];
        }

        for(double v:list2) {
            System.out.print(v + " ");
        }

    }
}
