package Lecture_12;

public class CircleSize {
    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println(c1.radius + " " + Circle.numberOfObjects);

        Circle c2 = new Circle(12);
        System.out.println(c2.radius + " " + Circle.numberOfObjects);

        Circle c3 = new Circle(34);
        System.out.println(c3.radius + " " + Circle.numberOfObjects);
    }
}
