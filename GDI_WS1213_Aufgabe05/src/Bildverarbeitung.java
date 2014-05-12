import java.util.ArrayList;
public class Bildverarbeitung {
	/* 
	 * Autor: Jan Holthuis
	 * Datum: 27.11.2012
	 * 
	 */
	public static int[][] getHistogram(int[][] imagematrix) {
		ArrayList<int[]> histogram = new ArrayList<int[]>(); //dynamic array size
		boolean isNewColor;
		for(int[] imColumn: imagematrix) {
			for(int imCell: imColumn) {
				isNewColor = true;
				for(int[] hgRow : histogram) {
					if(hgRow[0]==imCell) {
						hgRow[1]++;
						isNewColor = false;
					}
				}
				if(isNewColor) {
					histogram.add(new int[]{imCell,1});
				}
			}
		}
		return histogram.toArray(new int[histogram.size()][2]);
	}
	public static double getMedian(int[] numberlist) {
		double median; // using double here, because with an even number of elements in numberlist, the median could possibly be x + 0.5
		java.util.Arrays.sort(numberlist);
		for(int i: numberlist) System.out.print(i+" "); System.out.println();
		if(numberlist.length % 2 == 0) {
			// even number of elements in array
			median = ((double)numberlist[numberlist.length/2]+(double)numberlist[(numberlist.length/2)+1])/2;
		} else {
			// odd number of elements in array
			median = numberlist[(numberlist.length-1)/2];
		}
		return median;
	}
	public static void main(String[] args) {
		// Aufgabe a)
		int[][] imagematrix = new int[4][4];
		/*
		 * Tabelle 1:
		 *  34  255  255  56
		 * 127  204   11  34
		 * 123   98  127  34
		 *  34   34  127  17
		 */
		imagematrix[0][0] = 34;
		imagematrix[0][1] = 127;
		imagematrix[0][2] = 123;
		imagematrix[0][3] = 34;
		imagematrix[1][0] = 255;
		imagematrix[1][1] = 204;
		imagematrix[1][2] = 98;
		imagematrix[1][3] = 34;
		imagematrix[2][0] = 255;
		imagematrix[2][1] = 11;
		imagematrix[2][2] = 127;
		imagematrix[2][3] = 127;
		imagematrix[3][0] = 56;
		imagematrix[3][1] = 34;
		imagematrix[3][2] = 34;
		imagematrix[3][3] = 17;
		//Aufgabe b)
		System.out.println("b)");
		int[][] histogram = getHistogram(imagematrix);
		for (int[] hgColor: histogram) {
			System.out.println(""+hgColor[0]+"\t"+hgColor[1]);
		}
		System.out.println();
		System.out.println("c)");
		//Aufgabe c)
		System.out.print("Teil 1: ");
		//Jan Holthuis, JH = 10, 8
		int[] values1 = {22,0,4,2,62,262,25,2,86,7,21,6,9,2,1,5,11,45};
		double median = getMedian(values1);
		System.out.println("Median = "+median);
		System.out.print("Teil 2: ");
		//Jan Holthuis, JH = 10, 8
		int[] values2 = {33,9,2,6,5,8,2,4,8,43,58,34,2,5,2,8,10};
		median = getMedian(values2);
		System.out.println("Median = "+median);
	}
	/*
	 * Ausgabe:
	 * b)
	 * 34	5
	 * 127	3
	 * 123	1
	 * 255	2
	 * 204	1
	 * 98	1
	 * 11	1
	 * 56	1
	 * 17	1
	 *
	 * c)
	 * Teil 1: 0 1 2 2 2 4 5 6 7 9 11 21 22 25 45 62 86 262
	 * Median = 10.0
	 * Teil 2: 2 2 2 2 4 5 5 6 8 8 8 9 10 33 34 43 58
	 * Median = 8.0
	 * 
	 */

}
