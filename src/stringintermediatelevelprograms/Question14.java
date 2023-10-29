package stringintermediatelevelprograms;
//Input a String that print the count of words that ends with vowel
public class Question14 {
    public static void main(String[] args) {
        String orgWord = "To see what is right and not to do it, is want of courage";
        String newWord = orgWord + " ";
        int count=0;
        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                char character = newWord.charAt(i-1);
                if(character =='a'||character =='e'||character =='i'||character =='o'||character =='u'){
                    count++;
                }
            }
        }
        System.out.println("The count of words that ends with vowel "+ count);
    }
}
