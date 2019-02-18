
import java.util.Scanner;

public class FabonacciiSeries {
    public static void main(String[] args){
        System.out.println("Enter the no. of terms of series: ");
        //Scanner sc = new Scanner(System.in);
        int n = 10;//sc.nextInt();
        int a[] = new int[n];
        a[0]=0;a[1]=1;
        for(int i=2; i<n; i++){
            a[i]=a[i-1]+a[i-2];
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
            
}
