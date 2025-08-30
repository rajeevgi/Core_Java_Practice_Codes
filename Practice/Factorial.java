import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, fact = 1;

        System.out.println("Enter a number to calculate factorial: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }

        System.out.println("The Factorial of a number is: " + fact);

        sc.close();
    }
}
