import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner text = new Scanner(System.in);
		System.out.println("Please enter a string value: ");
		String string = text.nextLine();
		System.out.println("User provided string value: " + string);
		int length = string.length();
		String string1 = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			string1 = string1 + string.charAt(i);
		}
		System.out.println("The reverse of the user provided string is: " + string1);
		
		boolean result = isPalindrome(string,string1, length);
		if(result==true) {
			System.out.println("The entered string is a palindrome!");
		}else {
			System.out.println("The entered string is not a palindrome!");
		}
	}
	
	static boolean isPalindrome(String a, String b, int len) {
		boolean value=true;
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();
		
		for(int i=0; i<len;i++) {
			if(arr1[i]!=arr2[i]) {
				value=false;
			}
		}

		return value;
	}
	

}
