import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1st method : Using MIN_VALUE
        /*
         * int[] arr = {12,45,7,34,89,89}; // Array declaration and initialization
         * int largest = Integer.MIN_VALUE; // largest = -♾️
         * int secondLargest = Integer.MIN_VALUE; // SecondLargest = -♾️
         * 
         * for(int num : arr){
         * if(num > largest){
         * secondLargest = largest;
         * largest = num;
         * }else if(num > secondLargest && num != largest){
         * secondLargest = num;
         * }
         * }
         * 
         * if(secondLargest == Integer.MIN_VALUE){
         * System.out.println("No second largest element found! ");
         * }else{
         * System.out.println("Second Largest: " + secondLargest);
         * }
         */

        // 2nd Method : USing single traversal
        /**
         * Step 1 : Set the Largest and Second Largest Elements first.
         * Step 2 : Traverse the remaining array elements and set largest and
         * secondLargest Elements.
         * Step 3 : Print the second Largest Element.
         */

        /*int[] arr = { 12, 45, 7, 34, 89, 89 }; // Array declaration and initialization
        if (arr.length < 2) {
            System.out.println("No Second Largest Element exist...");
            return;
        }

        int largest, secondLargest;
        // Set Largest and secondLargest Elements
        if (arr[0] > arr[1]) {
            largest = arr[0];
            secondLargest = arr[1];
        } else {
            largest = arr[1];
            secondLargest = arr[0];
        }
        // Traverse the array elements
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if(largest == secondLargest){
            System.out.println("No second largest elements found!");
        }else{
            System.out.println("Second Largest : " + secondLargest);
        }
        */

        // 3rd Method : Using Sorting 
        /*
        int[] arr = { 12, 45, 7, 89, 34, 89 };

        Arrays.sort(arr);   // It will sort the array in ascending order.

        int n = arr.length;  // Calculates Length 
        int secondLargest = 0;
        int largest = arr[n-1];   // Stores Largest Element of an array.

        for(int i = n - 2; i >= 0; i--){
            if(arr[i] != largest){
                secondLargest = arr[i];   // Stores Second Largest Element.
                break;
            }
        }

        if(secondLargest == -1){
            System.out.println("No second largest element found! ");
        }else{
            System.out.println("The Second Largest Element: " + secondLargest);
        }
        */

        // 4th Method : Using Java Streams
        int[] arr = {12,45,7,89,34,89};

        Integer secondLargest = Arrays.stream(arr)   // Converts array into streams
                .distinct()                          // Removes duplicates 
                .boxed()                             // int => Integer  e.g. Wrapper Class
                .sorted((a, b) -> b - a)             // Sorts the Elements in descending order
                .skip(1)                           // Skips The largest elements
                .findFirst()                         // Picks the second Largest Elements
                .orElse(null);                 // If not found returns null

        if(secondLargest == null){
            System.out.println("No Second Largest Elements found! ");
        }else {
            System.out.println("Second Largest Element: " + secondLargest);
        }
        sc.close();
    }
}
