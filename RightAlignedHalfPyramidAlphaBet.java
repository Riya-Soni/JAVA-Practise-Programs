import java.util.Scanner;
public class RightAlignedHalfPyramidAlphaBet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        int coloumn = rows;
        char c='A';
        for(int i=1; i<=rows; i++){
            if ((int)c <= 90){
                for(int j=1; j<=coloumn; j++){
                    if(j <= (coloumn-i))
                        System.out.print("  ");
                    else
                        System.out.print(c+" ");
                }
                c++;
                System.out.println("");
            }
            else{
                System.out.println("UPPER CASE alphabet limit exceed here");
                break;
            }
            
        }  
    }
}
/*Enter number of rows: 8
              A 
            B B 
          C C C 
        D D D D 
      E E E E E 
    F F F F F F 
  G G G G G G G 
H H H H H H H H 
*/