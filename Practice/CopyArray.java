import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];

        System.out.println("Enter an elements of an array: ");
        for(int i = 0; i < 5; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("The Elements of an array 1 is : ");
        for(int i = 0; i < arr1.length; i++){
            System.out.print("\t" + arr1[i]);
        }

        int[] copyArray = new int[arr1.length];

        System.out.println("\n Copy Array Elements is: ");
        for(int i = 0; i < arr1.length; i++){
            copyArray[i] = arr1[i];
        }

        System.out.print("\t" + Arrays.toString(copyArray));
        sc.close();
    }
}
