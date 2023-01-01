package loops;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter budget: ");
        int budget = scanner.nextInt();
        System.out.println("Enter count of people: ");
        int countOfPeople = scanner.nextInt();
        System.out.println("Enter count of days: ");
        int days = scanner.nextInt();
        System.out.println("Enter the destination: ");
        String vacationType = scanner.nextLine();
        int budgetPerDay = budget / (countOfPeople * days);


        if (vacationType.equals("Beach")) {

            if (budgetPerDay > 0 && budgetPerDay < 50) {
                System.out.println("You can go to holiday in Golden sands or Sunny beach?");
            } else if (budgetPerDay > 50)
                System.out.println("You can go to holiday in Maldivi sands or Bali?");
        } else if (vacationType.equals("Mountain")) {

            if (budgetPerDay > 0 && budgetPerDay < 30) {
                System.out.println("You can go to holiday in Borovets or Bansko?");
            } else if (budgetPerDay > 30) {
                System.out.println("You can go to holiday in Swiss Alps or Mount Everest?");
            }
        } else {
            System.out.println("Invalid destination!");
        }
    }
}
