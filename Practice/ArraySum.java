import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5]; // Array Declaration and Definition

        System.out.println("Enter Elements of an array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Elements of an array is : ");
        for(int num : arr){
            System.out.print(" \t " + num );
        }

        int sumOfArrayElements = Arrays.stream(arr).sum();

        System.err.println("\n The Sum of ELements of an array is: " + sumOfArrayElements);

        sc.close();
    }
}
