package stringworksheet3;
//Input a String and print the shortest word
public class Question4 {
    public static void main(String[] args) {
        String orgWord = "Perseverance, conscientiousness, and supercalifragilisticexpialidociousness are attributes indispensable for mastering intricate web development frameworks.";
        String newWord = orgWord + " ";
        int d = 0;
        int min = 9;
        String shortestWord = null;

        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                String word = newWord.substring(d,i);
                if(word.length()<min){
                    shortestWord = word;
                }
                d=i;
            }
        }
        System.out.println("The shortest Word is '"+shortestWord.trim()+"'.");
    }
}
