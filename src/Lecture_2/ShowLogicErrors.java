package Lecture_2;

public class ShowLogicErrors {
    public static void main(String[] args){
        System.out.print("Celsius 35 is Fahrenheit degree ");
        //System.out.println((9/5) * 35 +32); // 67(Wrong)
        System.out.println((9.0/5.0) * 35 +32); // 95(Correct)
    }
}
