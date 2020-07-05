
public class swapnumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("before swapping a is "+ a);
		System.out.println("before swapping b is "+ b);
		
		/*
		 * int temp; temp = a; a = b; b = temp;
		 * 
		 * System.out.println("After swapping a is "+ a);
		 * System.out.println("After swapping b is "+ b);
		 */
		//without temp variable
		a= a-b;
		b=a+b;
		a=b-a;
		
		System.out.println("After swapping a is "+ a);
		System.out.println("After swapping b is "+ b);
		
		
		
		

	}

}
