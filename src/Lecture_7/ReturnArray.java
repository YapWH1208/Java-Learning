package Lecture_7;

import java.util.Arrays;

public class ReturnArray {
    public static void main(String[] args){
        int[] old = {4,5,6,7,2};

        System.out.println(Arrays.toString(copy(old)));
    }

    public static int[] copy(int[] list){
        int[] newList = new int[list.length];

        for(int i=0; i<list.length; i++){
            newList[i] = list[i];
        }

        return newList;
    }
}
