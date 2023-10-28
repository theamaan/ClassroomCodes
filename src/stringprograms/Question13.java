package stringprograms;

import java.util.Scanner;

// Input a String and print the count of the alphabets, alphabets and digits, special characters, spaces, capital letters, small letters, vowels and consonants present in the String
public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = sc.nextLine();
        countAlphabets(word);
        countAlphaAndDigits(word);
        isSpecialCharacter(word);
        isSpace(word);
        isCapitalLetter(word);
        isSmallLetter(word);
        isVowels(word);
        isConsonant(word);
    }
    public static void countAlphabets(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                count++;
            }
        }
        System.out.println("The Count of the letters is "+count);
    }
    public static void countAlphaAndDigits(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                count++;
            }
        }
        System.out.println("The Count of the Alphabets and Digits is "+count);
    }
    public static void isSpecialCharacter(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                count++;
            }
        }
        System.out.println("The Count of the Special Character is "+count);
    }
    public static void isSpace(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch==' '){
                count++;
            }
        }
        System.out.println("The Count of the Space is "+count);
    }
    public static void isCapitalLetter(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        System.out.println("The Count of the capital letters is "+count);
    }
    public static void isSmallLetter(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                count++;
            }
        }
        System.out.println("The Count of the lower letters is "+count);
    }
    public static void isVowels(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("The Count of the Vowel is "+count);
    }
    public static void isConsonant(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
                count++;
            }
        }
        System.out.println("The Count of the Consonants is "+count);
    }
}
