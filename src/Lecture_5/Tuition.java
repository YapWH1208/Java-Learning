package Lecture_5;

public class Tuition {
    public static void main(String[] args){
        double tuition = 10000;
        int year = 0;
        while(tuition <= 20000){
            tuition *= 1.07;
            year ++;
            System.out.printf("On year %d, the tuition fees is %.2f\n",year,tuition);
        }
        System.out.printf("On year %d, the tuition fees is over 20000 at %.2f", year, tuition);
    }
}
