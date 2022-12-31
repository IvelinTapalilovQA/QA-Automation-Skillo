package loops;

public class ReverseTheArray {
    public static void main(String[] args) {

        int[] arrayOfNumber = {10, 20, 30, 40, 50};
        int currentStartingNumber;

        for (int i = 0; i < arrayOfNumber.length / 2; i++) {
            currentStartingNumber = arrayOfNumber[i];
            arrayOfNumber[i] = arrayOfNumber[arrayOfNumber.length - 1 - i];
            arrayOfNumber[arrayOfNumber.length - 1 - i] = currentStartingNumber;
        }
        for (int i : arrayOfNumber) {
            System.out.print(i + " ");
        }
    }
}
