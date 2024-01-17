// Created by YapWH On 14/1/2024 4:41 PM

package Lecture_17;

public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return super.toString() + "\nwidth is " + width + " and height is " + height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            return width == ((Rectangle) obj).width && height == ((Rectangle) obj).height;
        }
        return false;
    }
}
