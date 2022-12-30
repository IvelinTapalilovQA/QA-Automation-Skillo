package loops;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("The " + day + "-st day of the week is Monday!");
            case 2 -> System.out.println("The " + day + "-nd day of the week is Tuesday!");
            case 3 -> System.out.println("The " + day + "-rd day of the week is Wednesday!");
            case 4 -> System.out.println("The " + day + "-th day of the week is Thursday!");
            case 5 -> System.out.println("The " + day + "-th day of the week is Friday!");
            case 6 -> System.out.println("The " + day + "-th day of the week is Saturday!");
            case 7 -> System.out.println("The " + day + "-th day of the week is Sunday!");
            default -> System.out.println("Invalid digit");
        }
    }
}

