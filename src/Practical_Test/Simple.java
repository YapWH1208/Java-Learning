// Created by YapWH On 23/11/2023 12:05 PM

package Practical_Test;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [][] arr1 = {{1,2,3},{4,5,6}};
        int [][] arr2 = {{4,5,6},{1,2,3}};

        System.out.println("\n\nArray Operations Menu:");
        System.out.println("1. Input integers into the first 2D array");
        System.out.println("2. Input integers into the second 2D array");
        System.out.println("3. Sort the first 2D array in ascending order");
        System.out.println("4. Sort the second 2D array in ascending order");
        System.out.println("5. Search for an integer in the first 2D array");
        System.out.println("6. Search for an integer in the second 2D array");
        System.out.println("7. Compare the two 2D arrays");
        System.out.println("8. Display the current state of both arrays");
        System.out.println("9. Exit");

        while(true){
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter the number of rows for the first array: ");
                    int row = scanner.nextInt();
                    System.out.print("Enter the number of columns for the first array: ");
                    int column = scanner.nextInt();
                    arr1 = new int[row][column];

                    System.out.println("Enter the integers for the first array(seperated by spaces): ");
                    for (int i=0; i<arr1.length; i++){
                        for(int j=0; j< arr1[i].length; j++){
                            arr1[i][j] = scanner.nextInt();
                        }
                    }
                    System.out.println("Integers added to the first array");
                    break;
                case 2:
                    System.out.print("Enter the number of rows for the second array: ");
                    row = scanner.nextInt();
                    System.out.print("Enter the number of columns for the second array: ");
                    column = scanner.nextInt();
                    arr2 = new int[row][column];

                    System.out.println("Enter the integers for the first array(seperated by spaces): ");
                    for (int i=0; i<arr2.length; i++){
                        for(int j=0; j< arr2[i].length; j++){
                            arr2[i][j] = scanner.nextInt();
                        }
                    }
                    System.out.println("Integers added to the second array");
                    break;
                case 3:
                    for (int i=0; i< arr1.length; i++) {
                        arr1[i] = Sort(arr1[i]);
                    }
                    System.out.println("Sorted");
                    break;
                case 4:
                    for (int i=0; i< arr2.length; i++) {
                        arr2[i] = Sort(arr2[i]);
                    }
                    System.out.println("Sorted");
                    break;
                case 5:
                    System.out.print("Enter the integer to search for in the first array: ");
                    int target = scanner.nextInt();
                    for(int[] i : arr1){
                        for(int j : i){
                            if(j == target){
                                System.out.println(target + " found in the first array");
                                break;
                            }
                        }
                    }
                    System.out.println(target + " not found in the first array");
                    break;
                case 6:
                    System.out.print("Enter the integer to search for in the second array: ");
                    target = scanner.nextInt();
                    for(int[] i : arr2){
                        for(int j : i){
                            if(j == target){
                                System.out.println(target + " found in the second array");
                                break;
                            }
                        }
                    }
                    System.out.println(target + " not found in the second array");
                    break;
                case 7:
                    for(int i=0; i<arr1.length&&1< arr2.length; i++){
                        for(int j=0; j<arr1[i].length && j<arr2[i].length; j++){
                            if(arr1.length!=arr2.length||arr1[i].length!=arr2[i].length){
                                System.out.println("Shape not equal");
                                break;
                            }
                            if(arr1[i][j] != arr2[i][j]){
                                System.out.println("Arrays are not equal!");
                                break;
                            }
                        }
                    }
                    System.out.println("Arrays are equal");
                    break;
                case 8:
                    displayArray(arr1, arr2);
                    break;
                case 9:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    public static int[] Sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[j]<arr[min])min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }


    public static void displayArray(int[][] array1, int[][] array2){
        System.out.println("Current state of the first array: ");
        for(int[] i : array1){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Current state of the second array: ");
        for(int[] i : array2){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    public static void displayArray(int[][] array){
        System.out.println("Current state of the array: ");
        for(int[] i : array){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
