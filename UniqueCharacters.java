import java.util.Scanner;

public class UniqueCharacters {
	
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

	public static void main(String[] args) {
		
		
		boolean findIfUnique = false;
		Scanner text = new Scanner(System.in);
		System.out.println("Please enter the first string value: ");
		String userString = text.nextLine();
		String string1 = userString.replace(" ", "");
		System.out.println("User provided first string value: " + userString);
		
		UniqueCharacters uc = new UniqueCharacters();
		String  lowerCaseString= uc.convToLowerCase(string1);
		
		String sortedString = uc.sortString(lowerCaseString);
		
		char[] ch = sortedString.toCharArray();
		int[] ar = new int[26];
		
		for(int i=0;i<ch.length;i++) {
			int index = ch[i]-97;
			ar[index]++;
		}
		System.out.println();
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>1) { // checking for characters present more than once
				findIfUnique = true;
				break;
				}
		}
		if(findIfUnique==true) {
			System.out.println("User provided string contains some characters repeated!!");
		}else {
			System.out.println("User provided string contains all unique characters !!");
		}
		

	}

}
