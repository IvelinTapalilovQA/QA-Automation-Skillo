package oopExerciseOne;

public class Square extends Shape {
    @Override
    double getArea(double side) {
        return side * side;
    }

    @Override
    double getPerimeter(double side) {
        return 4 * side;
    }
}