package Assignments;

public class ReverseString {

	public static void main(String[] args) {
		String orig = "hello";
		String rev = " ";
	//	System.out.println("reverse" + rev);
		
		
		int len = orig.length();
		for(int i = len-1; i>=0;i--)
		rev = rev +orig.charAt(i);
		System.out.println(rev);
	}
}


	


