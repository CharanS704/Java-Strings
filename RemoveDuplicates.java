import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String string1 = "";
		boolean repeated;
		Scanner text = new Scanner(System.in);
		System.out.println("Please enter a string value: ");
		String string = text.nextLine();
		System.out.println("User provided string value: "+string);
		char[] ch = string.toCharArray();
		for (int i = 0; i < string.length(); i++) {
			repeated =false;
			for (int j = i+1; j < string.length(); j++) {
				if(ch[i] == ch[j]) {
					repeated = true;
					break;
				}

			}
			if(!repeated) {
				string1 = string1 + ch[i];
			}

		}
		System.out.println("String value after removing the duplicates: "+string1);

	}
}
