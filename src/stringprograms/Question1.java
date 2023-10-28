package stringprograms;

import java.util.Scanner;

//Input a String and print each character in a separate line
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = sc.nextLine();

        int length = word.length();
        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            System.out.println(ch);
        }
    }
}
