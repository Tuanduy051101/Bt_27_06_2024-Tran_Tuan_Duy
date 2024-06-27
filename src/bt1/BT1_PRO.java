package bt1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BT1_PRO {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 5, 0, 6};

        System.out.println("Original array:");
        printArray(arr);

        arr = moveZerosToEnd(arr);

        System.out.println("After moving 0's to the end of the array:");
        printArray(arr);
    }

    public static int[] moveZerosToEnd(int[] arr) {
        // Đếm số lượng số 0 trong mảng
        long zeroCount = Arrays.stream(arr).filter(num -> num == 0).count();

        // Lọc các phần tử khác 0 và chuyển chúng vào một mảng mới
        int[] result = Arrays.stream(arr)
                .filter(num -> num != 0)
                .toArray();

        // Tạo một mảng mới với kích thước ban đầu và sao chép các phần tử khác 0 vào
        int[] finalResult = new int[arr.length];
        System.arraycopy(result, 0, finalResult, 0, result.length);

        // Điền các số 0 vào các vị trí còn lại
        Arrays.fill(finalResult, result.length, arr.length, 0);

        return finalResult;
    }

    public static void printArray(int[] arr) {
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
        System.out.println();
    }
}
