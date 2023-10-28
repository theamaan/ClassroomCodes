package stringintermediatelevelprograms;
//Input a String that converts Ace to Kmo
public class Question3 {
    public static void main(String[] args) {
        String originalWord = "Ace";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < originalWord.length(); i++) {
            char ch = originalWord.charAt(i);
            sb.append((char)(ch+10));
        }
        System.out.print(sb);
    }
}
