import java.util.Arrays;

public class commonElement{
    public static void main(String[] args) {
        int[] arr1 = {8, 4, 9, 1, 5};
        int[] arr2 = {7, 5, 2, 4, 8};

        System.out.println("Common elements between arrays:");
        findCommonEle(arr1, arr2);
    }

    public static void findCommonEle(int[] arr1, int[] arr2) {
        // Sort both arrays to find common ele
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        // Traverse both arrays simultaneously
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {

                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                
                i++;
            } else {
            
                j++;
            }
        }
    }
}
