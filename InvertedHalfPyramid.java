
import java.util.Scanner;

/*Enter number of rows: 8
* * * * * * * * 
* * * * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
*/
public class InvertedHalfPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        int coloumn = rows;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=coloumn; j++){
                System.out.print("* ");
            }
            coloumn--;
            System.out.println("");
        }
    }
}
