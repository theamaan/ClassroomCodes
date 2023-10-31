package stringworksheet3;
// Input a String and print only those String that contain more than one vowel
public class Question17 {
    public static void main(String[] args) {
        String orgWord = "To realize that God is all and all is God gives man courage";
        String newWord = orgWord + " ";

        int d = -1;
        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                String word = newWord.substring(d+1,i);
                int count = 0;// This ensures that count is reset to 0 for each new word, and it counts only the vowels in that specific word.
                for (int j = 0; j < word.length(); j++) {
                    char character = word.charAt(j);
                    if(character =='a'||character =='e'||character=='i'||character=='o'||character=='u'||character =='A'||character =='E'||character=='I'||character=='O'||character=='U'){
                        count++;
                    }
                    if(count>1){
                        System.out.print(word+ " ");
                        break;
                    }
                }
                d = i;
            }
        }
    }
}
