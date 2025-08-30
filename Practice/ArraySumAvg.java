import java.util.Scanner;

public class ArraySumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter an elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Elements of an array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print("\t" + arr[i]);
        }

        int sum = 0;

        for (int num : arr){
            sum = sum + num;
        }
        System.out.println("\n The Sum Of Elements of an array is: " + sum );

        double avg = (double) (sum / arr.length);
        System.out.println("\n The Average of Elements of an array is : " + avg);

        sc.close();
    }
}
