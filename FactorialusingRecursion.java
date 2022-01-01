import java.util.Scanner;

public class FactorialusingRecursion {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int value = s.nextInt();
		System.out.println("Factorial of the number: " + fact(value));
	}
	
	public static int fact(int number) {
		
		if(number==1) {
			return 1;
		}
		else {
			return(number * fact(number-1));
		}
	}
}
