package stringintermediatelevelprograms;
// Amaan Ullah Ansari :- A U Ansari
public class Question20 {
    public static void main(String[] args) {
        String orgWord = "Amaan Ullah Ansari";
        String[] newWord = orgWord.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < newWord.length; i++) {
            if (!newWord[i].isEmpty()){
                if(i< newWord.length-1){
                    sb.append(newWord[i].charAt(0)).append(" ");
                }else{
                    sb.append(newWord[i]);
                }
            }
        }
        System.out.println(sb);
    }
}
