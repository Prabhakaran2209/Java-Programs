import java.util.Arrays;

public class sort_intArray_StringArray {

	public static void main(String[] args) {
		int[] my_array1 = {1,3,6,8,9,99,456,55,67,12};
		
		String[] my_array2 = {"Java", "Javascript", "python", "selenium", "protractor"};
		
		System.out.println("Original numeric array is " + Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("Sorted numeric array is " + Arrays.toString(my_array1));
		
		System.out.println("Original string array is " + Arrays.toString(my_array2));
		Arrays.sort(my_array2);
		System.out.println("Sorted string array is " + Arrays.toString(my_array2));
	}

}
