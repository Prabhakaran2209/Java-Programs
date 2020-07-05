import java.util.Scanner;

public class calc_switchcase {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		double first = reader.nextDouble();
		double second = reader.nextDouble();
		
		System.out.println("select the operator: (+, -, *, /)");
		
		char operator = reader.next().charAt(0);
		
		double result = 0;
		
		switch (operator) {
		case '+' :
		result = first + second;
		break;
		
		case '-':
			result = first-second;
			break;
			
		case '*':
			result = first*second;
			break;
			
		case '/':
			result = first / second;
			break;
			
		default:
			System.out.println("enter valid operator");
		}
		
		System.out.println(result);
		

	}

}
