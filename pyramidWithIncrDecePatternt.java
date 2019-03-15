import java.util.Scanner;
public class pyramidWithIncrDecePatternt {
    public static void main(String[] args){
        int x=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++)
                System.out.print("  ");
            for(int k=1; k<=(2*i)-1; k++){
                if(k<=i){
                    System.out.print(k+" ");
                    x=k;}
                else
                    System.out.print(--x+" ");
            }
            System.out.println();
        }
    }
}
