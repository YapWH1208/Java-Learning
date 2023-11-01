package Lecture_11;

public class Random {
    public static void main(String[] args){
        java.util.Random rand = new java.util.Random(3);
        for(int i=0; i<10; i++){
            System.out.print(rand.nextInt(1000)+" ");
        }
        System.out.println();

        java.util.Random rand2 = new java.util.Random(3);
        for(int i=0; i<10; i++){
            System.out.print(rand2.nextInt(1000)+" ");
        }
    }
}
