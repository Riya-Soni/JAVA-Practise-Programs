import java.util.Scanner;
public class BoxNumberPattern {
    public static void main(String[] args){
        int n=0,x=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. ");
        n=sc.nextInt();
                
        int rows = (2*n)-1;
        int a[][] = new int[rows][rows];
               
        while(n>0){
            for(int i=x; i<rows-x; i++){
                for(int j=x; j<rows-x; j++){
                    if(i==x || i==rows-x-1 || j==x || j==rows-x-1){
                        a[i][j] = n;
                    }
                    else
                        a[i][j] = 0;
                }
            }
            n--;
            x++;
        }
        
        //printing araay
        for(int i=0; i<rows; i++){
            for(int j=0; j<rows; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
