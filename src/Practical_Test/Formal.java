// Created by YapWH On 23/11/2023 9:01 AM

package Practical_Test;

import java.util.Scanner;

public class Formal {
    public static void main(String[] args){
        menu();
    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        int[][] arr1 = {{3,2,1},{4,5,6}};
        int[][] arr2 = {{4,5,6},{1,2,3}};

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
                    arr1 = firstArray();
                    break;
                case 2:
                    arr2 = secondArray();
                    break;
                case 3:
                    arr1 = sortFirst(arr1);
                    break;
                case 4:
                    arr2 = sortSecond(arr2);
                    break;
                case 5:
                    searchFirst(arr1);
                    break;
                case 6:
                    searchSecond(arr2);
                    break;
                case 7:
                    compare(arr1, arr2);
                    break;
                case 8:
                    displayArray(arr1, arr2);
                    break;
                case 9:
                    exit();
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    public static int[][] firstArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the first array: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of columns for the first array: ");
        int column = scanner.nextInt();
        int[][] array1 = new int[row][column];

        System.out.println("Enter the integers for the first array(seperated by spaces): ");
        for (int i=0; i<array1.length; i++){
            for(int j=0; j< array1[i].length; j++){
                array1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Integers added to the first array");

        return array1;
    }

    public static int[][] secondArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the second array: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of columns for the second array: ");
        int column = scanner.nextInt();
        int[][] array2 = new int[row][column];

        System.out.println("Enter the integers for the first array(seperated by spaces): ");
        for (int i=0; i<array2.length; i++){
            for(int j=0; j< array2[i].length; j++){
                array2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Integers added to the second array");

        return array2;
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

    public static int[][] sortFirst(int[][] array1){
        for (int i=0; i< array1.length; i++) {
            array1[i] = Sort(array1[i]);
        }
        System.out.println("Sorted");
        return array1;
    }

    public static int[][] sortSecond(int[][] array2){
        for (int i=0; i< array2.length; i++) {
            array2[i] = Sort(array2[i]);
        }
        System.out.println("Sorted");
        return array2;
    }

    public static void searchFirst(int[][] array1){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer to search for in the first array: ");
        int target = scanner.nextInt();
        for(int[] i : array1){
            for(int j : i){
                if(j == target){
                    System.out.println(target + " found in the first array");
                    return;
                }
            }
        }
        System.out.println(target + " not found in the first array");
        return;
    }

    public static void searchSecond(int[][] array2){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer to search for in the second array: ");
        int target = scanner.nextInt();
        for(int[] i : array2){
            for(int j : i){
                if(j == target){
                    System.out.println(target + " found in the second array");
                    return;
                }
            }
        }
        System.out.println(target + " not found in the second array");
        return;
    }

    public static void compare(int[][] arr1, int[][] arr2){
        for(int i=0; i<arr1.length&&1< arr2.length; i++){
            for(int j=0; j<arr1[i].length && j<arr2[i].length; j++){
                if(arr1.length!=arr2.length||arr1[i].length!=arr2[i].length){
                    System.out.println("Shape not equal");
                    return;
                }
                if(arr1[i][j] != arr2[i][j]){
                    System.out.println("Arrays are not equal!");
                    return;
                }
            }
        }
        System.out.println("Arrays are equal");
        return;
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

    public static void exit(){
        System.out.println("Exiting the program. Goodbye!");
        System.exit(0);
    }
}
