package revision;

public class controlStatements {

    public static void main(String[] args) {
        
        // There Are Three Control Statements
        /*
         * 1. Decision Making Statement : (If, if-else, else-if-ladder, switch)
         * 2. Loop Statement : (for-loop, do-while-loop, while-loop, forEach)
         * 3. Jump Statement : (break, continue)
         */

        // Decision Statement
        // 1. If-Statement
        int x = 10;
        int y = 12;
        if( x + y > 20){
            System.out.println("x + y is greater than 20.");
        }
        
        // 2. If-else Statement
        if(x + y < 10){
            System.out.println("x + y is less than 10.");
        }else{
            System.out.println("x + y is greater than 10.");
        }

        // 3. Else-if-ladder
        String city = "Delhi";

        if(city == "Mumbai"){
            System.out.println("The city is mumbai.");
        }else if(city == "Chennai"){
            System.out.println("The city is chennai.");
        }else if(city == "Delhi"){
            System.out.println("The city is Delhi.");
        }else{
            System.out.println(city);
        }

        // 4. Switch-statement
        int num = 2;

        switch(num){
            case 0 : System.out.println("The number is 0.");
                    break;
            case 1: System.out.println("The number is 1.");
                    break;
            case 2: System.out.println("The number is 2.");
                    break;
            default: System.out.println("Invalid number!");  
        }

        // Loop Statement
        // 1. For Loop
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum = sum + i;
        }
        System.out.println("The Sum of First 10 number is : "+ sum);

        // 2. ForEach loop
        String []names = {"Java","C","C++","Javascript"};

        for (String name : names) {
            System.out.print("\t[" +name.toString()+"]\n");
        }

        // 3. While-loop
        int j = 0;
        System.out.println("The List of first 10 even numbers using while-loop: ");
        while (j <= 10) {
            j = j + 2;
            System.out.println(j);
        }

        // 4. do-while loop
        int k = 0;
        System.out.println("The List of first 10 even numbers using do-while loop:");
        do{
            k = k + 2;
            System.out.println(k);
        }while(k <= 10);

        // 3. Jump Statement
        // 1. Using break
        System.out.println("The Break Statement:");
        for(int i = 0; i <= 10; i++){
            System.out.print("\t"+i);
            if(i == 6){
                break;
            }
        }

        // 2. Using continue 
        System.out.println("\nThe Continue Statement:");
        for(int i = 0; i <= 10; i++){
            if(i == 6){
                continue;
            }
            System.out.print("\t"+i);
        }

    }
}
