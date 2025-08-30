import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0, rem = 0, temp;

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        temp = num;

        while(num > 0){
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("The sum  of digits of a number " + temp + " is : " + sum);
        sc.close();
    }
}
