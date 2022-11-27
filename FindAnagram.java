import java.util.Scanner;

public class FindAnagram {

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
	
	public String sortString(String oldString) {
		String sortedString="";
		char[] array = oldString.toCharArray();
		for(int i=0; i<array.length;i++) {
			for(int j=1;j<array.length-i;j++) {
				if(array[j]<array[j-1]) {
					int temp = array[j];
					array[j] = (char)array[j-1];
					array[j-1] = (char)temp;
				}
			}
		}
		
		for(int i=0; i<array.length;i++) {
			sortedString = sortedString + array[i];
		}
		return sortedString;
	}
	
	public boolean checkAnagram(String string1, String string2) {
		boolean flag=true;
		if(string1.length()==string2.length()) {
			for(int i=0;i<string1.length();i++) {
				if(string1.charAt(i)!=string2.charAt(i)) {
					flag=false;
					break;
				}
				
			}
		}else {
			flag=false;
		}
		return flag;
	}

	public static void main(String[] args) {

		Scanner text = new Scanner(System.in);
		System.out.println("Please enter the first string value: ");
		String string1 = text.nextLine().replace(" ", "");
		System.out.println("User provided first string value: " + string1);
		System.out.println("Please enter the second string value: ");
		String string2 = text.nextLine().replace(" ", "");
		System.out.println("User provided second string value: " + string2);

		FindAnagram anagram = new FindAnagram();

		//Converting the user provided strings to lowerCase from user defined method
		String updatedString1 = anagram.convToLowerCase(string1);
		String updatedString2 = anagram.convToLowerCase(string2);
		
		//Sorting the strings to further compare
		String sortedString1= anagram.sortString(updatedString1);
		String sortedString2= anagram.sortString(updatedString2);
		
		
		boolean result = anagram.checkAnagram(sortedString1, sortedString2);
		if(result==true) {
			System.out.println("The provided strings are anagram");
		
		}else {
			System.out.println("The provided strings are not anagram");
		}


	}

}
