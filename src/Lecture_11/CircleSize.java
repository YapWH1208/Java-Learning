package Lecture_11;

public class CircleSize {
    public static void main(String[] args){
        Circle Circle1 = new Circle(50);
        Circle Circle2 = new Circle(20);
        Circle Circle3 = new Circle();

        System.out.printf("%.2f %.2f %.2f\n",Circle1.getArea(), Circle2.getArea(), Circle3.getArea());
        System.out.printf("%.2f %.2f %.2f", Circle1.getPerimeter(), Circle2.getPerimeter(), Circle3.getPerimeter());
    }
}

class Circle{
    double radius;

    // Constructor
    Circle(){radius = 1;}
    Circle(double rad){radius = rad;}

    // Getter & Setter
    double getRadius() {return radius;};
    void setRadius(double radius) {this.radius = radius;}

    // Method
    double getArea(){return Math.PI * Math.pow(this.radius, 2);}
    double getPerimeter(){return 2 * Math.PI * this.radius;}


}
