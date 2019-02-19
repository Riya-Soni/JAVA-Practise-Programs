
import java.util.Scanner;

/*
Enter number of rows: 
8
1
12
123
1234
12345
123456
1234567
12345678 */
public class HalfPyramidCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
