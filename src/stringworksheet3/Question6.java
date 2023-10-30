package stringworksheet3;
//Input a String and print only those which start with b
public class Question6 {
    public static void main(String[] args) {
        String orgWord = "Buried seeds may gro,but buried talents never";
        String newWord = orgWord + " ";
        int d = -1;
        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                String word = newWord.substring(d+1,i);
                if(word.charAt(0)=='b'||(word.charAt(0)=='B')){
                    System.out.println(word);
                }
                d = i;
            }
        }
    }
}
