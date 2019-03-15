/*Enter number of rows: 8
              * 
            * * 
          * * * 
        * * * * 
      * * * * * 
    * * * * * * 
  * * * * * * * 
* * * * * * * * 

*/
import java.util.Scanner;
public class RightAlignedHalfPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        int coloumn = rows;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=coloumn; j++){
                if(j <= (coloumn-i))
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println("");
        }  
    }
}