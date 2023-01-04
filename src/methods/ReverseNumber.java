package methods;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int result = reverseString(number);
        System.out.println(result);
    }
    public static int reverseString(int number){
        int reversedNumber = 0;

        while (number != 0){
           int lastNumber = number % 10;
           reversedNumber = (reversedNumber * 10) + lastNumber;
           number = number / 10;
        }
    return reversedNumber;
    }
}
