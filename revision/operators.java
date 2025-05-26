package revision;

import java.util.Scanner;

public class operators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 10;
        int a = 10;
        int b = 5;
        int c = 20;

        // Unary Operators(++, --)
        System.out.println("==========================================================");
        System.out.println("===================Unary Operators========================");
        System.out.println("==========================================================");
        System.out.println("Using ++ operator");
        System.out.println("The Value of x :" + (x++)); // Post-increment
        System.out.println("The Value of x :" + (++x)); // Pre-increment

        System.out.println("Using -- operator");
        System.out.println("The value of x:" + (x--)); // Post-decrement
        System.out.println("The value of x:" + (--x)); // Pre-decrement

        // Arithmetic Operators (+,-,*,/,%)
        System.out.println("==========================================================");
        System.out.println("===================Arithmetic Operators===================");
        System.out.println("==========================================================");
        System.out.println("The addition of a and b :" + (a + b));
        System.out.println("The minus of a and b :" + (a - b));
        System.out.println("The product of a and b :" + (a * b));
        System.out.println("The division of a and b :" + (a / b));
        System.out.println("The modulus of a and b :" + (a % b));

        // Relational Opertaors (<, >, <=, >=, ==, !=)
        System.out.println("==========================================================");
        System.out.println("===================Relational Operators===================");
        System.out.println("==========================================================");
        System.out.println("(a < b) : " + (a < b));
        System.out.println("(a > b) : " + (a > b));
        System.out.println("(a <= b) : " + (a <= b));
        System.out.println("(a >= b) : " + (a >= b));
        System.out.println("(a == b) : " + (a == b));
        System.out.println("(a != b) : " + (a != b));

        sc.close();

        // Bitwise Operators( OR, AND, XOR, Complement)
        System.out.println("==========================================================");
        System.out.println("======================Bitwise Operators===================");
        System.out.println("==========================================================");
        System.out.println("The value of a OR b :" + (a | b));
        System.out.println("The value of a AND b :" + (a & b));
        System.out.println("The value of a XOR b :" + (a ^ b));
        System.out.println("The value of a Complement :" + (~a));

        // Logical Operators(&&, ||, !)
        System.out.println("==========================================================");
        System.out.println("===================Logical Operators===================");
        System.out.println("==========================================================");

        // Logical AND Example
        System.out.println("Logical And Operator.");
        if ((a < b) && (++a < c)) {
            System.out.println("If Block is executed...");
        } else {
            System.out.println("Else block is executed...");
            System.out.println("The value of a :" + a);
        }

        // Logical OR Example
        System.out.println("Logical OR Operator.");
        System.out.println((a > b) || (a++ < c));
        System.out.println("The value of a : " + a);

        System.out.println((a < b) || (a++ < b));
        System.out.println("The value of a : " + a);

        // Logical Not Example
        System.out.println("Logical NOT Operator.");
        System.out.println(!(a > b));
        System.out.println(!(a < b));

        // Ternary Operator ( data_type var_name = ( var1 condition var2 ? expression1 :
        // expression2))
        System.out.println("The Ternary Operator Example:");
        System.out.println("==========================================================");
        System.out.println("===================Logical Operators===================");
        System.out.println("==========================================================");

        int min = (a < b) ? a : b;
        System.out.println("The min number is: " + min);

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The max between three numbers is : " + max);

        // Assignment Operators (+=, -=, *=, /=, %= )
        System.out.println("==========================================================");
        System.out.println("===================Assignment Operators===================");
        System.out.println("==========================================================");
        a += 3;
        System.out.println(a);
        a -= 4;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 3;
        System.out.println(a);
    }
}
