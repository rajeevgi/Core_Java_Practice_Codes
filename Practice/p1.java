import java.util.Scanner;
/* 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 */
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;

        System.out.println("Enter a number of rows:");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        sc.close();
    }
}