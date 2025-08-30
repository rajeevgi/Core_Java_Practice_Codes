import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter an elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Elements of array is : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print("\t" + arr[i]);
        }
        int search = 0;
        boolean found = false;

        System.out.println("\n Enter an element to be search: ");
        search = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == search){
                System.out.println("The Element " + search +" found at index : " + (i+1));
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Element "+ search + " is not present in an array.");
        }

        sc.close();
    }
}
