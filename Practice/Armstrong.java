import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0, sum = 0, rem = 0, temp;

        System.out.println("Enter a number to check armstrong: ");
        num = sc.nextInt();

        temp = num;

        while(num > 0){
            rem = num % 10;
            sum = (int) (sum + Math.pow(rem, 3));
            num = num / 10;
        }

        if(sum == temp){
            System.out.println(temp + " is a armstrong number.");
        }else{
            System.out.println(temp + " is not a armstrong number.");
        } 

        sc.close();
    }
}
