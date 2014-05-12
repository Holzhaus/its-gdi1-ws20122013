public class Telefon {
	/**
	 * @author Jan Holthuis
	 */
	private String nummer;
	private int typ;
	public Telefon(String nummer, int typ) {
		this.nummer = nummer;
		this.typ = typ;
	}
	public String getNummer() {
		return this.nummer;
	}
	public int getTyp() {
		return this.typ;
	}
	public void waehlen() {
	}
}
