package oopExerciseOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value for side: ");
        int sideValue = scanner.nextInt();

        System.out.println("Enter value for radius: ");
        int radiusValue = scanner.nextInt();

        Square square = new Square();
        System.out.println(square.getArea(sideValue));
        System.out.println(square.getPerimeter(sideValue));

        Circle circle = new Circle();
        System.out.println(circle.getArea(radiusValue));
        System.out.println(circle.getPerimeter(radiusValue));
    }
}
