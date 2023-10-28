package stringprograms;
import java.util.Scanner;

//Input a String and print only the alphabets present in the string
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(Character.isAlphabetic(ch)){
                System.out.println(ch);
            }
        }
    }
}
