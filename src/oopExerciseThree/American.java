package oopExerciseThree;

public class American extends Person {
    public American(String firstName, String lastName, String sex, String religion, String language, String job, String nationality, Long egn, String country) {
        super(firstName, lastName, sex, religion, "English", job, "American", egn, country);
    }

   public void driveCar(){
        System.out.println("I driving my Mustang!");
   }
}
