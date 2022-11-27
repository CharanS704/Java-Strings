import java.util.Scanner;

public class Pangram {
	
	public String convToLowerCase(String oldString) {
		String newString1 = "";
		for (int i = 0; i < oldString.length(); i++) {
			if (oldString.charAt(i) >= 65 && oldString.charAt(i) <= 90) {
				newString1 = newString1 + ((char)(oldString.charAt(i) + 32));
			} else {
				newString1 = newString1 + ((char)oldString.charAt(i));
			}
		}
		return newString1;
	}

	public static void main(String[] args) {
		
		Scanner text = new Scanner(System.in);
		System.out.println("Please enter the first string value: ");
		//THE QUICK BROWN FOX JUMPS OVER LAZY DOG
		String string1 = text.nextLine().replace(" ", "");
		boolean flag=true;
		
		Pangram pangram = new Pangram();
		String lowerCaseString = pangram.convToLowerCase(string1);
		
		char[] charArray = lowerCaseString.toCharArray();
		int[] array = new int[26];
		
		for(int i=0;i<charArray.length;i++) {
			int index = charArray[i]-97;
			array[index]++;
		}
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==0) {
				System.out.println("The provided string is not a Pangram!!");
				flag=false;
				break;
			}
		}
		
		if(flag==true) {
			System.out.println("The provided string is a Pangram!!");
		}
		
		
	}

}
