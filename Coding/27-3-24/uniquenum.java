import java.util.Arrays;
public class uniquenum {
     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9}; 
        printUniqueNum(arr);
    }

    public static void printUniqueNum(int[] arr) {
        Arrays.sort(arr);

        System.out.println("Unique no in array:");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
        }
    }
}


