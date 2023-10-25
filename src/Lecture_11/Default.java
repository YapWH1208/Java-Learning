package Lecture_11;

public class Default {
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println(s1.name+" "+s1.age+" "+s1.isScienceMajor+" "+s1.gender);
    }
}

class Student{
    String name;//null
    int age;//0
    boolean isScienceMajor;//false
    char gender;//'\u0000'
}
