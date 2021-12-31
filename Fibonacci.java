import java.util.Scanner;

public class Fibonacci {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements you want to print: ");
	        int number= sc.nextInt();
	        fib(number);
	        sc.close();
	    }

	    public static void fib(int n) {

	        System.out.println("Fibonacci Series is: ");
	        int first = 0;
	        int second = 1;
	        int sum = 0;

	        for (int i = 0; i < n; i++) {
	            if (i<=1) {
	                sum = i;
	            }
	            else {
	                sum = first + second;
	                first = second;
	                second = sum;
	            }
	            System.out.println(sum);
	        }
	    }
}
