package Lecture_12;

public class Circle {
    double radius;
    // Shared through all objects in the class
    static int numberOfObjects = 0;

    Circle(){}
    Circle(double newRadius){
        this.radius = newRadius;
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    double getArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
