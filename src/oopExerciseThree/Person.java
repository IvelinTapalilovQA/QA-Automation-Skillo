package oopExerciseThree;

import java.time.LocalDate;

public class Person {

    private final  String firstName;
    private final String lastName;
    private final String religion;
    private final String language;
    private final String nationality;
    private String job;
    private String sex;
    private String birthDate;
    private  String country;
    private int age;
    private Long egn;


    public Person(String firstName,String lastName, String sex, String religion, String language, String job, String nationality, Long egn, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.religion = religion;
        this.language = language;
        this.nationality = nationality;
        this.job = job;
        setSex(sex);
        setEgn(egn);
        setAge(egn);
        setBirthDate(egn);
        setCountry(country);
    }

    private void setBirthDate(Long egn) {
        String month = Long.toString(egn).substring(2, 4);
        String day = Long.toString(egn).substring(4, 6);

        this.birthDate = day + "-" + month;
    }

    private void setAge(Long egn) {
        String ageString = "19" + Long.toString(egn).substring(0, 2);
        int currentYear = LocalDate.now().getYear();
        this.age = currentYear - Integer.parseInt(ageString);

    }

    private void setEgn(Long egn) {
        int lengthEgn = Long.toString(egn).length();

        if (lengthEgn == 10) {
            this.egn = egn;
        } else {
            throw new RuntimeException("The provided EGN is not with a valid length!The egn must be with a length of only 10 digits!");
        }
    }

    private void setSex(String sex) {
        try {
            validateSex(sex);
            this.sex = sex;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void validateSex(String sex) throws Exception {
        String male = "Male";
        String female = "Female";

        if (!sex.equalsIgnoreCase(male) && !sex.equalsIgnoreCase(female)) {
            throw new Exception("The provided sex is not valid!The sex field must contain only two options 'Male' or 'Female'!");
        }
    }

    public void SayHello() {
        System.out.println("Hello");
    }

    public void celebrateEaster() {
        if (religion.equalsIgnoreCase("orthodox") || religion.equalsIgnoreCase("catholic")) {
            System.out.println("Im celebrating Easter!");
        }
        else  {
            System.out.println("I not celebrating Easter!");
        }
    }

    public boolean isAdult(){
        return switch (country) {
            case "Bulgaria", "Italy" -> age >= 18;
            case "USA" -> age >= 21;
            default -> throw new RuntimeException("Sorry!We don't have information about this country!");
        };

    }

    public  boolean isSuitableForLoan(){
        return job != null;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
