package stringintermediatelevelprograms;
// Input a String FRIEND and get COFBKA as output
public class Question4 {
    public static void main(String[] args) {
        String orgWord = "FRIEND";
//        StringBuilder convertedWord = new StringBuilder();
//        for (int i = 0; i < orgWord.length(); i++) {
//            char character = orgWord.charAt(i);
//            convertedWord.append((char)(character-3));
//        }
//        System.out.println(convertedWord);
        for(int i=0;i<orgWord.length();i++){
            char ch = orgWord.charAt(i);
            System.out.print((char)(ch-3));
        }
    }
}
