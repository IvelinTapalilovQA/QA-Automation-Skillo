package oopExerciseThree;

public class Bulgarian extends Person{

    public Bulgarian(String firstName, String lastName, String sex, String religion, String language, String job, String nationality, Long egn, String country) {
        super(firstName, lastName, sex, religion, "Bulgarian", job, "Bulgarian", egn, country);
    }

    @Override
    public void SayHello() {
        System.out.println("Здравей!");
    }
    public void cookingBanitza(){
        System.out.println("Приготвям Баница!");
    }
}
