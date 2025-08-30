import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, n1 = 0, n2 = 1, n3 ;

        System.out.println("Enter a stopping point: ");
        num = sc.nextInt();

        System.out.println("The Fibonacci Series is: ");
        for(int i = 1; i <= num; i++){
            n3 = n1 + n2;

            System.out.print("\t" + n1);
            n1 = n2;
            n2 = n3;
        }
        sc.close();
    }
}
