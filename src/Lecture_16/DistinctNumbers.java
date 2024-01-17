// Created by YapWH On 14/1/2024 4:38 PM

package Lecture_16;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");

        int value;

        do {
            value = input.nextInt();

            if (!list.contains(value) && value != 0)
                list.add(value);
        } while (value != 0);

        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }
}
