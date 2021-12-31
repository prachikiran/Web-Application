import java.util.Scanner;

public class PallindromeString {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string to check: ");
	        String input = sc.next();
	        checkPallindrome(input);
	        sc.close();
	    }

	    public static void checkPallindrome(String string) {

	        String original_value = string;
	        String reverse = "";
	        int length = string.length();

	        for(int i=length-1; i>=0; i--) {
	            reverse = reverse + string.charAt(i);
	        }
	        	if(original_value.equals(reverse)) {
	        		System.out.println(original_value + " is Pallindrome");
	        	}
	        	else
	        		System.out.println(original_value + " is not a Pallindrome");
	    	}
	}

