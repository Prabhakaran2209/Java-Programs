
public class BinaryToDecimal {

	public static void main(String[] args) {
		int decimal = binarytoDecimal(10011011);
		System.out.println(decimal);
		

	}
	
	public static int binarytoDecimal (long num) {
		int decimalnum = 0;
		int i = 0;
		while(num != 0) {
			long remainder = num % 10;
			num = num / 10;
			
			//decimalnum = decimalnum + (remainder * Math.pow(2, i));
			decimalnum += remainder * Math.pow(2, i);
			++i;	
		}
		
		return
				decimalnum;
		
	}

}
