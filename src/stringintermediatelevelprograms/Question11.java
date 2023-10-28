package stringintermediatelevelprograms;
//Input a String and count the number of words that start with consonants
public class Question11 {
    public static void main(String[] args) {
        String orgWord = "charity without fellow feeling is like sowing a fallow land";
        String newWord = " "+orgWord;
        int count=0;
        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                char character = newWord.charAt(i+1);
                if( character!='a' && character!='e' && character!='i' && character!='o' && character!='u'){
                    count++;
                }
            }
        }
        System.out.println("The Count of the number of words that start with consonants is "+count);
    }
}
