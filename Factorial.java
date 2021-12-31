import java.util.Scanner;
public class Factorial {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int input = sc.nextInt();
		numberfactorial(input);
		sc.close();
}
	public static void numberfactorial(int number) {
		
		int factorial=1;
		int i = 1;
		while(i<=number) {
			factorial *= i;
			i++;
		}
		System.out.println("Factorial of the given number: " + factorial);
	}
}