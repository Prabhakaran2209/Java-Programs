import java.util.Scanner;

public class printnum_enteredbyuser {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = reader.nextInt();
		
		System.out.println("your num is: " +num);

	}

}
