package stringworksheet3;
//Input a String and print the longest word
public class Question3 {
    public static void main(String[] args) {
        String orgWord = "Perseverance, conscientiousness, and supercalifragilisticexpialidociousness are attributes indispensable for mastering intricate web development frameworks.";
        String newWord = orgWord + " ";
        int d = 0;
        int max = 0;
        String longestWord = null;

        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                String word = newWord.substring(d,i);
                if(word.length()>max){
                    longestWord = word;
                    max=longestWord.length();
                }
                d=i;
            }
        }
        System.out.println("The longest word in the given sentence is '"+longestWord.trim()+"'");
    }
}
