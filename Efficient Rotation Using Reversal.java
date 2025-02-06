import java.util.Arrays;

public class ArrayRotationEfficient {
    
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void rotateArray(int[] arr, int n, int k) {
        k = k % n;  // Handle cases where k >= n
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
        reverseArray(arr, 0, n - 1);
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2;

        System.out.println("Original Array: " + Arrays.toString(arr));

        rotateArray(arr, n, k);

        System.out.println("Array after " + k + " rotations: " + Arrays.toString(arr));
    }
}
