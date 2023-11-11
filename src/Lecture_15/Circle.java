package Lecture_15;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
//        setColor(color);
//        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(Math.PI, 2) * radius;
    }
    public double getDiameter(){
        return 2 * Math.PI * radius;
    }
    public void printCircle(){
        System.out.println("This circle is created on " + getDateCreated() + " with radius " + radius);
    }
    @Override
    public String toString(){
        return super.toString() + "\nradius is " + radius;
    }
}
