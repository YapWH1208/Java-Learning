package Lecture_15;

public class TestCircleRectangle {
    public static void main(String[] args){
        Circle c1 = new Circle(1);
        color_string_circle(c1);

        Rectangle r1 = new Rectangle(2,4);
        color_string_circle(r1);
    }

    public static void color_string_circle(GeometricObject c){
        // Able to read the override method in the child class
        System.out.println("A shape " + c.toString());
        System.out.println("The color is " + c.getColor());
        System.out.println();
    }
}
