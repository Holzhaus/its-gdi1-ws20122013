public class Artikel {
	public int nummer;
	public String bezeichnung;
	public String kurzbeschreibung;
	public String programmiersprache = "Java";
	public double verkaufspreis = 0.0;
	public Artikel(int nummer) {
		this.nummer = nummer;
	}
	public Artikel(int nummer, String bezeichnung, String kurzbeschreibung, String programmiersprache, double verkaufspreis) {
		this.nummer = nummer;
		this.bezeichnung = bezeichnung;
		this.kurzbeschreibung = kurzbeschreibung;
		this.programmiersprache = programmiersprache;
		this.verkaufspreis = verkaufspreis;
	}
	public int getNummer() {
		return nummer;
	}
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public String getKurzbeschreibung() {
		return kurzbeschreibung;
	}
	public void setKurzbeschreibung(String kurzbeschreibung) {
		this.kurzbeschreibung = kurzbeschreibung;
	}
	public String getProgrammiersprache() {
		return programmiersprache;
	}
	public void setProgrammiersprache(String programmiersprache) {
		this.programmiersprache = programmiersprache;
	}
	public double getVerkaufspreis() {
		return verkaufspreis;
	}
	public void setVerkaufspreis(double verkaufspreis) {
		this.verkaufspreis = verkaufspreis;
	}
	 
}
