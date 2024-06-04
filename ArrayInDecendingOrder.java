import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayInDecendingOrder {
    public static void main(String[] args) {

        int n, temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre number of elements:");
        n= sc.nextInt();

        // initialize array
        int arr[] = new int[n];
        System.out.println("Entre the elements");

        for (int i=0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // Display elements of original array
        for (int i =0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

            // Using Collection.reverseOrder() method to sort array elements in descending order
         //   Arrays.sort(arr, Collections.reverseOrder());

            // Printing the elements
            System.out.println(Arrays.toString(arr));
        }

    }
}

