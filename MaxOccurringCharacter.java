import java.util.Scanner;

public class MaxOccurringCharacter {

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
		
		Scanner text = new Scanner(System.in);
		System.out.println("Please enter the first string value: ");
		String userString = text.nextLine();
		String string1 = userString.replace(" ", "");
		System.out.println("User provided first string value: " + userString);
		
		MaxOccurringCharacter maxChar = new MaxOccurringCharacter();
		String  lowerCaseString= maxChar.convToLowerCase(string1);
		
		String sortedString = maxChar.sortString(lowerCaseString);
		
		char[] ch = sortedString.toCharArray();
		int[] ar = new int[26];
		
		for(int i=0;i<ch.length;i++) {
			int index = ch[i]-97;
			ar[index]++;
		}
		System.out.println();
		
		int max=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];//finding the max from the index array
			}
		}
		
		int charIndex=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==max) {
				charIndex=i;//finding the index of the max element 
			}
		}
		System.out.println("The maximum occuring character in the user provided string is: "+((char)(charIndex+97)));

	}

}
