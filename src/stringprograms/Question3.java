package stringprograms;

import java.util.Scanner;

//Input a String and print only the digit present in the string
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String word = sc.nextLine();

        int length = word.length();
        for(int i=0;i<length;i++){
            char ch = word.charAt(i);
            {if (Character.isDigit(ch)==true){System.out.println(ch);}}
        }
    }
}
