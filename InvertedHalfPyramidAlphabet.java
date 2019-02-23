/*  Output will be
Enter number of rows: 
8
H H H H H H H H 
G G G G G G G 
F F F F F F 
E E E E E 
D D D D 
C C C 
B B 
A 
*/

import java.util.Scanner;

public class InvertedHalfPyramidAlphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        int coloumn = rows;
        char c = (char)(rows+64);
        for(int i=1; i<=rows; i++){
            if((int)c >= 65 && (int)c <= 90){
                for(int j=1; j<=coloumn; j++)
                    System.out.print(c+" ");
                coloumn--;
                c--;
                System.out.println("");
            }
            else{
                System.out.println("UPPER CASE alphabet limit exceed here");
                break;
            }    
        }
    }
}
