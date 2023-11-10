package Lecture_13;

public class C {
    private int p;

    public C(){
        System.out.println("No args");
        //this(0); Must be on the first line
    }

    public C(int p){
        this.p = p;
    }

    public void setP(int p){
        this.p = p;
    }
}
