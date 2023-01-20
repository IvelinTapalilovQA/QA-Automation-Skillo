package oopExerciseThree;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivelin", "Tapalilov", "Male", "Christian", "Bulgarian", "QA", "Bulgarian", 9412131415L, "Bulgaria");
        Italian italian = new Italian("Claudia", "Febiano", "Female", "Catholic", "Italian", "accountant", "Italian", 9121345612L, "Italy");
        Child child = new Child("Ivan", "Petrov", "Male", "Orthodox", "Bulgarian", "Bulgarian", 9912141516L, "Bulgaria");
        American american = new American("Donald", "Trumb", "Male", "Catholic", "American", "Billionaire", "American", 5050214354L, "USA");
        Bulgarian bulgarian = new Bulgarian("Hatidzhe", "Caragonlu", "Female", "Islam", "Bulgarian", "stewardess", "Bulgarian", 7587214782L, "Bulgarian");

        peopleActions(person);
        peopleActions(italian);
        peopleActions(child);
        peopleActions(american);

        italian.polishingCar();
        bulgarian.cookingBanitza();
        american.driveCar();
        child.play("Lego");

    }

    private static void peopleActions(Person person) {
        System.out.println("Execute actions for class " + person.getClass().getSimpleName());

        person.SayHello();
        person.isAdult();
        person.celebrateEaster();
        person.isSuitableForLoan();
    }

}