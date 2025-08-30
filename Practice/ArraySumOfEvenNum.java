import java.util.Scanner;

public class ArraySumOfEvenNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        sum = java.util.stream.IntStream.rangeClosed(1,10)
                .filter(i -> i % 2 == 0)
                .sum();

        System.out.println("The sum of even number is : " + sum);

        sc.close();
    }
}