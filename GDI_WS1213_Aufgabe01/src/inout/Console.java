package inout;
   
import java.util.*;
/** Diese Klasse stellt Methoden zur Verfügung, <br>
 * um Texte und einfache Typen von der Konsole einzulesen.<br>
 * Die Ausnahmebehandlung ist Aufgabe des Aufrufers.<hr>
 * Die Ausnahmen haben folgende Bedeutung:<br>
 * InputMismatchException: Die Eingabe entspricht nicht dem Typ.<br>
 * NoSuchElementException: Es wurde keine Eingabezeile gefunden<br>
 * IllegalStateException: Die verwendete Methode ist nicht geöffnet.
 * @author Helmut Balzert
 * @version 1.0 / 1.1.2006
 */
public class Console
{
	
 /**Liest eine Zeile von der Konsole
  * @return eingelesene Zeile vom Typ String
  */
 public static String readString() 
  throws NoSuchElementException, IllegalStateException
 {
	Scanner sc = new Scanner(System.in);
	return sc.nextLine();
 }
 
 /**Liest eine Zeile von der Konsole
  * @return eingelesene Zeile vom Typ char[]
  */
 public static char[] readCharArray() 
  throws NoSuchElementException, IllegalStateException
 {
	Scanner sc = new Scanner(System.in);
	String text = sc.nextLine();
	return text.toCharArray();
 }
 		
 /**Liest einen booleschen Wert von der Konsole
  * @return boolescher Wert true oder false
  */
 public static boolean readBoolean() throws 
   InputMismatchException, NoSuchElementException, 
   IllegalStateException
 {
    Scanner sc = new Scanner(System.in);
    return sc.nextBoolean();
 }
 
 /**Liest eine ganze Zahl vom Typ int von der Konsole
  * @return ganze Zahl vom Typ int
  */
 public static int readInt() throws 
   InputMismatchException, NoSuchElementException, 
   IllegalStateException
 {
    return new Scanner(System.in).nextInt();
 }
 
 /**Liest eine ganze Zahl vom Typ long von der Konsole
  * @return ganze Zahl vom Typ long
  */
 public static long readLong() throws 
   InputMismatchException, NoSuchElementException, 
   IllegalStateException
 {
    return new Scanner(System.in).nextLong();
 }

 /**Liest eine Gleitpunktzahl vom Typ float von der Konsole
  * Englische Notation: Trennung der 
  * Nachkommastellen durch Punkt
  * @return Gleitpunktzahl vom Typ float
  */
  public static float readFloatPoint() throws 
   InputMismatchException, NoSuchElementException, 
   IllegalStateException
 {
    Locale.setDefault(Locale.ENGLISH);
    return new Scanner(System.in).nextFloat();
 }
 
 /**Liest eine Gleitpunktzahl vom Typ float von der Konsole
  * Deutsche Notation: Trennung der 
  * Nachkommastellen durch Komma
  * @return Gleitpunktzahl vom Typ float
  */
 public static float readFloatComma() throws 
   InputMismatchException, NoSuchElementException, 
   IllegalStateException
 {
    Locale.setDefault(Locale.GERMAN);
    return new Scanner(System.in).nextFloat();
 }

 /**Liest eine Gleitpunktzahl vom Typ double von der Konsole
  * Englische Notation: Trennung der 
  * Nachkommastellen durch Punkt
  * @return Gleitpunktzahl vom Typ double
  */
 public static double readDoublePoint() throws 
   InputMismatchException, NoSuchElementException, 
   IllegalStateException
 {
    Locale.setDefault(Locale.ENGLISH);
    return new Scanner(System.in).nextDouble();
 }
 
 /**Liest eine Gleitpunktzahl vom Typ double von der Konsole
  * Deutsche Notation: Trennung der 
  * Nachkommastellen durch Komma
  * @return Gleitpunktzahl vom Typ double
  */
 public static double readDoubleComma() throws 
   InputMismatchException, NoSuchElementException, 
   IllegalStateException
 {
    Locale.setDefault(Locale.GERMAN);
    return new Scanner(System.in).nextDouble();
 }	

/**Liest ein Zeichen vom Typ char von der Konsole
 * @return erstes eingegebene Zeichen vom Typ char
 */
 public static char readChar() throws 
   NoSuchElementException,IllegalStateException
 {
    String s = new Scanner(System.in).next();
    return s.charAt(0);
 }
}
