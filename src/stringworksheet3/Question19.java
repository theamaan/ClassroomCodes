package stringworksheet3;

import java.util.Scanner;

// Input a String and check whether it is a Palindrome or not
public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to check whether it is a palindrome or not");
        String word = sc.nextLine();
        boolean check = isPalindrome(word);
        System.out.println(check);
    }
    public static boolean isPalindrome(String str){
        //The String could be empty or has one character inside it.
        if(str.isEmpty()||str.length()==1){
            return true;
        }

        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start == end){
                return true;
            }
        }
        return false;
    }
}
