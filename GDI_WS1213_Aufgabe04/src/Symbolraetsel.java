public class Symbolraetsel {

	/*
	 * Autor: Jan Holthuis
	 * Datum: 25.11.2012
	 * 
	 */
	public static void main(String[] args) {
		int h, e, s, t, b;
		for (h = 1; h < 10; h++) {
			for (e = 0; e < 10; e++) {
				if (e == h) {
					continue;
				}
				for (s = 0; s < 10; s++) {
					if (s == h || s == e) {
						continue;
					}
					for (t = 1; t < 10; t++) {
						if (t == h || t == e || t == s) {
							continue;
						}
						for (b = 1; b < 10; b++) {
							if (b == h || b == e || b == s || b == t) {
								continue;
							}
							if (100 * h + 10 * e + s + 100 * t + 10 * h + e == 1000 * b + 100 * e + 10 * s + t) {
								System.out.println("HES + THE = BEST");
								System.out.println("" + h + e + s + " + " + t + h + e + " = " + b + e + s + t); 
							}
						}
					}
				}
			}
		}
	}
}
/*
 * Ausgabe:
 * HES + THE = BEST
 * 426 + 842 = 1268
 * 
 */
