import inout.Console;
public class Hexdezimalzahlen {
	public static void main(String[] args) {
		System.out.println("Frage: Ist dieses Zeichen eine HEX-Zahl?");
		System.out.print("Bitte Zeichen eingeben: ");
		char eingabe = Console.readChar();
		if(( '0' <= eingabe && eingabe <= '9' )
		|| ( 'a' <= eingabe && eingabe <= 'f' )
		|| ( 'A' <= eingabe && eingabe <= 'F' )) {
			System.out.println("Ja, '"+eingabe+"' ist eine HEX-Zahl!");
		} else {
			System.out.println("Nein, '"+eingabe+"' ist keine HEX-Zahl!");
		}
	}
}
/* Ausgabe:
Frage: Ist dieses Zeichen eine HEX-Zahl?
Bitte Zeichen eingeben: A
Ja, 'A' ist eine HEX-Zahl!
*/