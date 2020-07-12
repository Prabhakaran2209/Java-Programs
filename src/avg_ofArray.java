
public class avg_ofArray {

	public static void main(String[] args) {
		int [] a = {1,3,4,5,6,7,8,9};
		int sum = 0;
		int total_elements = a.length;
		
		for (int i = 0; i< a.length; i++) {
			sum = sum+ a[i];
		}
		
		System.out.println("Average of the array is "+ (sum/total_elements));

	}

}
