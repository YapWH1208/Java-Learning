package Lecture_7;

public class ValuePassing {
    public static void main(String[] args){
        int number = 1;
        int[] list = new int[10];

        func(number,list);

        System.out.println(number + " " + list[5]);
        // The value of the array can be changed even without returning the value
    }

    public static void func(int i, int[] list){
        i = 100;
        list[5] = 5;
    }
}
