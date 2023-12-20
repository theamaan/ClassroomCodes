package arrayquestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {6,5,0,1,2,-2,-9};
        bubbleSort(num);
        System.out.println(Arrays.toString(num));
    }
// The code snippet sorts an array of integers using the bubble sort algorithm and prints the sorted array in ascending order.
    public static void bubbleSort(int[] num){
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-1-i; j++) {
                if(num[j]>num[j+1]){
                    int t = num[j];
                    num[j]=num[j+1];
                    num[j+1]=t;
                }
            }
        }
        System.out.println("The numbers in ascending order are ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }
}
