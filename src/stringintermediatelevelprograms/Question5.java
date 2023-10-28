package stringintermediatelevelprograms;
//Convert  Post into Ihlm
public class Question5 {
    public static void main(String[] args) {
        String orgWord="Post";
        for (int i = 0; i < orgWord.length(); i++) {
            char ch = orgWord.charAt(i);
            System.out.print((char)(ch-7));
        }
    }
}
