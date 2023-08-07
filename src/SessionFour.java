import java.util.Arrays;
import java.util.Scanner;
public class SessionFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] elements = new int[5]; //Creating an array of 5 elements

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the element for index ["+i+"]: ");
            elements[i]= sc.nextInt();
        }

        System.out.println("The elements of the Array are");
//        for (int i = 0; i < 5; i++) {  //it prints the array one below the other
//            System.out.println(elements[i]);
//        }

        //Another nice way to print the array is:-
        System.out.println(Arrays.toString(elements));
    }
}
