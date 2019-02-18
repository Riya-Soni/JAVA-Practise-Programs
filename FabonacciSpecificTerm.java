
import java.util.Scanner;

//without using array
public class FabonacciSpecificTerm {
    public static void main(String[] args){
        int a=0,b=1,next;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a term till which you want the series");
        int term = sc.nextInt();
        System.out.print(a+", "+b+", ");
        next = a+b;
        while(next <= term){
            System.out.print(next+", ");        
            a=b;
            b=next;
            next = a+b;
        }
    }
}
