import java.util.*;

public class fac{
    public static int factorial(int n){
        if(n==1 || n==0) return 1;

        return n*factorial(n-1);

    };

    public static void main(String[] args){

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int n = sc.nextInt();
        
        System.out.println(factorial(5));
    }
}