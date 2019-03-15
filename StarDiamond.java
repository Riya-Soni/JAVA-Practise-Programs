public class StarDiamond {
    public static void main(String[] args){
        int n = 5,x=0,j=0,k=0,rows = (2*n)-1;
        
        for(int i=1; i<=rows; i++){
            if(i<=n){
                x=i;
                for(j=1; j<=n-i; j++)
                    System.out.print("  ");
                for(k=1; k<=(2*i)-1; k++)
                    System.out.print("* ");
                if(x==n){
                    x--;
                    k--;
                }
            }
            else{
                for(j=1; j<=n-x; j++)
                    System.out.print("  ");
                for(k=1; k<=(2*x)-1; k++)
                    System.out.print("* ");
                x--;
            }
            System.out.println();
        }    
    }
}

