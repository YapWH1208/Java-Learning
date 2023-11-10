package Lecture_13;

public class Circle {
    private double radius;
    private static int numberOfObjects = 0;

    public Circle(){
        this(1.0); // Call constructor Circle(1.0)
        numberOfObjects ++;
    }
    public Circle(double radius){
        this.radius = radius;
        numberOfObjects ++;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = (radius>=0)?radius:0;
    }
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
}
