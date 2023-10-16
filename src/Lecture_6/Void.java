package Lecture_6;

public class Void {
    public static void main(String[] args){
        printGrade(99);
    }

    public static void printGrade(int i){
        if(i >= 90)System.out.println('A');
        else if(i>=80)System.out.println('B');
        else if(i>=70)System.out.println('C');
        else if(i>=60)System.out.println('D');
        else System.out.println('F');
    }
}
