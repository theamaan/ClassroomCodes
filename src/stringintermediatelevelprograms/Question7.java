package stringintermediatelevelprograms;
// Input a String and convert the capital letters to small and vice-versa
public class Question7 {
    public static void main(String[] args) {
        String orgWord = "Faith Is The Force Of Life";
        for (int i = 0; i < orgWord.length(); i++) {
            char ch = orgWord.charAt(i);
            if(Character.isUpperCase(ch)){
                System.out.print(Character.toLowerCase(ch));
            }
            if(Character.isLowerCase(ch)){
                System.out.print(Character.toUpperCase(ch));
            }
            if(!Character.isLetterOrDigit(ch)){
                System.out.print(ch);
            }
        }
    }
}
