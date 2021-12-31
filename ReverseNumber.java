import java.util.Scanner;
public class ReverseNumber {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your number: ");
	        int value = sc.nextInt();
	        reversefunction(value);
	    }

	    public static void reversefunction(int number) {
	    	
	    	int original = number;
	    	int reverse = 0;
	        while(number != 0) {
	        	int lastDigit = number%10;;
	        	reverse = reverse*10 + lastDigit;
	        	number /= 10;
	        }
	        System.out.println("Reverse of the given number: " + reverse);
	    }
}