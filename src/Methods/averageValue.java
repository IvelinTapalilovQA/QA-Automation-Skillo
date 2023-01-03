package Methods;

import java.util.Scanner;

public class averageValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        float numberOne = scanner.nextInt();

        System.out.println("Enter second number: ");
        float numberTwo = scanner.nextInt();

        System.out.println("Enter third number: ");
        float numberThree = scanner.nextInt();

        double result = computeAverageValue(numberOne,numberTwo,numberThree);

        System.out.println(result);
    }
    public static double computeAverageValue(float number1, float number2, float number3) {
        return (number1 + number2 + number3) / 3;
    }
}
