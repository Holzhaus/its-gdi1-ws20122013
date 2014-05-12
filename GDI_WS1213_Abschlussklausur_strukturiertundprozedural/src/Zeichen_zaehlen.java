import java.io.*; 
public class Zeichen_zaehlen {
	public static String read_String(String filename) {
		String out = " ";
		try {
			FileReader file = new FileReader(filename);
			BufferedReader in = new BufferedReader(file);
			String Zeile;
			while ((Zeile = in.readLine()) != null) {
				out = out + Zeile;
			}
			// in.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// System.out.prin	tln("Zahl = " + Zahl);
		// System.exit(0);
		return out;
	}

	public static void main(String args[])
	{
		String filename = "Ratespiel.java";
		if(args.length > 0) {
			filename = args[0];
		}
		String out = read_String(filename);
		int laenge = out.length();
		int[] zeichen = new int[128];
		int i;
		for(i=0;i<laenge;i++) {
			zeichen[(int)out.charAt(i)]++;
		}
		System.out.println("Zeichen\t\tAnzahl");
		for(i=0;i<128;i++) {
			if(zeichen[i]>	0) {
				System.out.println(((char)i)+"\t\t"+zeichen[i]);
			}
		}
	}
}
/* Ausgabe:
Zeichen	Anzahl
		99
		90
!		3
"		20
&		4
(		26
)		26
*		3
+		7
,		6
-		3
.		36
/		2
0		4
1		2
2		1
3		1
6		4
7		1
:		5
;		26
<		2
=		14
>		2
A		5
B		2
C		8
D		5
E		16
G		2
H		2
I		5
K		1
L		3
M		10
N		2
O		3
P		4
R		11
S		18
T		3
U		2
V		4
Z		1
[		10
]		10
_		9
a		48
b		10
c		24
d		5
e		98
f		8
g		16
h		21
i		64
l		38
m		15
n		51
o		38
p		26
r		68
s		56
t		77
u		35
v		12
w		11
x		2
y		10
z		2
{		12
}		12
*/