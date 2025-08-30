import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter an elements of an array: ");
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Elements of an array is: ");
        for(int i = 0; i < 5; i++){
            System.out.print("\t" + arr[i]);
        }

        // Using simple array to reverse an element
        /*
        System.out.println("\n The Reverse of an array elements is : ");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print("\t" + arr[i]);
        }
        */

        // Using Variable to store value and then swap
        int start = 0, end = arr.length - 1;
        System.out.println("\n The Reverse of an array elements is :");

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;     // e.g. start = 0,1,2,.....
            end--;       // e.g. end = 4,3,2,.....
        }
        System.out.print("\t" + Arrays.toString(arr));

        sc.close();
    }
}
