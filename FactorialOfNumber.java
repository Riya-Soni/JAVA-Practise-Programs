public class FactorialOfNumber {
    
    public static void main(String[] args){
        int i=1,j=1,n=5;
        for(i=1; i<=n; i++){
            j=i*j;
        }
        System.out.println("Factorial of a given no. is: "+j);
    }
}
