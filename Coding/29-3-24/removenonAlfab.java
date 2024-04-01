public class removenonAlfab {
   
        public static void main(String[] args) {
            String str = "master of philosphy2618,,,cupcakes";
    
            // Remove all characters except alphabets
            String result = str.replaceAll("[^a-zA-Z]", "");
    
            System.out.println("Original string: " + str);
            System.out.println("String with only alphabets: " + result);
        }
    }
    
