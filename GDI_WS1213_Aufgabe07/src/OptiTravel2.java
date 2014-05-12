/**
 * @autor Jan Holthuis
 */
// Datum: 03.12.2012
import java.util.Arrays;
import java.util.Comparator;
public class OptiTravel2 {
	public static void main(String[] args) {
	        String[][] clientArray = new String[][] {
	                new String[] { "435", "Mueller", "Philipp" , "Thaelmannstr. 4, 12345 Berlin"},
	                new String[] { "734", "Steigerwald", "Robert", "Gramsciallee 87, 67890 Leipzig" },
	                new String[] { "205", "Koebele", "Patrik", "Hoffnungstr. 18, 45127 Essen"},
	                new String[] { "564", "Holz", "Hans Heinz", "Kuusinenweg 54a, 38235 Marburg" },
	                new String[] { "345", "Schernikau", "Ronald", "Togliattistr. 12, 378643 Dresden"}
	        };
	        
	        System.out.println("a)");
	        clientArray = sort(clientArray, 0, true);
	        for (String[] client: clientArray) {
	        	/*
	        	 * 1.	Position: Kundennummer
	        	 * 2.	Position: Name
	        	 * 3.	Position: Vorname
	        	 * 4.	Position: Adresse
	        	 */
	        	System.out.printf("%6s  %15s  %15s  %s\n", client[0], client[1], client[2], client[3]);
	        }
	        
	        System.out.println("b)");
	        String q = "iger";
	        String[] searchResult = search(clientArray, q);
	        System.out.printf("Ergebnis fuer Suche nach '%s':\n", q);
	        if(searchResult!=null) {
	        	System.out.printf("%6s  %15s  %15s  %s", searchResult[0], searchResult[1], searchResult[2], searchResult[3]);
	        } else {
	        	System.out.println("Nichts gefunden...");
	        }
	}
	public static String[] search(String[][] clientArray, String queryString) {
	        	for(String[] client: clientArray) {
	        			if(client[1].toLowerCase().indexOf(queryString.toLowerCase())!=-1 ||
	        			   client[2].toLowerCase().indexOf(queryString.toLowerCase())!=-1) {
	        				return client;
	        			}
	        	}
	        	return null;
	        }

	public static String[][] sort(String[][] clientArray, final int column, final boolean ascending) {
		Arrays.sort(clientArray, new Comparator<String[]>() {
            @Override public int compare(String[] entry1, String[] entry2) {
                int cmp = entry1[column].compareTo(entry2[column]);
                if(!ascending) {
                	return -cmp;
                } else {
                	return cmp;
                }
            }
		});
		return clientArray;
	}
}
/*
 * Ausgabe:
a)
   205          Koebele           Patrik  Hoffnungstr. 18, 45127 Essen
   345       Schernikau           Ronald  Togliattistr. 12, 378643 Dresden
   435          Mueller          Philipp  Thaelmannstr. 4, 12345 Berlin
   564             Holz       Hans Heinz  Kuusinenweg 54a, 38235 Marburg
   734      Steigerwald           Robert  Gramsciallee 87, 67890 Leipzig
b)
Ergebnis fuer Suche nach 'iger':
   734      Steigerwald           Robert  Gramsciallee 87, 67890 Leipzig
 */
