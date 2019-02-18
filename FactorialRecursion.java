
import java.util.Scanner;

public class FactorialRecursion {
    public int fact(int x){
        if(x>0)
            return x*fact(x-1);
        else
            return 1;
    }
    public static void main(String[] args){
        FactorialRecursion obj = new FactorialRecursion();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of a given no. is: "+obj.fact(n));
        
    }
}
