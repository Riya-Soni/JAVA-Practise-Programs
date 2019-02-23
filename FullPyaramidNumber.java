/*Output will be like this
Enter number of rows: 8
              1 
            2 2 2 
          3 3 3 3 3 
        4 4 4 4 4 4 4 
      5 5 5 5 5 5 5 5 5 
    6 6 6 6 6 6 6 6 6 6 6 
  7 7 7 7 7 7 7 7 7 7 7 7 7 
8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 
*/

import java.util.Scanner;
public class FullPyaramidNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        for(int i=0; i<=rows; i++){
            for(int j=0; j<rows-i; j++)
                System.out.print("  ");
            for(int k=1; k<=(2*i)-1; k++)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
