package Lecture_6;

public class Max {
    public static int max(int i, int j){
        if(i>j)return i;
        else return j;
    }

    public static void main(String[] args){
        int a = 1;
        int b = 2;
        System.out.println(max(a,b));
    }
}
