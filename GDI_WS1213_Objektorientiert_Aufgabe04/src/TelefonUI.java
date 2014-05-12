public class TelefonUI {
	/**
	 * @author Jan Holthuis
	 */
	public static void main(String[] args) {
		// Add users 1
		Nutzer[] users = {null, null};
		users[0] = new Nutzer("Jan Holthuis");
		users[0].endgeraet[0] = new Telefon("123456",0);
		users[0].endgeraet[1] = new Telefon("789010",1);
		users[1] = new Nutzer("Hugo Almeida");
		users[1].endgeraet[0] = new Telefon("765432",0);
		for (Nutzer user: users) {
			if(user != null) {
				System.out.printf("Nutzer: %s\n",user.getName());
				for (int i = 0; i < user.endgeraet.length ; i++) {
					if(user.endgeraet[i] != null) {
						System.out.printf("    Endgeraet %d: ",i);
						if(user.endgeraet[i].getNummer()!=null) {
							System.out.printf("Nummer %s und ", user.endgeraet[i].getNummer());
						}
						System.out.printf("Typ %d\n", user.endgeraet[i].getTyp());
					}
				}
			}
		}
	}
}
/* Ausgabe:
Nutzer: Jan Holthuis
    Endgeraet 0: Nummer 123456 und Typ 0
    Endgeraet 1: Nummer 789010 und Typ 1
Nutzer: Hugo Almeida
    Endgeraet 0: Nummer 765432 und Typ 0
*/
