/*
An Armstrong number is a number which is equal to the sum of digits raise to the power total number of digits in the number. Some Armstrong numbers are: 0, 1, 2, 3, 153, 370, 407, 1634, 8208, etc.
*/
import java.util.Scanner;
import java.lang.Math;;

public class Armstrong_n_Digit {
	public static void main(String[] args) {
		int number, originalNumber, remainder, result = 0, n = 0 ;

		System.out.println("Enter an Integer: ");
	    Scanner sc = new Scanner(System.in);
	    number = sc.nextInt();
	    
	    originalNumber = number;
	    while (originalNumber != 0)
	    {
	        originalNumber /= 10;
	        ++n;
	    }

	    originalNumber = number;
	    while (originalNumber != 0)
	    {
	        remainder = originalNumber%10;
	        result += Math.pow(remainder, n);
	        originalNumber /= 10;
	    }

	    if(result == number)
	    	System.out.println(number+" is an Armstrong number.");
	    else
	    	System.out.println(number+" is not an Armstrong number.");
	    sc.close();//standard practice for eclipse to close scanner object
	
	}
}//Check1634 n 153 thi are armstrong no.
