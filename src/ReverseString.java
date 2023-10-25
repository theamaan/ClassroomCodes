public class ReverseString {
    public static void main(String[] args) {
        String word = "Hello this is a String";
        String empty = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            empty+=word.charAt(i);
        }
        System.out.println(empty);
    }
}
//***********************************************************
//While this code works, it's not the most efficient way to reverse a string due to the use of string concatenation within a loop. It creates a new string in each iteration, which can be computationally expensive for longer strings.
// Here's an optimized version using a StringBuilder:
//public class ReverseString {
//    public static void main(String[] args) {
//        String word = "Hello this is a String";
//        StringBuilder reversed = new StringBuilder(word).reverse();
//        System.out.println(reversed);
//    }
//}