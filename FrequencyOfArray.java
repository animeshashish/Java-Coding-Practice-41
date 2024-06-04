import java.util.Scanner;

public class FrequencyOfArray {
    public static void main(String[] args) {


        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the number of elements");
        n = sc.nextInt();

        // Initialize the array
        int[] arr = new int[n];
        System.out.println("Entre the elements of the array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Display elements of original array
        for (int i =0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
       for (int i = 0; i<n; i++) {
           int count = 1;

           while (i < n - 1 && arr[i] == arr[i +1]) {
               i++;
               count++;
           }
           System.out.println(arr[i] + ": " + count);
           count++;
       }

    }
}
