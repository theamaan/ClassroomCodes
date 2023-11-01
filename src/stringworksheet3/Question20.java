package stringworksheet3;

import java.util.Scanner;

//Input a sentence and a word and count the number of times the has occurred in the sentence
// Input:- Change your thoughts, and you change your world.         Input:- change
// Output:- change occurred 2 times.
public class Question20 {
    public static void main(String[] args) {
        String orgWord = "Change your thoughts, and you change your world.";
        String newWord = orgWord + " ";
        newWord = newWord.toLowerCase();
        int counter = 0;
        int d = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the word for which you would like to check its frequency of occurrence.");
        String userWord = sc.nextLine();

        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                String word = newWord.substring(d+1,i);
                if(word.equalsIgnoreCase(userWord)){
                    counter++;
                }
                d = i;
            }
        }
        System.out.print(userWord + " occured "+ counter + " times.");
    }
}
