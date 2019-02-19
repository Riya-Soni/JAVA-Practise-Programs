
import java.util.Scanner;

/*
              * 
            * * * 
          * * * * * 
        * * * * * * * 
      * * * * * * * * * 
    * * * * * * * * * * * 
  * * * * * * * * * * * * * 
* * * * * * * * * * * * * * * 

*/
public class FullPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();
        for(int i=0; i<=row; i++){
            for(int j=0; j < (row-i); j++)
                    System.out.print("  ");
            for(int k = 1; k<=(2*i)-1; k++)
                    System.out.print("* ");
            System.out.println("");
        }
        
        
    }
}
