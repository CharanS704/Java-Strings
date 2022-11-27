import java.util.Scanner;

public class PrintDuplicates {

	public static void main(String[] args) {
		String string1 = "";
		Scanner text = new Scanner(System.in);
		System.out.println("Please enter a string value: ");
		String string = text.nextLine();
		System.out.println("User provided string value: " + string);
		char[] ch = string.toCharArray();
		for (int i = 0; i < string.length(); i++) {
			for (int j = i + 1; j < string.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.println("The character '"+ch[i]+"' is repeated multiple times in the user provided string");
				}

			}
		}
		

	}

}
