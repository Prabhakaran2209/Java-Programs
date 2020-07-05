
public class DecimalToOctal {

	public static void main(String[] args) {
		int octal = decimalToOcatl(78);
		System.out.println(octal);

	}
	
	public static int decimalToOcatl (int n) {
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
