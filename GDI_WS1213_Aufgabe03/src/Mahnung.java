/**
 * @author Jan Holthuis
 */
// Datum 03.12.2012
import inout.Console;
public class Mahnung {
	public static int invoiceId = 1337; // this is just for fun
	public static boolean printText(int textId) {
		switch(textId) { // texts taken from http://www.mahnerfolg.de/
	    case 1:
	    	System.out.printf("Sehr geehrter Herr Kunde,\n" +
	    			"\n" +
	    			"in Bezug auf unsere Rechnung Nr.: %d mussten wir heute feststellen, dass Ihre Zahlung bei uns noch nicht eingegangen ist. Sollten Sie die Zahlung bereits vorgenommen haben, dann setzen Sie sich bitte mit uns in Verbindung, um den Sachverhalt zu klären. Möglicherweise konnten wir Ihre Zahlung nicht zuordnen, weil z.B. der Verwendungszweck nicht korrekt angegeben wurde.\n" +
	    			"\n" +
	    			"Mit freundlichen Grüßen\n" +
	    			"\n" +
	    			"Firma Muster\n", invoiceId);
					return true;
		case 2:
			System.out.printf("Sehr geehrter Herr Kunde,\n" +
					"\n" +
					"in Bezug auf unsere Rechnung Nr.: %d und unsere 1. Mahnung mussten wir heute feststellen, dass Ihre Zahlung bei uns noch immer nicht eingegangen ist. Sicherlich haben Sie bislang vergessen, die Zahlung vorzunehmen. Dies sollten Sie nun jedoch umgehend nachholen.\n" +
					"Sollten Sie die Zahlung bereits vorgenommen haben, dann setzen Sie sich bitte mit uns in Verbindung, um dies abzuklären. Möglicherweise konnten wir Ihre Zahlung nicht zuordnen, weil z.B. der Verwendungszweck nicht korrekt angegeben wurde.\n" +
					"\n" +
					"Mit freundlichen Gruessen\n" +
					"Firma Muster\n", invoiceId);
					return true;
		case 3:
			System.out.printf("Sehr geehrter Herr Kunde,\n" +
					"\n" + 
					"in Bezug auf unsere Rechnung Nr.: %d und unsere 1. sowie auch unsere 2. Mahnung mussten wir heute feststellen, dass Ihre Zahlung bei uns noch immer nicht eingegangen ist. Dies bedeutet einen einseitigen Vertragsbruch Ihrerseits. Nach geltendem Recht könnten wir die offene Forderung bereits jetzt bei Gericht anmelden. Wir geben Ihnen jedoch trotzdem noch eine letzte Möglichkeit, Ihre vertragliche Verpflichtung zu erfüllen, indem Sie unverzüglich die ausstehende Summe in Höhe von 243.00 EURO an uns zur Zahlung bringen.\n" +
					"Nach geltendem Recht sind wir befugt, die anfallenden Kosten geltend zu machen. Alle bereits angefallenen und noch entstehenden Kosten (Mahnkosten, Rechtsanwalts- und Gerichtskosten) gehen zu Ihren Lasten.\n" +
					"\n" +
					"Vermeiden Sie unnötigen Ärger und weitere Kosten und erfüllen Sie den mit uns abgeschlossenen Vertrag!\n", invoiceId);
					return true;
		default:
			System.out.println("FEHLER: Der angegebene Mahnungstext wurde nicht gefunden.");
			return false;
		}
	}
	public static void printLine() {
		System.out.println("______________________");
	}
	public static void main(String[] args) {
		boolean notFinished = true;
		boolean success;
		while(notFinished) {
				// print menu
				System.out.println("Auswahl von Mahntexten");
				printLine();
				System.out.println("Mahntext fuer 1. Mahnung: 1\n" +
				"Mahntext fuer 2. Mahnung: 2\n" +
				"Mahntext fuer 3. Mahnung: 3");
				printLine();
				System.out.print("Bitte wählen Sie: ");
				int textId = Console.readInt();
				printLine();
				success = printText(textId);
				if(success) {
					notFinished = false;
				} else { //if invalid choice, let user decide if he wants to continue
					System.out.print("Nochmal versuchen? (j/N) ");
					notFinished = (Console.readString().toLowerCase().equals("j"));
					printLine();
				}
		}
	}
}
/*
 * Ausgabe:
Auswahl von Mahntexten
______________________
Mahntext fuer 1. Mahnung: 1
Mahntext fuer 2. Mahnung: 2
Mahntext fuer 3. Mahnung: 3
______________________
Bitte wählen Sie: 5
______________________
FEHLER: Der angegebene Mahnungstext wurde nicht gefunden.
Nochmal versuchen? (j/N) j
______________________
Auswahl von Mahntexten
______________________
Mahntext fuer 1. Mahnung: 1
Mahntext fuer 2. Mahnung: 2
Mahntext fuer 3. Mahnung: 3
______________________
Bitte wählen Sie: 2
______________________
Sehr geehrter Herr Kunde,

in Bezug auf unsere Rechnung Nr.: 1337 und unsere 1. Mahnung mussten wir heute feststellen, dass Ihre Zahlung bei uns noch immer nicht eingegangen ist. Sicherlich haben Sie bislang vergessen, die Zahlung vorzunehmen. Dies sollten Sie nun jedoch umgehend nachholen.
Sollten Sie die Zahlung bereits vorgenommen haben, dann setzen Sie sich bitte mit uns in Verbindung, um dies abzuklären. Möglicherweise konnten wir Ihre Zahlung nicht zuordnen, weil z.B. der Verwendungszweck nicht korrekt angegeben wurde.

Mit freundlichen Gruessen
Firma Muster

*/