package stringprograms;

import java.util.Scanner;

// Input a String and print the count of the digits present in the String
public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String word = sc.nextLine();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(Character.isDigit(ch)){
                count++;
            }
        }
        System.out.println("The Count of the digits present in the String is "+count);
    }
}
