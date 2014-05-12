public class Nutzer {
	/**
	 * @author Jan Holthuis
	 */
	private String name;
	public Telefon[] endgeraet = {null, null};
	public String getName() {
		return this.name;
	}
	public Nutzer(String name) {
		this.name = name;
	}
}
