
public class factorial {

	public static void main(String[] args) {
		getfactorial(6);
	}

	
	public static void getfactorial(int num) {
		int fact = 1;
		for (int i=1; i<=num; i++) {
			fact = fact*i;
		}
		
		System.out.println("factorial of "+ num + " is: " +fact);
		
		}	
}


