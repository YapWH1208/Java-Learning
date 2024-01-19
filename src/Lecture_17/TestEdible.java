// Created by YapWH On 14/1/2024 4:44 PM

package Lecture_17;

public class TestEdible {
    public static void main(String[] args){
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        for (Object object : objects){
            if (object instanceof Edible){
                System.out.println(((Edible) object).howToEat());
            }
            if (object instanceof Animal){
                System.out.println(((Animal) object).sound());
            }
        }
    }
}
