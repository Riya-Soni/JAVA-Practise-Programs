import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args){
        int number,count=0,x,reverse=0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter any number: ");
        number = sc.nextInt();
        x = number;
        
        while(x!=0){
            x=x/10;
            count++;
        }
        count = count - 1;
        x = number;
        while(x!=0){
            int r = x%10;
            reverse = reverse + (r * (int)Math.pow(10, count));
            x = x/10;
            count--;
        }
        System.out.println("Reverse of "+number+" is "+reverse);
    }
}
