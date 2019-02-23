
/* Output will be
For 8 rows
1
23
456
78910
1112131415
161718192021
22232425262728
2930313233343536
*/
import java.util.Scanner;

public class FloydsPyramid {
    public static void main(String[] args){
        int n=1,row;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        row = sc.nextInt();
        for (int i=1; i <= row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println("");
        }
    }
}
