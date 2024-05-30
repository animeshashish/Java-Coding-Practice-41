import java.util.Arrays;
import java.util.Scanner;

//  Using sort() method of Arrays class
public class ArrayInAscendingOrder {
    public static void main(String[] args) {

        int n;

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
        }


        // Using Arrays.sort() method to sort array elements in ascending order
        Arrays.sort(arr);


        // Display elements after sorting
        System.out.println("Elements in ascending order:" + Arrays.toString(arr));

    }
}
