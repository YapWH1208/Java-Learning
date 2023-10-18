package Lecture_7;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        System.out.println(Arrays.toString(selectionSort(new int[]{3,4,1,1,2,3,5,8})));
    }

    public static int[] selectionSort(int[] list){
        if(list.length==0)return new int[0];
        int count = 0;
        for(int i=0;i<list.length-1; i++){
            for(int j=i+1;j< list.length;j++){
                if(list[i]>list[j]){
                    int temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                    count ++;
                }
            }
        }
        System.out.println(count);
        return list;
    }
}
