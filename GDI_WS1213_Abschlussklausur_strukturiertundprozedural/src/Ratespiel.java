import inout.Console;
public class Ratespiel {
	private static String[] woerter = {"BLUMEN", "PALMEN", "MOPEDS", "TICKER", "ZEBRAS"};
	private static int versuche = 7;
	public static void main(String[] args) {
		Ratespiel.spielen();
	}
	public static int zufall(int min, int max) {
		return (int) (Math.random()*max+min);
	}
	public static void spielen() {
		int i;
		int versuche = Ratespiel.versuche;
		boolean erraten = false;
		char[] eingabe = new char[6];
		char[] loesungswort = Ratespiel.woerter[Ratespiel.zufall(0, Ratespiel.woerter.length)].toCharArray();
		while (!erraten && versuche>0) {
			System.out.println((Ratespiel.versuche-versuche+1)+". Versuch: ");
			eingabe = Console.readString().toUpperCase().toCharArray();
			erraten = true;
			for(i=0;i<6;i++) {
				if(eingabe.length>=6 && eingabe[i] == loesungswort[i]) {
					System.out.print(loesungswort[i]);
				} else {
					System.out.print("_");
					erraten = false;
				}
			}
			System.out.println();
			versuche--;
		}
		if(erraten) {
			System.out.println("RICHTIG!");
		} else {
			System.out.print("Du hast leider verloren. Das Loesungswort war ");
			for(i=0;i<6;i++) {
				System.out.print(loesungswort[i]);
			}
			System.out.println(".");
		}
	}
}

/* Ausgabe:
1. Versuch: 
EEEEEE
___E__
2. Versuch: 
MMMESS
M__E_S
3. Versuch: 
MOPEDS
MOPEDS
RICHTIG!
*/
