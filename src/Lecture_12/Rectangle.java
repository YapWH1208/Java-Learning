package Lecture_12;

public class Rectangle {
    double width = 1;
    double height = 1;

    Rectangle(){}
    Rectangle(double newWidth, double newHeight){
        this.width = newWidth;
        this.height = newHeight;
    }

    double getArea(){
        return this.width * this.height;
    }
    double getPerimeter(){
        return 2*this.width + 2*this.height;
    }
}
