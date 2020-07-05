
public class string_manipulation {

	public static void main(String[] args) {
		String str = "Hello selenium automation s s";
		String str1 = "Test automation";
		String str2 = "test automation";
		
		int len = str.length();    //length of string
		System.out.println("length of string is " +len);
		
		char c = str.charAt(4);    //get character at particular indx
		System.out.println("Char at 5th index " +c);
		
		System.out.println(str.indexOf('s'));   //returns the index of s in first occurrence
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1));   //returns second occurrence of s from 8 th place
		
		System.out.println(str.indexOf('s', str.indexOf('s')+22));  //returns third occurence
		
		System.out.println(str.indexOf("selenium"));   //index of particular string
		
		System.out.println(str.indexOf("protractor"));   //index of string which is not available, gives -1
		
		//string comparison
		System.out.println(str.equals(str1));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//substring
		System.out.println(str.substring(0, 5));
		System.out.println(str.substring(1));
		
		//trim
		String s = "  prabha karan   ";
		System.out.println(s.trim());   //removing before and after spaces
		System.out.println(s.replace(" ", ""));   //removing all spaces
		
		String date = "05-07-2020";
		System.out.println(date.replace("-", "/"));
		
		//Split
		String test = "hello_test_automation_";
		String testval[] = test.split("_");
		System.out.println(testval[2]);
		
		//String concatenation
		String a = "Java";
		String b = " Typescript";
		System.out.println(a.concat(" + Javascript"));
		System.out.println(a.concat(b));
		
		//merge int and string
		String x = "hello";
		String y = "world";
		int p = 100;
		int q = 200;
		
		System.out.println(p+q);
		System.out.println(x+p);
		System.out.println(x+p+q);
		System.out.println(y+(p+q));
		System.out.println(p+q+x);
		System.out.println(p+q+x+y);
		

	}

}
