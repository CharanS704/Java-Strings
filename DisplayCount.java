import java.util.Scanner;

public class DisplayCount {

	public static void main(String[] args) {
		
		int countSpecialChar=0;
		int countVowels=0;
		int countConsonents=0;
		Scanner text = new Scanner(System.in);
		System.out.println("Please enter a string value: ");
		String string = text.nextLine();
		System.out.println("User provided string value: "+string);
		String convToLower = string.toLowerCase();
		char[] ch = convToLower.toCharArray();
		for (int i = 0; i < string.length(); i++) {
			if(ch[i]>=32 && ch[i]<=47 || ch[i]>=58 && ch[i]<=64 || ch[i]>=91 && ch[i]<=96 || ch[i]>=123 && ch[i]<=126) {
				countSpecialChar++;
			}
			if(ch[i]==97 || ch[i]==101 || ch[i]==105 || ch[i]==111 || ch[i]==117) {
				countVowels++;
			}
			if(ch[i]>97 && ch[i]<=122 && ch[i]!=101 && ch[i]!=105 && ch[i]!=111 && ch[i]!=117) {
				countConsonents++;
			}
		}
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("Please find below the count of special charcters, vowels and consonents from the provided string:  ");
		System.out.println("Count of Special characters: "+countSpecialChar);
		System.out.println("Count of vowels: "+countVowels);
		System.out.println("Count of consonents: "+countConsonents);

	}

}
