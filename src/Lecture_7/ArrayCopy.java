package Lecture_7;

public class ArrayCopy {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[5];
        int[] arr3 = new int[5];

        // Method 1
        for(int i=0; i<arr1.length; i++) arr2[i]=arr1[i];
        // Method 2
        System.arraycopy(arr1,0,arr3,0,5);

        for(int i:arr2)System.out.print(i);
        System.out.println();
        for(int i:arr3)System.out.print(i);
    }
}
