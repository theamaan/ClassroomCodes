package stringintermediatelevelprograms;
//Input a String that converts Java to Lcxc
public class Question1 {
    public static void main(String[] args) {
        String word = "Java";
        int length = word.length();
        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            int convert = (int)ch + 2;
            System.out.print((char)convert);
        }
    }
}
