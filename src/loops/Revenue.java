package loops;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int unitPrice = scanner.nextInt();
        int quantity = scanner.nextInt();
        int revenue = unitPrice * quantity;
        double discount = 0;
        double discountedAmount = 0;
        int discountPercentage = 0;

        if (quantity > 0 && quantity < 100) {
            discountedAmount = revenue - discount;
        }
        else if (quantity >= 100 && quantity <= 120) {
            discount = revenue * 0.15;
            discountedAmount = revenue - discount;
            discountPercentage = 15;
        }
        else if (quantity > 120) {
            discount = revenue * 0.20;
            discountedAmount = revenue - discount;
            discountPercentage = 20;
        }
    System.out.println("The revenue from sale: " + discountedAmount + "$");
    System.out.println("Discount: " + discount + "$" + " (" + discountPercentage + "%)");
    }
}