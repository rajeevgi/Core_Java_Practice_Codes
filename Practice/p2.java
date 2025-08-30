import java.util.Scanner;
/*
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 */

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number of rows: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
