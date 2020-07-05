
public class palindrome {

	public static void main(String[] args) {
		int n = 120;
		int rev = 0;
		int actual = n;
		
		while(n != 0) {
			int num = n%10;
			rev = rev*10 + num;
			n = n/10;
		}
		
		if(rev == actual) {
			System.out.println("Its a palindrome number");
		}
		
		else 
			System.out.println("Its not a palindrome number");

	}

}
