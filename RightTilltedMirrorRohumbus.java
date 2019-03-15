import java.util.Scanner;
public class RightTilltedMirrorRohumbus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++)
                System.out.print("  ");
            for(int k=0; k<n; k++)
                if(i==0||k==0||i==n-1||k==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }
}
