
public class elementcontain_inArray {

	public static void main(String[] args) {
		int b[] = {1234, 2345, 666, 6789};
		System.out.println(contains (b, 666));

	}
	
	public static boolean contains (int[] arr, int item) {
		for (int n : arr) {
			if(n == item)
				return true;
		}
		return false;
	}
	

}
