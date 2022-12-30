package loops;

import java.util.Scanner;

public class EligibleToWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageInput = scanner.nextInt();

        if (ageInput > 0 && ageInput < 16) {
            System.out.println("You are not eligible to work!");
        } else if (ageInput >= 16 && ageInput <= 62) {
            System.out.println("You are eligible to work!");
        } else if (ageInput > 58 && ageInput <= 105) {
            System.out.println("You are retired!");
        } else {
            System.out.println("Invalid age!");
        }
    }
}
