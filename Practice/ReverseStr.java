import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st Method
        // String originalStr = "rajeev";
        // System.out.println("Enter a string to reverse : ");
        // String originalStr = sc.nextLine();

        // String reverseStr = "";

        // int strlength = originalStr.length();

        // for(int i = strlength - 1; i >= 0; i--){
        //     reverseStr += originalStr.charAt(i);
        // }

        // System.out.println("The Reverse of a string " + originalStr + " is : " + reverseStr);

        // 2nd Method : Using Stringbuilder()
        String str1 = "Hello";

        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        System.out.println("The Reverse of a string using string builder is: " + sb);

        // 3rd Method : Using Stringbuffer()
        String str2 = "Anurag";

        StringBuffer sf = new StringBuffer(str2);
        sf.reverse();

        System.out.println("The Reverse of a string using string buffer is: " + sf);
        sc.close();        
    }
}
