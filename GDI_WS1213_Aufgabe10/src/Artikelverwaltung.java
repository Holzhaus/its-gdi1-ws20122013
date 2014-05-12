import java.util.ArrayList;
public class Artikelverwaltung {
	public ArrayList<Artikel> artikelDatenbank = new ArrayList<Artikel>();
	public void addArtikel(Artikel artikel) {
		this.artikelDatenbank.add(artikel);
	}
	public boolean removeArtikel(int artikelnummer) {
		int index = 0;
		for(Artikel artikel: this.artikelDatenbank) {
			if(artikel.nummer == artikelnummer) {
				this.artikelDatenbank.remove(index);
				return true;
			}
			index++;
		}
		return false;
	}
	/*public static void main(String[] args) {
		Artikelverwaltung app = new Artikelverwaltung();
		app.addArtikel(new Artikel(45643));
		app.addArtikel(new Artikel(4711, "Diashow", "Dia-Show auf HTML-Seite", "Java", 29.9));
		app.removeArtikel(45643);
	}*/
}
