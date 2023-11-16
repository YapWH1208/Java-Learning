// Created by YapWH On 9/11/2023 9:20 AM

package Lecture_15;

public class OverrideOverload {
    public static void main(String[] args){
        B b = new B();
        b.p(3);
        b.p(3.0);
    }
}

class A{
    public void p(double i){
        System.out.println(i * 2);
    }
}

class B extends A{
    // Override with same param but different content
    @Override
    public void p(double i){
        System.out.println(i + 1);
    }

    // Overload with different param
    public void p(int i){
        System.out.println(i);
    }
}
