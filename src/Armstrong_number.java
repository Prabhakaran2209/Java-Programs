
public class Armstrong_number {

	public static void main(String[] args) {
		//System.out.println( " is a armstrong number");
		int num = 153;
		int actualnum = num;
		double result = 0;
		
		while(actualnum != 0) {
			int n = actualnum % 10;
			result = result + Math.pow(n, 3);
			actualnum = actualnum / 10;
		}
		
		if(result == num) {
			System.out.println(num + " is a armstrong number");
		}
		else {
			System.out.println(num + " is not a armstrong number");
		}

	}

}
