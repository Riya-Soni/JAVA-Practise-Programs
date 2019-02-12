
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args){
        int n, count =0, digit=0;
        System.out.println("Enter a no. to count digits: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(count==0){
            digit++;
            n = n/10;
            if(n==0)
                count = 1;
        }
        System.out.println("Number of digits: "+digit);
    }
}
