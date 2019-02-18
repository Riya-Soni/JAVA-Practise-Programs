import java.util.Scanner;

public class ASCII_value {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        int i = s ;
        System.out.println("UNICODE value of "+s+" is : "+i);
    } 
}

//next() function returns the next token/word in the input as a string
//charAt(0) function returns the first character in that string.