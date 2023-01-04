package oopExerciseTwo;

public class Employee {

    int id;
    String firstName;
    String lastName;
    int salary;


    Employee(int id, String firstName, String lastName) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public int getId() {
        return  id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAnnualSalary(int salary) {
        return salary * 12;
    }

    public int raiseSalary(int percentage) {
        return salary + salary / 100 * percentage;
    }

    @Override
    public String toString() {
        return "Employee id - " + id + ", Employee full name - " + firstName + " " + lastName + ", " + "Employee salary - " + salary + " BGN";
    }
}
