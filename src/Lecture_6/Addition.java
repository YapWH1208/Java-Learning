package Lecture_6;

public class Addition {
    public static void main(String[] args){
        System.out.println(addition(50));
        System.out.println(addition2(50,435,7,234,7,78,79,23423,7890,780));
    }

    public static int addition(int i){
        if(i == 1)return 1;
        return i+addition(i-1);
    }

    public static int addition2(int... i ){
        int sum = 0;
        for(int j:i)sum += j;
        return sum;
    }
}
