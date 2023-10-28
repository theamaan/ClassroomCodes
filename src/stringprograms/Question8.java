package stringprograms;

import java.util.Scanner;

// Input a String and remove all the spaces present in the String
public class Question8 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String");
//        String word = sc.nextLine();
//
//        int length = word.length();
//        for (int i = 0; i<length; i++){
//            char ch = word.charAt(i);
//            if(word.replace(" ","")){
//                System.out.print(ch);
//            }
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = sc.nextLine();
        String newWord = word.replace(" ", "");
        System.out.println(newWord);
    }
}
