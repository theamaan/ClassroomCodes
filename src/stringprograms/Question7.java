package stringprograms;

import java.util.Scanner;

//Input a String and print only small letters present in the string
public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Word");
        String word = scanner.nextLine();

        int length = word.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                count++;
                System.out.println("The Small letter is "+ch);
            }
        }
        System.out.println("The Count of small letter is "+count);
}
}
