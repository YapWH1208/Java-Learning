package Lecture_12;

import java.util.Random;

public class TestStopwatch {
    public static void main(String[] args){
        Stopwatch watch = new Stopwatch();
        Random rand = new Random();

        int size = 1_000_000;
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = rand.nextInt(size);
        }

        for(int i=0; i<50; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        watch.start();
        selectionSort(arr);
        watch.stop();
        watch.getElapsedTime();
        System.out.println();

        for(int i=0; i<50; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] selectionSort(int[] list){
        if(list.length==0) return new int[0];
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
