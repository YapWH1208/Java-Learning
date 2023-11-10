package Lecture_13;

public class PassObject {
    public static void main(String[] args){
        Circle c1 = new Circle(12);
        int n = 5;
        printAreas(c1, n);
    }

    public static void printAreas(Circle C, int times){
        System.out.println("Radius\t\tArea");
        while(times >= 1){
            System.out.println(C.getRadius() + "\t\t" + C.getArea());
            C.setRadius(C.getRadius() + 1);
            times --;
        }
    }
}
