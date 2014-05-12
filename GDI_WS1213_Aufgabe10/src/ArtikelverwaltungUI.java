import inout.Console;
public class ArtikelverwaltungUI {
		public Artikelverwaltung artikelverwaltung = new Artikelverwaltung();
		public void addArtikel() {
			System.out.println("Bitte geben Sie die Artikelnummer ein: ");
			int nummer = Console.readInt();
			Artikel artikel = new Artikel(nummer);
			System.out.println("Bitte geben Sie die Bezeichnung ein: ");
			artikel.bezeichnung = Console.readString();
			System.out.println("Bitte geben Sie die Kurzbeschreibung ein: ");
			artikel.kurzbeschreibung = Console.readString();
			System.out.println("Bitte geben Sie die verwendete Programmiersprache ein: ");
			String programmiersprache = Console.readString();
			if (programmiersprache.length() > 0) {
				artikel.programmiersprache = programmiersprache;
			} else {
				artikel.programmiersprache = "Java";
			}
			System.out.println("Bitte geben Sie den Verkaufspreis ein: ");
			artikel.verkaufspreis = Console.readDoubleComma();
			this.artikelverwaltung.addArtikel(artikel);
		}
		public void removeArtikel() {
			System.out.print("Bitte geben Sie die Artikelnummer des zu loeschenden Artikels ein: ");
			int artikelnummer = Console.readInt();
			this.artikelverwaltung.removeArtikel(artikelnummer);
		}
		public void listArtikel() {
			System.out.println("Artikelnr	Bezeichnung	Sprache	Beschreibung	Verkaufspreis");
			for (Artikel artikel: this.artikelverwaltung.artikelDatenbank) {
				System.out.printf("%d\t%s\t%s\t%s\t%.2f\n", artikel.nummer, artikel.bezeichnung, artikel.programmiersprache, artikel.kurzbeschreibung, artikel.verkaufspreis);
			}
		}
		public static void main(String[] args) {
			ArtikelverwaltungUI app = new ArtikelverwaltungUI();
			boolean run = true;
			while(run) {
				System.out.println("Was moechten sie tun?");
				System.out.println("  1. Artikel hinzufuegen");
				System.out.println("  2. Artikel entfernen");
				System.out.println("  3. Alle Artikel anzeigen");
				System.out.println("  4. Programm beenden");
				switch(Console.readInt()) {
				case 1:
					app.addArtikel();
					break;
				case 2:
					app.removeArtikel();
					break;
				case 3:
					app.listArtikel();
					break;
				default:
					run = false;
			}
		}
	}
}
/*
 * Ausgabe
Was moechten sie tun?
  1. Artikel hinzufuegen
  2. Artikel entfernen
  3. Alle Artikel anzeigen
  4. Programm beenden
1
Bitte geben Sie die Artikelnummer ein: 
4711
Bitte geben Sie die Bezeichnung ein: 
Diashow
Bitte geben Sie die Kurzbeschreibung ein: 
Dia-Sjow auf HTML-Seite
Bitte geben Sie die verwendete Programmiersprache ein: 

Bitte geben Sie den Verkaufspreis ein: 
29,9
Was moechten sie tun?
  1. Artikel hinzufuegen
  2. Artikel entfernen
  3. Alle Artikel anzeigen
  4. Programm beenden
1
Bitte geben Sie die Artikelnummer ein: 
4712
Bitte geben Sie die Bezeichnung ein: 
Bildbeschriftung
Bitte geben Sie die Kurzbeschreibung ein: 
Erlaubt Beschriftung von Bildern
Bitte geben Sie die verwendete Programmiersprache ein: 
Java
Bitte geben Sie den Verkaufspreis ein: 
99,90
Was moechten sie tun?
  1. Artikel hinzufuegen
  2. Artikel entfernen
  3. Alle Artikel anzeigen
  4. Programm beenden
1
Bitte geben Sie die Artikelnummer ein: 
8726
Bitte geben Sie die Bezeichnung ein: 
100 Piktos
Bitte geben Sie die Kurzbeschreibung ein: 
100 Piktogramme fuer HTML-Seite
Bitte geben Sie die verwendete Programmiersprache ein: 

Bitte geben Sie den Verkaufspreis ein: 
54,5
Was moechten sie tun?
  1. Artikel hinzufuegen
  2. Artikel entfernen
  3. Alle Artikel anzeigen
  4. Programm beenden
3
Artikelnr	Bezeichnung	Sprache	Beschreibung	Verkaufspreis
4711	Diashow	Java	Dia-Sjow auf HTML-Seite	29,90
4712	Bildbeschriftung	Java	Erlaubt Beschriftung von Bildern	99,90
8726	100 Piktos	Java	100 Piktogramme fuer HTML-Seite	54,50
Was moechten sie tun?
  1. Artikel hinzufuegen
  2. Artikel entfernen
  3. Alle Artikel anzeigen
  4. Programm beenden
4
 */
