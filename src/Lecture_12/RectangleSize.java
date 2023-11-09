package Lecture_12;

public class RectangleSize {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        Rectangle r3 = new Rectangle();

        System.out.println(r1.width+" "+r1.height+" "+r1.getArea()+" "+r1.getPerimeter());
        System.out.println(r2.width+" "+r2.height+" "+r2.getArea()+" "+r2.getPerimeter());
        System.out.println(r3.width+" "+r3.height+" "+r3.getArea()+" "+r3.getPerimeter());
    }
}
