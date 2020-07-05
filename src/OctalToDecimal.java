
public class OctalToDecimal {

	public static void main(String[] args) {
		int decimal = convertoctalToDecimal(116);
		System.out.println(decimal);

	}
	
	public static int convertoctalToDecimal(int num) {
		int decimalnum = 0, i = 0;
		
		while(num != 0) {
			decimalnum += (num % 10) * Math.pow(8, i);
			++i;
			num = num / 10;
		}
		
		return
				decimalnum;
		
	}

}
