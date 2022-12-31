package loops;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the destination: ");
        String vacationType = scanner.nextLine();

        if (vacationType.equals("Beach")) {
            System.out.println("Enter budget per person: ");
            int budget = scanner.nextInt();

            if (budget > 0 && budget < 50) {
                System.out.println("You can go to holiday in Golden sands or Sunny beach?");
            } else if (budget > 50)
                System.out.println("You can go to holiday in Maldivi sands or Bali?");
        } else if (vacationType.equals("Mountain")) {
            System.out.println("Enter budget per person: ");
            int budget = scanner.nextInt();

            if (budget > 0 && budget < 30) {
                System.out.println("You can go to holiday in Borovets or Bansko?");
            } else if (budget > 30) {
                System.out.println("You can go to holiday in Swiss Alps or Mount Everest?");
            }
        } else {
            System.out.println("Invalid destination!");
        }
    }
}
