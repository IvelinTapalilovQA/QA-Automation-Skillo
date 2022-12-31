package loops;

public class ArrayDivisible {
    public static void main(String[] args) {

        int divisor = 5;
        int[] arrayOfNumbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int currentNumber : arrayOfNumbers) {
            if (currentNumber % divisor == 0) {
                System.out.println(currentNumber);
                if (currentNumber > 150) {
                    break;
                }
            }
        }
    }
}