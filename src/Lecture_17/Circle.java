// Created by YapWH On 14/1/2024 4:40 PM

package Lecture_17;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

//    @Override
//    public double getArea() {
//        return radius * radius * Math.PI;
//    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

    @Override
    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            return radius == ((Circle) obj).radius;
        }
        return false;
    }
}
