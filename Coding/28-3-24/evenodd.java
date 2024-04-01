public class evenodd {
  
        public static void main(String[] args) {
            int[] arr = {11, 27, 36, 44, 52, 67, 76, 48, 29, 18}; 
    
            int evenCount = 0;
            int oddCount = 0;
    
            for (int num : arr) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
    
            System.out.println("Number of even integers: " + evenCount);
            System.out.println("Number of odd integers: " + oddCount);
        }
    }
    
