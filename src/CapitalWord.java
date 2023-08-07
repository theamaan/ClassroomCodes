public class CapitalWord {
    public static void main(String[] args) {
        String org_Word="I want to learn java";
        char cap_Word=org_Word.charAt(10);
        char uppercaseChar = Character.toUpperCase(cap_Word);
        String modified_Word=org_Word.substring(11,15);
        System.out.println(uppercaseChar+modified_Word);
    }
}