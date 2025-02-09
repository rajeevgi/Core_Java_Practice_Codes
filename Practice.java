import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 1 . write a program to check given number is a prime number or not.
        // int num = 0, count = 0;

        // 1St method
        // System.out.println("Enter a number: ");
        // num = sc.nextInt();

        // for(int i = 1; i <= num; i++){
        //     if(num % i == 0){
        //         count++;
        //     }
        // }

        // if(count == 2){
        //     System.out.println(num + " is a prime number.");
        // }else{
        //     System.out.println(num +" is not a prime number.");
        // }

        // 2nd method
        // System.out.println("Enter a number: ");
        // num = sc.nextInt();

        // for(int i = 2; i <= num/2; i++){
        //     if(num % i == 0){
        //         count++;
        //         break;
        //     }
        // }

        // if(count == 0 && num > 1){
        //     System.out.println(num + " is a prime number.");
        // }else{
        //     System.out.println(num + " is not a prime number.");
        // }

        // 2. Write a program to find a factorial of a number.
        // int num, fact = 1;

        // System.out.println("Enter a number: ");
        // num = sc.nextInt();
        
        // for(int i = num; i > 1; i--){
        //     fact = fact * i;
        // }

        // System.out.println("The Factorial of a" + num +" is : " + fact);

        // 3. Write a program to check given number is a armstrong number.
        // int num, sum = 0, rem = 0, temp = 0;

        // System.out.println("Enter a number : ");
        // num = sc.nextInt();

        // temp = num;

        // while(num > 0){
        //     rem = num % 10;    // It will generate a remainder eg. 153%10 == 15.3 i.e. (3)
        //     sum = (int) (sum + Math.pow(rem, 3));
        //     num = num / 10;   // It will generate a quotient eg. 153/10 == 15.3 i.e. (15)
        // }

        // if(temp == sum){
        //     System.out.println(temp + " is a Armstrong number.");
        // }else{
        //     System.out.println(temp + " is not a Armstrong number.");
        // }

        // 4. Write a program to check given number is a palindrome number or not.
        // int num, rem = 0, rev = 0, temp;

        // System.out.println("Enter a number : ");
        // num = sc.nextInt();

        // temp = num;

        // while(num > 0){
        //     rem = num % 10;
        //     rev = rev*10 + rem;
        //     num = num / 10;
        // }

        // System.out.println("The Reverse of a number is : "+rev);

        // if(temp == rev){
        //     System.out.println(temp + " is a palindrome number.");
        // }else{
        //     System.out.println(temp + " is not a palindrome number.");
        // }

        // 5. Write a program to find sum of digits of a number.
        // int num, sum = 0, rem = 0, temp;

        // System.out.println("Enter a number : ");
        // num = sc.nextInt();
        // temp = num;

        // while(num > 0){
        //     rem = num % 10;
        //     sum = sum + rem;
        //     num = num / 10;
        // }

        // System.out.println("The sum of digits of a "+ temp + " is : "+sum);

        // 6. Write a program to calculate sum of n numbers.
        // int num = 0, sum = 0;

        // System.out.println("Enter a number: ");
        // num = sc.nextInt();

        // for(int i = 1; i <= num; i++){
        //     sum = sum + i;
        // }

        // System.out.println("The sum of "+ num +" numbers is : "+sum);

        // 7. Write a program to find reverse of a string.
        // Method : 1
        // String originalStr = "Hello";
        // String revStr = "";

        // for(int i = originalStr.length()-1; i >= 0; i--){
        //     revStr += originalStr.charAt(i);
        // }
        // System.out.println("The Reverse of a given string is : "+revStr);

        // Method : 2
        // String originalStr = "Hello";

        // StringBuilder sb = new StringBuilder(originalStr);
        // sb.reverse();

        // System.out.println("The Reverse of a string is : "+sb);

        // Method : 3
        // String originalStr = "rajeev";

        // StringBuffer sb = new StringBuffer(originalStr);
        // sb.reverse();
        // System.out.println("The Reverse of a string is : "+sb);

        // 8. Write a program to check given string a palindrome or not.
        // String originalStr = "navjeevan";
        // String revStr = "";

        // originalStr = originalStr.toLowerCase(); // make it case - sensitive
        // int length = originalStr.length();  // calculate length

        // for(int i = 0; i <= length/2; i++){
        //     if(originalStr.charAt(i) != originalStr.charAt(length-i-1)){
        //         System.out.println("The given string is not a palindrome.");
        //         sc.close();
        //         return;
        //     }
        // }

        // System.out.println("The given string is a palindrome.");

        // 9. Write a program to calculate fibonacci series.
        // int n1 = 0, n2 = 1, n3, num;

        // System.out.println("Enter a ending point : ");
        // num = sc.nextInt();

        // for(int i = 1; i <= num; i++){
        //     n3 = n1 + n2;

        //     System.out.print("\t"+n1);
        //     n1 = n2;
        //     n2 = n3;
        // }

        // 10. Write a program to print array elements.
        // int[] arr1 = new int[5];   // Array declaration.

        // System.out.println("Enter a array elements: ");
        // for(int i = 0; i < arr1.length; i++){
        //     arr1[i] = sc.nextInt();
        // }

        // System.out.println("The Elements of Array1 is :");
        // for(int i = 0; i < arr1.length; i++){
        //     System.out.print("\t" + arr1[i]);
        // }

        // 11. Write a program in java to find and element from an array.
        // int[] arr1 = new int[5];

        // System.out.println("Enter an elements: ");
        // for(int i = 0; i < arr1.length; i++){
        //     arr1[i] = sc.nextInt();
        // }

        // System.out.println("An elements of array is: ");
        // for(int i = 0; i < arr1.length; i++){
        //     System.out.print("\t" + arr1[i]);
        // }

        // System.out.println("\n Enter a element you want to search: ");
        // int searchNum = sc.nextInt();

        // for(int i = 0; i < arr1.length; i++){
        //     if(arr1[i] == searchNum){
        //         System.out.println("The Element " + searchNum + " found at index :"+i);
        //         break;
        //     }
        // }

        // 12. Write a program in java to find an duplicate element from an array.
        // int[] arr1 = new int[5];

        // System.out.println("Enter an elements: ");
        // for(int i = 0; i < arr1.length; i++){
        //     arr1[i] = sc.nextInt();
        // }

        // System.out.println("An elements of an array is : ");
        // for(int i = 0; i < arr1.length; i++){
        //     System.out.print("\t" + arr1[i]);
        // }

        // System.out.println("\n The Duplicate Element searching : ");
        // for(int i = 0; i < arr1.length; i++){
        //     for(int j = i + 1; j < arr1.length; j++){
        //         if(arr1[i] == arr1[j]){
        //             System.out.println("The Duplicate element "+ arr1[i] +" found at index : "+j);
        //         }   
        //     }
        // }

        // 13. Write a program in java to count repeated elements in an array.
        // int[] arr1 = new int[5];

        // System.out.println("Enter an elements: ");
        // for(int i = 0; i < arr1.length; i++){
        //     arr1[i] = sc.nextInt();
        // }

        // System.out.println("The Elements of an array is: ");
        // for(int i = 0; i < arr1.length; i++){
        //     System.out.print("\t" + arr1[i]);
        // }

        // System.out.println("\n Enter an elements to count how many times it repeats ?");
        // int num = sc.nextInt();
        // int count = 0;
        // for(int i = 0; i < arr1.length; i++){
        //     if(arr1[i] == num){
        //         count++;
        //     }
        // }
        // System.out.println("The Element "+ num + " is counted "+ count + " times.");

        // 14. Write a program to sort an elements of an array in ascending and descending order.
        // int[] arr1 = new int[5];

        // System.out.println("Enter an elements : ");
        // for(int i = 0; i < arr1.length; i++){
        //     arr1[i] = sc.nextInt();
        // }

        // System.out.println("The Elements are : ");
        // for(int i = 0; i < arr1.length; i++){
        //     System.out.print("\t" + arr1[i]);
        // }

        // // sorting an elements of an array using bubble sort algorithm.
        // for(int i = 0; i < arr1.length; i++){
        //     for(int j = i + 1; j < arr1.length; j++){
        //         if(arr1[i] > arr1[j]){    // it sorts the elements in ascending order.
        //             int temp = arr1[i];
        //             arr1[i] = arr1[j];
        //             arr1[j] = temp;
        //         }
        //     }
        // }

        // System.out.println("\n The Sorted Elements are :");
        // for(int i = 0; i < arr1.length; i++){
        //     System.out.print("\t" + arr1[i]);
        // }

        // 15. Write a program in java to 

        sc.close();
    
    }
}
