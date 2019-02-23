/* Output will be
Enter number of rows: 8
8 8 8 8 8 8 8 8 
7 7 7 7 7 7 7 
6 6 6 6 6 6 
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 
*/

import java.util.Scanner;
public class InvertedHalfPyramidNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        int coloumn = rows;
        
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=coloumn; j++){
                System.out.print(coloumn+" ");
            }
            coloumn--;
            System.out.println("");
        }
    }
}
