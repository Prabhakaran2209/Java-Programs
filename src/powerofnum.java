
public class powerofnum {

	public static void main(String[] args) {
		int base = 4;
		int exponent = 3;
		
		long result = 1;
		
		while(exponent != 0 ) {
			result = result*base;
			--exponent;
		}
		System.out.println(result);
		
		System.out.println(Math.pow(4, 3));  //direct function
	}

}
