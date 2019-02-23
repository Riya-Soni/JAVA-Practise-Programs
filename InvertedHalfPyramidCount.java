/* Output will be
Enter number of rows: 8
12345678
1234567
123456
12345
1234
123
12
1 
*/
import java.util.Scanner;

public class InvertedHalfPyramidCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        int coloumn = rows;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=coloumn; j++){
                System.out.print(j+" ");
            }
            coloumn--;
            System.out.println("");
        }
    }
}
