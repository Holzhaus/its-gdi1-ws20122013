public  class StringTest
{
	public static String addZeichenkette(String zeichenkette1, String zeichenkette2, int n)
	{
		zeichenkette1 += zeichenkette2;
		n--;
		if (n>0) {
			return StringTest.addZeichenkette(zeichenkette1, zeichenkette2, n);
		} else {
			return zeichenkette1;
		}
	}

	public static void main(String[] args)
	{
		String out = "Hallo";
		out = StringTest.addZeichenkette(out, "Ciao", 6);
		System.out.println(out);
	}
}
/* Ausgabe:
HalloCiaoCiaoCiaoCiaoCiaoCiao
*/