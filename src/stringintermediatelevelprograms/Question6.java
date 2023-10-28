package stringintermediatelevelprograms;
//Input a String power and convert it into lksan
public class Question6 {
    public static void main(String[] args) {
        String orgWord = "power";
        StringBuilder convertedWord = new StringBuilder();
        for (int i = 0; i < orgWord.length(); i++) {
            char ch = orgWord.charAt(i);
            convertedWord.append((char)(ch-4));
        }
        System.out.print(convertedWord);
    }
}
