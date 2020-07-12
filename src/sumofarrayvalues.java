
public class sumofarrayvalues {

	public static void main(String[] args) {
		int[] my_array1 = {1,3,6,8,9,99,456,55,67,12};
		int sum = 0;
		
		for (int i : my_array1) {
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
