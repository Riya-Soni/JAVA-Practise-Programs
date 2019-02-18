//prime number apne se chote kisi bhi no se divide nahi hota
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        int n,i = 1;
        boolean flag = false;
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=2; i<n; i++){
            if((n%i) == 0){
                flag = true;
                break;
            }
        }
        if(flag == true)
            System.out.println("Number is not prime");
        else
            System.out.println("Number is prime");
    }
}

