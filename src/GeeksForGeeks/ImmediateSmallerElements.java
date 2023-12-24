package GeeksForGeeks;

import java.util.Scanner;

public class ImmediateSmallerElements {

    void immediateSmaller(int arr[], int n) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                sb.append(arr[i + 1] + " ");
            } else {
                sb.append(-1 + " ");
            }
        }

        sb.append(-1); // for the last element as there is no element after it

        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        ImmediateSmallerElements obj = new ImmediateSmallerElements();
        obj.immediateSmaller(arr, size);

        sc.close();
    }
}
