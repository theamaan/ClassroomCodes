package stringprograms;

import java.util.Scanner;

// Input a String and print only the Capital letters present in String
public class Question6 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word");
        String word = sc.nextLine();

        int length = word.length();
        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            if(Character.isAlphabetic(ch) && Character.isUpperCase(ch)){
                System.out.println(ch);
            }
        }
    }
}