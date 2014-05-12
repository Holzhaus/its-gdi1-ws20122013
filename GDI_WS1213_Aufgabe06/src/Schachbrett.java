/**
 * @author Jan Holthuis
 */
import java.math.BigInteger;
public class Schachbrett {
	public static void main(String[] args) {
		BigInteger[] checkerboard = initializeCheckerboard(64);
		printTable(checkerboard);
	}
	public static BigInteger[] initializeCheckerboard(int size) {
		BigInteger[] checkerboard = new BigInteger[size];
		BigInteger cornNumber = new BigInteger("2");
		for(int i = 0; i<size; i++) {
			checkerboard[i] = cornNumber.pow(i);
		}
		return checkerboard;
	}
	public static BigInteger getCornNumberOfField(BigInteger[] checkerboard, int fieldId) {
		// Hier eigentlich überflüssige Funktion, aber falls das Programm objektorientiert wäre, ließe sich so das Attribut checkerboard private machen 
		return checkerboard[fieldId];
	}
	public static BigInteger getCornSumOfField(BigInteger[] checkerboard, int fieldId) {
		BigInteger cornSum = new BigInteger("0");
		for(int i = 0; i<=fieldId; i++) {
			cornSum = cornSum.add(checkerboard[i]);
		}
		return cornSum;
	}
	public static void printTable(BigInteger[] checkerboard) {
		int maxNumberLength = getCornNumberOfField(checkerboard, 63).toString().length();
		int maxCornSumLength = getCornSumOfField(checkerboard, 63).toString().length();
		System.out.printf("a) Minimale Stellenzahl: n = %d\n", (maxCornSumLength>maxNumberLength ? maxCornSumLength : maxNumberLength));
		System.out.println("b) long besteht aus 64 Bit. Die groesste speicherbare Zahl mit dem Datentyp\n" +
				         "   long ist 2^63 (1 Vorzeichenbit) und entspricht somit der Anzahl der\n" +
				         "   Koerner auf dem letzten Feld des Schachbretts. Die Summe aller Koerner\n" +
				         "   ist folglich groesser als 2^63 und laesst sich damit nicht mehr in\n" +
				         "   einer Variable des Typs long speichern.");
		System.out.println("c) Das Problem liesse sich auch mit einem Array des kleinsten Java-Datentyps,\n" +
				           "   also boolean (1 Bit), loesen, wuede allerdings die implementierung\n" +
				           "   deutlich aufwendiger, umfangreicher und unuebersichtlicher machen.\n" +
				           "   Daher wurde BigInteger verwendet.\n");
		String outputFormat = "%17s  %"+maxNumberLength+"s  %"+maxCornSumLength+"s\n";
		System.out.printf(outputFormat, "Schachfeldzaehler", "Koerner", "Summe der Koerner");
		for(int i = 0; i<64; i++) {
			System.out.printf(outputFormat, String.valueOf(i), getCornNumberOfField(checkerboard, i).toString(), getCornSumOfField(checkerboard, i).toString());
		}
	}

}

/*
 * Ausgabe:
a) Minimale Stellenzahl: n = 20
b) long besteht aus 64 Bit. Die groesste speicherbare Zahl mit dem Datentyp
   long ist 2^63 (1 Vorzeichenbit) und entspricht somit der Anzahl der
   Koerner auf dem letzten Feld des Schachbretts. Die Summe aller Koerner
   ist folglich groesser als 2^63 und laesst sich damit nicht mehr in
   einer Variable des Typs long speichern.
c) Das Problem liesse sich auch mit einem Array des kleinsten Java-Datentyps,
   also boolean (1 Bit), loesen, wueder allerdings die implementierung
   deutlich aufwendiger, umfangreicher und unuebersichtlicher machen.
   Daher wurde BigInteger verwendet.

Schachfeldzaehler              Koerner     Summe der Koerner
                0                    1                     1
                1                    2                     3
                2                    4                     7
                3                    8                    15
                4                   16                    31
                5                   32                    63
                6                   64                   127
                7                  128                   255
                8                  256                   511
                9                  512                  1023
               10                 1024                  2047
               11                 2048                  4095
               12                 4096                  8191
               13                 8192                 16383
               14                16384                 32767
               15                32768                 65535
               16                65536                131071
               17               131072                262143
               18               262144                524287
               19               524288               1048575
               20              1048576               2097151
               21              2097152               4194303
               22              4194304               8388607
               23              8388608              16777215
               24             16777216              33554431
               25             33554432              67108863
               26             67108864             134217727
               27            134217728             268435455
               28            268435456             536870911
               29            536870912            1073741823
               30           1073741824            2147483647
               31           2147483648            4294967295
               32           4294967296            8589934591
               33           8589934592           17179869183
               34          17179869184           34359738367
               35          34359738368           68719476735
               36          68719476736          137438953471
               37         137438953472          274877906943
               38         274877906944          549755813887
               39         549755813888         1099511627775
               40        1099511627776         2199023255551
               41        2199023255552         4398046511103
               42        4398046511104         8796093022207
               43        8796093022208        17592186044415
               44       17592186044416        35184372088831
               45       35184372088832        70368744177663
               46       70368744177664       140737488355327
               47      140737488355328       281474976710655
               48      281474976710656       562949953421311
               49      562949953421312      1125899906842623
               50     1125899906842624      2251799813685247
               51     2251799813685248      4503599627370495
               52     4503599627370496      9007199254740991
               53     9007199254740992     18014398509481983
               54    18014398509481984     36028797018963967
               55    36028797018963968     72057594037927935
               56    72057594037927936    144115188075855871
               57   144115188075855872    288230376151711743
               58   288230376151711744    576460752303423487
               59   576460752303423488   1152921504606846975
               60  1152921504606846976   2305843009213693951
               61  2305843009213693952   4611686018427387903
               62  4611686018427387904   9223372036854775807
               63  9223372036854775808  18446744073709551615
*/
