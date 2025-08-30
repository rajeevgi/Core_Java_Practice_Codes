import java.util.Scanner;

public class SumOfNNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            sum = sum + i;
        }

        System.out.println("The Sum of " + num  + " number is: " + sum);
        sc.close();

    }
}
