import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num ,rem = 0, rev = 0;

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        int temp = num;

        while(num > 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.println("The Reverse of a " + temp + " is : " + rev);
        sc.close();

    }
}
