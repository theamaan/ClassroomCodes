package stringintermediatelevelprograms;
// Amaan Ullah Ansari :- A.U.Ansari
public class Question18 {
    public static void main(String[] args) {
        String fullName = "Amaan Ullah Ansari";

        String[] words = fullName.split(" "); // Split the full name into individual words
//        System.out.println(Arrays.toString(words) ); The output :- [Amaan, Ullah, Ansari]

        StringBuilder initials = new StringBuilder();
//        System.out.println(words.length ); The output :- 3

        for (int i = 0; i < words.length; i++) { //Here the value of words.length is 3
//            System.out.print(words[3]); The output :- ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            if (!words[i].isEmpty()) {
                if (i < words.length - 1) {
                    initials.append(words[i].charAt(0)).append(".");
                } else {
                    initials.append(words[i]);
                }
            }
        }

        System.out.println(initials);
    }
}
