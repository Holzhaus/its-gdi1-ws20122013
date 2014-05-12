/**
 * @autor Jan Holthuis
 */
// Datum: 16.12.2012
public class OptiTravel3 {
	public static void main(String[] args) {
		// Kundendaten initialisieren
		String[][] clientArray = new String[][] {
				new String[] { "921", "Holthuis", "Jan" , "Universitaetsstr. 150, 44801 Bochum"},
				new String[] { "435", "Mueller", "Philipp" , "Thaelmannstr. 4, 12345 Berlin"},
				new String[] { "205", "Koebele", "Patrik", "Hoffnungstr. 18, 45127 Essen"},
				new String[] { "564", "Holz", "Hans Heinz", "Kuusinenweg 54a, 38235 Marburg" },
				new String[] { "345", "Schernikau", "Ronald", "Togliattistr. 12, 378643 Dresden"}
		};
		//AUFGABE A
		System.out.println("a)");
		/*
		 * 1.	Position: Kundennummer
		 * 2.	Position: Name
		 * 3.	Position: Vorname
		 * 4.	Position: Adresse
		 */
		String[] columnNames = new String[] {
				"Kundennummer", 
				"Name", 
				"Vorname",
				"Adresse"
		}; 
		// Alle möglichen Sortierungen ausgaben
		for (int i = 0; i < columnNames.length; i++) {
			System.out.printf("Sortiert nach %s (%d, aufsteigend):\n", columnNames[i], i);
			clientArray = sort(clientArray, i, true);
			for (String[] client: clientArray) {
				System.out.printf("%6s  %15s  %15s  %s\n", client[0], client[1], client[2], client[3]);
			}
			System.out.printf("Sortiert nach %s (%d, absteigend):\n", columnNames[i], i);
			clientArray = sort(clientArray, i, false);
			for (String[] client: clientArray) {
				System.out.printf("%6s  %15s  %15s  %s\n", client[0], client[1], client[2], client[3]);
			}
		}
		// AUFGABE B
		System.out.println("b)");
		String q = "olth";
		String[] searchResult = search(clientArray, q);
		// Hier wird das Ergebnis der Suche ausgegeben
		System.out.printf("Ergebnis fuer Suche nach '%s':\n", q);
		if(searchResult!=null) {
			System.out.printf("%6s  %15s  %15s  %s", searchResult[0], searchResult[1], searchResult[2], searchResult[3]);
		} else {
			System.out.println("Nichts gefunden...");
		}
	}
	// Suchfunktion
	public static String[] search(String[][] clientArray, String queryString) {
		// Durch das Array iterieren und schauen, ob der Suchstring
		// in den Spalten 1 und 2 eines Datensatzes vorkommt
		for(String[] client: clientArray) {
			if(client[1].toLowerCase().indexOf(queryString.toLowerCase())!=-1 ||
					client[2].toLowerCase().indexOf(queryString.toLowerCase())!=-1) {
				return client;
			}
		}
		return null;
	}
	// Sortieren durch Auswahl (SelectionSort)
	public static String[][] sort(String[][] clientArray, int column, boolean ascending) {
		String[] min, merke;
		int pos, posMin;
		// Sortieren und Vertauschen
		for (int i = 0; i < clientArray.length; i++)
		{
			// Kleinste Position ab i suchen
			posMin = i;
			min = clientArray[i];
			for (pos = i + 1; pos < clientArray.length; pos++)
				if (clientArray[pos][column].compareTo(min[column]) < 0) // Abfrage auf <
				{
					min = clientArray[pos];
					posMin = pos; // Kleinste Position merken
				}
			// Vertauschen
			merke = clientArray[i];
			clientArray[i] = clientArray[posMin];
			clientArray[posMin] = merke;
		}
		if (!ascending) {
			// Für's absteigende sortieren einfach nur aufsteigend
			// sortieren und anschließend das Array umdrehen
			for(int i = 0; i < clientArray.length/2; i++)
			{
				merke = clientArray[i];
				clientArray[i] = clientArray[clientArray.length-1-i];
				clientArray[clientArray.length-1-i] = merke;
			}
		}
		return clientArray;
	}
}
/*
 * Ausgabe:
a)
Sortiert nach Kundennummer (0, aufsteigend):
   205          Koebele           Patrik  Hoffnungstr. 18, 45127 Essen
   345       Schernikau           Ronald  Togliattistr. 12, 378643 Dresden
   435          Mueller          Philipp  Thaelmannstr. 4, 12345 Berlin
   564             Holz       Hans Heinz  Kuusinenweg 54a, 38235 Marburg
   921         Holthuis              Jan  Universitaetsstr. 150, 44801 Bochum
Sortiert nach Kundennummer (0, absteigend):
   921         Holthuis              Jan  Universitaetsstr. 150, 44801 Bochum
   564             Holz       Hans Heinz  Kuusinenweg 54a, 38235 Marburg
   435          Mueller          Philipp  Thaelmannstr. 4, 12345 Berlin
   345       Schernikau           Ronald  Togliattistr. 12, 378643 Dresden
   205          Koebele           Patrik  Hoffnungstr. 18, 45127 Essen
Sortiert nach Name (1, aufsteigend):
   921         Holthuis              Jan  Universitaetsstr. 150, 44801 Bochum
   564             Holz       Hans Heinz  Kuusinenweg 54a, 38235 Marburg
   205          Koebele           Patrik  Hoffnungstr. 18, 45127 Essen
   435          Mueller          Philipp  Thaelmannstr. 4, 12345 Berlin
   345       Schernikau           Ronald  Togliattistr. 12, 378643 Dresden
Sortiert nach Name (1, absteigend):
   345       Schernikau           Ronald  Togliattistr. 12, 378643 Dresden
   435          Mueller          Philipp  Thaelmannstr. 4, 12345 Berlin
   205          Koebele           Patrik  Hoffnungstr. 18, 45127 Essen
   564             Holz       Hans Heinz  Kuusinenweg 54a, 38235 Marburg
   921         Holthuis              Jan  Universitaetsstr. 150, 44801 Bochum
Sortiert nach Vorname (2, aufsteigend):
   564             Holz       Hans Heinz  Kuusinenweg 54a, 38235 Marburg
   921         Holthuis              Jan  Universitaetsstr. 150, 44801 Bochum
   205          Koebele           Patrik  Hoffnungstr. 18, 45127 Essen
   435          Mueller          Philipp  Thaelmannstr. 4, 12345 Berlin
   345       Schernikau           Ronald  Togliattistr. 12, 378643 Dresden
Sortiert nach Vorname (2, absteigend):
   345       Schernikau           Ronald  Togliattistr. 12, 378643 Dresden
   435          Mueller          Philipp  Thaelmannstr. 4, 12345 Berlin
   205          Koebele           Patrik  Hoffnungstr. 18, 45127 Essen
   921         Holthuis              Jan  Universitaetsstr. 150, 44801 Bochum
   564             Holz       Hans Heinz  Kuusinenweg 54a, 38235 Marburg
Sortiert nach Adresse (3, aufsteigend):
   205          Koebele           Patrik  Hoffnungstr. 18, 45127 Essen
   564             Holz       Hans Heinz  Kuusinenweg 54a, 38235 Marburg
   435          Mueller          Philipp  Thaelmannstr. 4, 12345 Berlin
   345       Schernikau           Ronald  Togliattistr. 12, 378643 Dresden
   921         Holthuis              Jan  Universitaetsstr. 150, 44801 Bochum
Sortiert nach Adresse (3, absteigend):
   921         Holthuis              Jan  Universitaetsstr. 150, 44801 Bochum
   345       Schernikau           Ronald  Togliattistr. 12, 378643 Dresden
   435          Mueller          Philipp  Thaelmannstr. 4, 12345 Berlin
   564             Holz       Hans Heinz  Kuusinenweg 54a, 38235 Marburg
   205          Koebele           Patrik  Hoffnungstr. 18, 45127 Essen
b)
Ergebnis fuer Suche nach 'olth':
   921         Holthuis              Jan  Universitaetsstr. 150, 44801 Bochum
 */
