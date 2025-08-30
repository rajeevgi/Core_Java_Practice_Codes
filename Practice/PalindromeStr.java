import java.util.Scanner;

public class PalindromeStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String originalStr = sc.nextLine();

        originalStr = originalStr.toLowerCase(); // Make it case sensitive
        int strLength = originalStr.length(); // Calculate length

        for (int i = 0; i <= strLength / 2; i++) {
            if (originalStr.charAt(i) != originalStr.charAt(strLength - i - 1)) {
                System.out.println(originalStr + " String is not a Palindrome...");
                sc.close();
                return;
            }
        }
        System.out.println(originalStr + " string is a palindrome.");
    }
}
