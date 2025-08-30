import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int max = 0, min = 0;
        
        int[] arr = new int[5];    // Array Definition 

        System.out.println("Enter an elements of an array: ");
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Elements of an Array is: ");
        for(int i = 0; i < 5; i++){
            System.out.print("\t" + arr[i]);
        }

        max = arr[0]; 
        min = arr[0];

        for(int i = 0; i < 5; i++){
            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("\n The Largest Element of an array is: "+ max);
        System.out.println("\n The Smallest Element of an array is: "+ min);

        sc.close();
    }
}
