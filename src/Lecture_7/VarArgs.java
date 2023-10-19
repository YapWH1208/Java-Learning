package Lecture_7;

public class VarArgs {
    public static void main(String[] args){
        printMax(12,4,5,6,7,7,8765,3);
        printMax(new double[]{1,3,4,9,6});
    }

    public static void printMax(double... list){
        double max = Double.NEGATIVE_INFINITY;
        for(double i:list) if(i>max) max=i;
        System.out.println((int)max);
    }
}
