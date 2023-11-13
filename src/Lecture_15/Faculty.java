package Lecture_15;

public class Faculty extends Employee{
    public static void main(String[] args){
        new Faculty();
    }

    public Faculty(){
        System.out.println("Faculty");
    }
}

class Employee extends Person{
    public Employee(){
        this("Overloading Employee constructor");
        System.out.println("Employee");
    }

    public Employee(String s){
        System.out.println(s);
    }
}

class Person{
    public Person(){
        System.out.println("Person");
    }
}
