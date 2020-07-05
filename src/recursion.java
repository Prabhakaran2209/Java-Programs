
public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =20;
		int sum = addnum(num);
		System.out.println("sum of " +num+ " is " +sum );

	}
	
	public static int addnum(int num) {
		
		if(num!=0) {
			return num+addnum(num-1);
		}
		else
			return num;
	}

}