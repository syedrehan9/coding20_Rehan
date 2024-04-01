import java.util.Arrays;
public class removedupli {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5};
        System.out.println("Original array:");
        printArray(arr);

        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("\nArray after removing duplicates:");
        printArray(uniqueArr);
    }
    public static int[] removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr; 
        }
        Arrays.sort(arr); 
        int j = 0; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i]; 
            }
        }

        int[] uniqueArr = Arrays.copyOf(arr, j + 1);
        return uniqueArr;
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


