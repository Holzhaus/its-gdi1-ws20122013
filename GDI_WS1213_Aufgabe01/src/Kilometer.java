/*
 * Autor: Jan Holthuis
 * Datum: 11.11.2012
 * 
 * Schreiben Sie ein Programm, das Km-Angaben in Meilen-Angaben umrechnet
 * und umgekehrt. Verwenden Sie als Vorlage dazu das Programm Liter
 * (Umrechnung von Litern in US-Gallonen). Es ist das Paket inout für die
 * Eingabe zu verwenden. Als Entwicklungsumgebung ist BlueJ einzusetzen.
 * Geben Sie am Anfang des Programms den Namen des Autors und das Datum
 * der Erstellung an.
 * Lassen Sie Ihr Programm mit folgenden Eingabewerten laufen:
 * Nehmen Sie den ersten Buchstaben Ihres Vornamens und wandeln Sie in in
 * eine Zahl nach folgendem Muster um:
 * A = 1, B= 2, C= 3 usw. Nehmen Sie diesen Zahlenwert als Kilometer-
 * anzahl, die umgerechnet werden soll.
 * Nehmen Sie analog den ersten Buchstaben Ihres Nachnamens, wandeln ihn
 * in eine Zahl um und geben den Wert als Meilenanzahl ein.
 */

import inout.Console; //Importieren des Pakets inout

public class Kilometer
{
 public static void main (String args[])
 {
  double kilometer;
  double meilen;
  System.out.println("Geben Sie bitte die Kilometer-Anzahl ein:");
  //Aufruf der Methode readDoubleComma()
  kilometer = Console.readDoubleComma();
  //meilen = 0.264172052 * kilometer;
  meilen = 1.0/1.609344 * kilometer;
  System.out.println
    (kilometer + " KM ergeben " + meilen + " Meilen");
  System.out.println("Geben Sie bitte die Meilen-Anzahl ein:");
    
  meilen = Console.readDoubleComma(); 
  kilometer = 1.609344  * kilometer;
  System.out.println
   (meilen + " Meilen ergeben " + kilometer + " Kilometer");
 }
}
