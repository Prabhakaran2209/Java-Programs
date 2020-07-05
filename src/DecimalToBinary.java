
public class DecimalToBinary {

	public static void main(String[] args) {
		long binary = decimalToBinary(155);
		System.out.println(binary);

	}
	
	public static long decimalToBinary(int n) {
		int remainder = 1, i =1;
		long binarynum = 0;
		
		while (n!=0) {
			remainder = n % 2;
			n = n / 2;
			
			binarynum += remainder * i;
			i = i* 10;
		}
		
		return binarynum;
	}

}
