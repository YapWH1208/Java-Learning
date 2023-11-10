package Lecture_13;

public class CircleArray {
    public static void main(String[] args){
        Circle[] cArray = new Circle[10];

        for (Circle circle : cArray) {
            circle.setRadius(Math.random() * 100);
        }

        for(Circle circle : cArray){
            System.out.println(circle.getArea());
        }
    }


}
