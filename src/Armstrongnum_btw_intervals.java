
public class Armstrongnum_btw_intervals {

	public static void main(String[] args) {
		int low = 100;
		int num = low;
		int high = 200;
		
		while(low<high) {
			double result = 0;
			
			while(num != 0) {
				int n = num % 10;
				result = result + Math.pow(n, 3);
				num = num / 10;	
			}
			
			if(result == low) {
				System.out.println(low);
			}
			low ++;    //not working, need to check
			
		}

	}

}
