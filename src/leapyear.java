
public class leapyear {

	public static void main(String[] args) {
		//divisible by 4
		//century years is a leap year only if its divisible by 4
		
		int year = 1900;
		boolean leapyear = false;
		
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					leapyear = true;
				}
				else
					leapyear = false;
			}
			else
				leapyear = true;
		}
		else 
			leapyear = false;
		
		if(leapyear) {
			System.out.println(year + " is a leap year");
		}
		else 
			System.out.println(year + " is not a leap year");

	}

}
