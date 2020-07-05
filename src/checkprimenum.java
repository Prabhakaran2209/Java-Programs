
public class checkprimenum {

	public static void main(String[] args) {
		int num = 17;
		boolean flag = false;
		
		for(int i=0; i<=num/2; i++) {
			if(checkprime(i)) {
				if(checkprime(num-i)) {
					System.out.println(num + "=" + i + "+" + (num-i));
					flag = true;
				}
			}
		}
		
		if(!flag) {
			System.out.println("number cannot be expressed as sum of two numbers");
		}

	}
	
	public static boolean checkprime(int n) {
		boolean isprime = true;
		for(int i=2; i<=n/2; i++) {
			if(n%i == 0) {
				isprime = false;
				break;
			}
		}
		
		return isprime;
		
	}

}
