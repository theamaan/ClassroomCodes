package stringprograms;

import java.util.Scanner;

//Input a String and print the ASCII value of each of the character along with the character
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.nextLine();

        int length = word.length();
        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            System.out.println("The Character is "+ch);
            System.out.println("The ASCII value is "+(int)ch);
        }
    }
}
