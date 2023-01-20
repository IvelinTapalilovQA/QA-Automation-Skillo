package oopExerciseThree;

public class Child extends Person{

    public Child(String firstName, String lastName, String sex, String religion, String language, String nationality, Long egn, String country) {
        super(firstName, lastName, sex, religion, language, null, nationality, egn, country);
    }

    @Override
    public boolean isAdult() {
        System.out.println("This child is not an adult!");
        return false;
    }

    @Override
    public void setJob(String job) {
        throw new IllegalArgumentException("The child cannot have right to work!");
    }

    @Override
    public boolean isSuitableForLoan() {
        System.out.println("The child can not a take loan!");
        return false;
    }

    public void play(String toy){
        System.out.println("This child play with " + toy);
    }

}
