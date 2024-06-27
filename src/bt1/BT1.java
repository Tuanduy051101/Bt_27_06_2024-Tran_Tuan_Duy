package bt1;

public class BT1 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 3, 0, 5, 0, 6};

        System.out.println("Original array:");
        printArray(arr);

        moveZerosToEnd(arr);

        System.out.println("\nAfter moving 0's to the end of the array:");
        printArray(arr);
    }

    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int index = 0;

        // Duyệt qua mảng và di chuyển các phần tử khác 0 về phía trước
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
                arr[i] = 0;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
