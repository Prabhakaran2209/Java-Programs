
public class BinaryToOctal {

	public static void main(String[] args) {
		int decimal = binarytoDecimal(100101);
		int octal = decimaltoOctal(decimal);
		
		System.out.println(octal);

	}
	
	public static int binarytoDecimal (long num) {
		int decimalnum = 0;
		int i = 0;
		while(num != 0) {
			long remainder = num % 10;
			num = num / 10;
			
			decimalnum += remainder * Math.pow(2, i);
			++i;	
		}
		
		return
				decimalnum;
		
	}
	
	public static int decimaltoOctal (int n) {
		int octalnum = 0, i=1;
		
		while(n!=0) {
			octalnum += (n%8) * i;
			n /= 8;
			i*=10;
		}
		
		return
				octalnum;
	}


}
