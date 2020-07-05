
public class largestamong3 {

	public static void main(String[] args) {
		int a = 550;
		int b = 600;
		int c = 550;
		
		if(a>b && a>c) {
			System.out.println("a is greatest");
		}
		else if (b>c) {
			System.out.println("b is greatest");
		}
		else {
			System.out.println("c is greatest");
		}
	
	if (a>=b) {
		if (a>=c) {
			System.out.println("a is greatest");
		}
		else 
			System.out.println("c is greatest");
	}
	else {
		if(b>=c) {
			System.out.println("b is greatest");
		}
		else
			System.out.println("c is greatest");
	}
	}
}
