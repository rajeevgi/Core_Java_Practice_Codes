import java.util.Scanner;

public class CheckAscDsc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean asc = true, dsc = true;
        int[] sort = new int[5];

        System.out.println("Enter an elements of an array: ");
        for(int i = 0; i < sort.length; i++){
            sort[i] = sc.nextInt();
        }

        System.out.println("The Elements of an array is: ");
        for(int i = 0; i < sort.length; i++){
            System.out.print("\t" + sort[i]);
        }

        for(int i = 0; i < sort.length - 1; i++){
            if (sort[i] > sort[i+1]) asc = false;
            if (sort[i] < sort[i+1]) dsc = false;
        }

        if(asc){
            System.out.println("\n Array is sorted in ascending order...");
        }else if(dsc){
            System.out.println("\n Array is sorted in descending order...");
        }else{
            System.out.println("\n Array is not sorted...");
        }

        sc.close();
    }
}
