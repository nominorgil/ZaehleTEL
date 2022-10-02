import java.util.Locale;
import java.util.Scanner;

public class ZaehleTEL {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zeichenfolge ein: ");
		String eingabe = scanner.nextLine();
		char[] zeichen = eingabe.toCharArray();
		countTEL(zeichen);
		scanner.close();

	}

	public static void countTEL(char[] zeichen) {
		int tAnzahl = 0;
		int eAnzahl = 0;
		int lAnzahl = 0;

		for (int i = 0; i<zeichen.length; i++){
			if (zeichen[i] == 't' || zeichen[i] == 'T') {
				tAnzahl++;
			}
			if (zeichen[i] == 'e' || zeichen[i] == 'E') {
				eAnzahl++;
			}
			if (zeichen[i] == 'l' || zeichen[i] == 'L') {
				lAnzahl++;
			}

		}
		System.out.println("Der Buchstabe ’t’ kommt " + tAnzahl + " mal vor.");
		System.out.println("Der Buchstabe ’e’ kommt " + eAnzahl + " mal vor.");
		System.out.println("Der Buchstabe ’l’ kommt " + lAnzahl + " mal vor.");
		System.out.println("git integration worked.");
	}
}