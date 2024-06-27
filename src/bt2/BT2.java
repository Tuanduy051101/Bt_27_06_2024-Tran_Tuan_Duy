package bt2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BT2 {

    public static boolean checkElementOfIntegerEven(int num) {
        List<Integer> list = new ArrayList<>();

        do {
            list.add(num % 10);
            num /= 10;
        }while (num > 0);

        return list.stream().allMatch(i -> i % 2 == 0);
    }

    public static void main(String[] args) {
        int myInteger;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer: ");

        myInteger = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Check whether all elements of the integer are even : " + checkElementOfIntegerEven(myInteger));
    }
}
