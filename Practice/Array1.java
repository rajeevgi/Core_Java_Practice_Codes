import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] a ;  // Array Declaration
        int[] a = new int[5];    // Array Definition

        System.out.println("Enter an array Elements:\n");
        for(int i = 0; i < 5; i++){
            a[i] = sc.nextInt();
        }

        // int[] a = { 1, 2, 3, 4, 5 };      Array Declaration + Definition + Initialization

        System.out.println("The Array elements are: ");
        for(int i = 0; i < 5; i++){
            System.out.print("\t" + a[i]);
        }

        sc.close();
    }
}
