// Created by YapWH On 14/1/2024 4:49 PM

package Lecture_17;

public class Chicken extends Animal implements Edible{
    public Chicken() {
        super("Chicken");
    }

    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }

    @Override
    public String sound(){
        return "Chicken: cock-a-doodle-doo";
    }
}
