package Lecture_5;

public class Break {
    public static void main(String[] args){
        int sum=0;
        int number=0;

        while(number<20){
            sum += number;
            number ++;
            if(sum > 100)break;
        }
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
