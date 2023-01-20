package oopExerciseThree;

import java.util.ArrayList;

public class Italian extends Person {
    public Italian(String firstName, String lastName, String sex, String religion, String language, String job, String nationality, Long egn, String country) {
        super(firstName, lastName, sex, religion, "Italian", job, "Italian", egn, country);
    }

    @Override
    public void SayHello() {
        System.out.println("Ciao");
    }

    public void polishingCar(){
        System.out.println("Polishing my Ferrari!");
    }
}
