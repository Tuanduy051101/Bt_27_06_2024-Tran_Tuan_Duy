package bt3;

import java.util.Scanner;

public class BT3 {
    public static int getFirstNumberInNumbers(int number) {
        while (number >= 10 || number <= -10) {
            number /= 10;
        }
        return number;
    }

    public static void main(String[] args) {
        int myNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a negative integer or positive integer: ");
        myNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Extracting the first number from the given integer: " + getFirstNumberInNumbers(myNumber));

    }
}
