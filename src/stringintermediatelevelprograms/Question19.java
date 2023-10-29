package stringintermediatelevelprograms;
//Amaan Ullah Ansari :- A U Ansari
public class Question19 {
    public static void main(String[] args) {
        String orgWord = "Amaan Ullah Ansari";
        String[] split = orgWord.split(" ");
        StringBuilder initials = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            if(!split[i].isEmpty()){
                if (i<split.length-1){
                    initials.append(split[i].charAt(0)).append(" ");
                }
                else{
                    initials.append(split[i]);
                }
            }
        }
        System.out.println(initials);
    }
}
