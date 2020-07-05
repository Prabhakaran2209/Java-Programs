
public class factorial_recursive {

	public static void main(String[] args) {
		int result = multiplynum(5);
		System.out.println("Factorial is " +result);

	}
	
	public static int multiplynum(int num) {
		if(num>1) {
			return num*multiplynum(num-1);
		}
		else
			return num;
		
		
	}

}
