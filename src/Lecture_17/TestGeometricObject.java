// Created by YapWH On 14/1/2024 4:40 PM

package Lecture_17;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject geo1 = new Circle(5);
        GeometricObject geo2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? " + equalArea(geo1, geo2));

        displayGeometricObject(geo1);
        displayGeometricObject(geo2);
    }

    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
