import inout.Console;
public class WaistToHeightUI {
	public static void main(String[] args) {
		System.out.print("Bitte geben Sie Ihr Alter ein: ");
		int alter = Console.readInt();
		System.out.print("Bitte geben Sie Ihren Tallienumfang in cm ein: ");
		int umfang = Console.readInt();
		System.out.print("Bitte geben Sie Ihren Koerpergroesse in cm ein: ");
		int groesse = Console.readInt();
		double wthr = WaistToHeight.berechne(umfang, groesse);
		System.out.print("Ihr WtHR ist: "+wthr);
		switch(WaistToHeight.ordneEin(alter, wthr)) {
			case UNTERGEWICHT:
				System.out.println("Sie sind untergewichtig.");
				break;
			case NORMALGEWICHT:
				System.out.println("Sie sind normal.");
				break;
			case UEBERGEWICHT:
				System.out.println("Sie sind uebergewichtig.");
				break;
			case ADIPOSITAS:
				System.out.println("Sie sind fett, Mann.");
				break;
			case SCHWEREADIPOSITAS:
				System.out.println("Sie sind schwer adipoes.");
				break;
			default:
				System.out.println("Alter, kein Plan.");
			}
	}
}
