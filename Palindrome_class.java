package Week2.day1;

public class Palindrome_class {

	public static void main(String[] args) {
			int input=12345;
			int temp,rem;
			
			int org=input;
			
			for(temp=0;org>0;org=org/10) {
				rem=org%10;
				temp=(temp*10)+rem;
			}
			if(temp==input) {
				System.out.println("The given number is palindrome");
			}
			else {
				System.out.println("The given number is not palindrome");
			}
		}
	}