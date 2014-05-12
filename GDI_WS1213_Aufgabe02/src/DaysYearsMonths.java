import inout.Console;

public class DaysYearsMonths {
	/*
	 * Autor: Jan Holthuis
	 * Datum: 18.11.2012 
	 */
	public static void main(String[] args) {
		int origdays, days, months, years;
		System.out.print("Wieviele Tage? ");
		origdays = Console.readInt();
		// origdays = 400;
		years = origdays / 365;
		months = (origdays % 365) / 30;
		days = (origdays % 365) % 30;
		System.out.printf("%d Tage = %d Jahr(e), %d Monat(e), %d Tag(e)",
				origdays, years, months, days);
	}
	/*
	 * AUSGABE 1 (für J = 10 → Tage = 10*100):
	 * Wieviele Tage? 1000
	 * 1000 Tage = 2 Jahr(e), 9 Monat(e), 0 Tag(e)
	 * 
	 * AUSGABE 2 (für H = 8 → Tage = 8*100):
	 * Wieviele Tage? 800
	 * 800 Tage = 2 Jahr(e), 2 Monat(e), 10 Tag(e)
	 */

}
