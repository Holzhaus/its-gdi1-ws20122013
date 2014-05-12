/**
 * @autor Jan Holthuis
 */
// Datum: 03.12.2012
import inout.Console;
public class DiscCollection {
	private String[][] cds;
	public static void main(String[] args) {
		DiscCollection collection;
		// Wieviele CDs sollen gespeichert werden?
		System.out.print("Normalerweise kannst du 100 CDs in der Sammlung speichern.\n" +
				           "Moechtest du diese Anzahl aendern? (j/N) ");
		if(Console.readString().equalsIgnoreCase("j")) {
			System.out.print("Wieviele CDs willst du speichern? ");
			collection = new DiscCollection(Console.readInt());
		} else {
			collection = new DiscCollection();
		}
		
		// Einige Anfangswerte fuer die Sammlung
		collection.addCd("Herbie Hancock", "Jazz Africa"); // Holthuis → H, Jan → J 
		collection.addCd("Miles Davis", "Kind of Blue");
		collection.addCd("John Coltrane", "A Love Supreme");
		collection.addCd("Erroll Garner","Concert By the Sea");
		collection.addCd("Charles Mingus","Mingus Ah Um");
		collection.addCd("Howard McGhee","The Bop Master"); // Holthuis → H
		collection.addCd("Horace Silver","Live at Newport '58"); // Holthuis → H
		collection.addCd("Art Blakey","Jazz Messages"); // Jan → J
		
		int actionNumber, id = 0;
		boolean terminate = false;
		String[] cd = new String[2];
		
		// CLI Loop
		while (!terminate) {
			//Was willst du tun?
			System.out.println("Was willst du tun? (Bitte Zahl eingeben)");
			System.out.println("  1. CD zur Sammlung hinzufügen");
			System.out.println("  2. CD aus der Sammlung löschen");
			System.out.println("  3. Sammlung nach CD durchsuchen");
			System.out.println("  4. Sammlung anzeigen");
			System.out.println("  5. Programm beenden");
			actionNumber = Console.readInt();
			System.out.println();
			switch(actionNumber) {
				case 1:
					// CD hinzufügen
					System.out.println("Bitte gib den Interpreten der CD ein:");
					cd[0] = Console.readString();
					System.out.println("Bitte gib den Titel der CD ein:");
					cd[1] = Console.readString();
					collection.addCd(cd[0], cd[1]);
					break;
				case 2:
					// CD entfernen
					System.out.print("Kennst du den Sammlungs-Index der CD? (j/N) ");
					if(Console.readString().equalsIgnoreCase("j")) {
						System.out.print("Bitte gib jetzt den Sammlungs-Index der CD ein: ");
						collection.removeCd(Console.readInt());
					} else	{
						System.out.print("Bitte gib jetzt den Namen der CD ein: ");
						collection.removeCd(Console.readString());
					}
					break;
				case 3:
					// CD suchen
					System.out.print("Bitte gib jetzt den Namen der CD ein: ");
					id = collection.getDiscId(Console.readString());
					if(id==-1) {
						System.out.println("Nichts gefunden.");
						break;
					}	
					cd = collection.getCds()[id];
					System.out.printf("%3d  %25s  %25s\n", id, cd[0], cd[1]);
					break;
				case 4:
					// Sammlung anzeigen
					collection.printCds();
					break;
				case 5:
					// Programm beenden
					terminate = true;
					break;
				default:
					// Sammlung ausgeben
					System.out.print("Eingabe nicht erkannt...");
			}
		}
	}
	public DiscCollection() {
		this.cds = new String[100][2]; // 100 CDs Speicherkapazität
	}
	public DiscCollection(int collectionSize) {
		this.cds = new String[collectionSize][2]; // Variable Arraygröße
	}
	public String[][] getCds() {
		return this.cds; // Falls mal eine Externe Klasse die CDs auslesen will (cds-Array ist private und somit schreibgeschützt)

	}
	public void printCds() {
			// Alle CDs ausgeben (alle Datensätze außer null-Datensätze)
			int i = 0;
	        for (String[] cd: this.cds) {
	        	if (cd[0] != null && cd[1] != null)
	        		System.out.printf("%3d  %25s  %25s\n", i, cd[0], cd[1]);
	        	i++;
	        }
	        System.out.println();
	}
	public void addCd(String artist, String title) {
			// Freien Datensatz suchen und CD-Daten einfügen
	        for (String[] cd: this.cds) {
	        	if (cd[0] == null && cd[1] == null) {
	        		cd[0] = artist;
	        		cd[1] = title;
	        		break;
	        	}
	        }
	        return;
	}
	public void removeCd(int id) {
		// Mit bekanntem ArrayIndex löschen (überschreiben mit null)
		this.cds[id] = new String[] {null, null};
	}
	public void removeCd(String queryString) {
		// Erst Index suchen, dann löschen (überschreiben mit null) 
		int id = this.getDiscId(queryString);
		if(id>=0) {
			this.cds[id] = new String[] {null, null};
		}	
	} 
	public int getDiscId(String queryString) {
			int i = 0;
	        	for(String[] cd: this.cds) {
	        			// queryString in den beiden ArrayElementen der CD suchen 
	        			if(cd[0]!=null && cd[1]!=null) {
	        				if(cd[0].toLowerCase().indexOf(queryString.toLowerCase())!=-1 ||
	        				   cd[1].toLowerCase().indexOf(queryString.toLowerCase())!=-1) {
	        					return i; //Index zurückgeben
	        				}
	        			}
					i++;
	        	}
	        	return -1;
	        }
}

/*
 * Ausgabe:
Normalerweise kannst du 100 CDs in der Sammlung speichern.
Moechtest du diese Anzahl aendern? (j/N) n
Was willst du tun? (Bitte Zahl eingeben)
  1. CD zur Sammlung hinzufügen
  2. CD aus der Sammlung löschen
  3. Sammlung nach CD durchsuchen
  4. Sammlung anzeigen
  5. Programm beenden
2

Kennst du den Sammlungs-Index der CD? (j/N) j
Bitte gib jetzt den Sammlungs-Index der CD ein: 0
Was willst du tun? (Bitte Zahl eingeben)
  1. CD zur Sammlung hinzufügen
  2. CD aus der Sammlung löschen
  3. Sammlung nach CD durchsuchen
  4. Sammlung anzeigen
  5. Programm beenden
1

Bitte gib den Interpreten der CD ein:
Test
Bitte gib den Titel der CD ein:
Tesssst
Was willst du tun? (Bitte Zahl eingeben)
  1. CD zur Sammlung hinzufügen
  2. CD aus der Sammlung löschen
  3. Sammlung nach CD durchsuchen
  4. Sammlung anzeigen
  5. Programm beenden
4

  0                       Test                    Tesssst
  1                Miles Davis               Kind of Blue
  2              John Coltrane             A Love Supreme
  3              Erroll Garner         Concert By the Sea
  4             Charles Mingus               Mingus Ah Um
  5              Howard McGhee             The Bop Master
  6              Horace Silver        Live at Newport '58
  7	                Art Blakey              Jazz Messages

Was willst du tun? (Bitte Zahl eingeben)
  1. CD zur Sammlung hinzufügen
  2. CD aus der Sammlung löschen
  3. Sammlung nach CD durchsuchen
  4. Sammlung anzeigen
  5. Programm beenden
5
*/