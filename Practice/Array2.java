import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];   // Array Definition
        int sum = 0;

        System.out.println("Enter an array Elements: ");
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Array Elements are:");
        for(int i = 0; i < 5; i++){
            System.out.print("\t" + arr[i]);
        }

        // The Sum Of Elements of an array 
        for (int i = 0; i < 5; i++){
            sum += i;
        }
        System.out.println("\n The Sum of Elements of an array is: " + sum);

        sc.close();
    }
}
