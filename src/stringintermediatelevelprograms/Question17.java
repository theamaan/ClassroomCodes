package stringintermediatelevelprograms;
// Input a name in the following format Amaan Ullah Ansari :- Ansari
public class Question17 {
    public static void main(String[] args) {
        String orgName = "Amaan Ullah Ansari";

        // Trim the input string to remove leading and trailing spaces
        // As the User might accidentally write spaces in the end of the last name
        orgName = orgName.trim();

        //The logic is wherever the last space is after the middle name there,
        //from there just take the word till the end.
        int lastIndex = orgName.lastIndexOf(" ");
        int length = orgName.length();

        // Extract the last name using substring
        //The substring method is used to extract a portion of a string based on specified start and end indices.
        String name = orgName.substring(lastIndex + 1, length);

        System.out.println(name);
    }
}