package stringworksheet4;

public class Question4 {
    public static void main(String[] args) {
        joyString("amaan Ullah",'a','b');
        joyString("Hi");
        joyString("amaan","ullah");
    }
    public static void joyString(String s, char ch1,char ch2){
        String newWord = s.replace(ch1,ch2);
        System.out.println(newWord);
    }
    public static void joyString(String s){
        String inputValue = "Cloud computing means internet based computing";
        int firstIndexOf = inputValue.indexOf(" ");
        int lastIndexOf = inputValue.lastIndexOf(" ");
        System.out.println("The first index of space is: "+firstIndexOf);
        System.out.println("The last index of space is: "+lastIndexOf);
    }
    public static void joyString(String s1, String s2){
        String firstWord = "COMMON WEALTH ";
        String lastWord = "GAMES";
        System.out.println(firstWord.concat(lastWord));
    }
}
