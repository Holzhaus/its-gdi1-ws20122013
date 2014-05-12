public class WaistToHeight {
	public static enum Gewichtsklasse { UNTERGEWICHT, NORMALGEWICHT, UEBERGEWICHT, ADIPOSITAS, SCHWEREADIPOSITAS, KEINEAHNUNG };
	public static double berechne(int umfang, int groesse) {
		return (umfang/(double)groesse);
	}
	public static Gewichtsklasse ordneEin(int alter, double wthr) {
		if(alter<=15) {
			if(wthr<0.34) {
				return Gewichtsklasse.UNTERGEWICHT;
			} else if (wthr>=0.34 && wthr<=0.45) {
				return Gewichtsklasse.NORMALGEWICHT;
			} else if (wthr>0.45 && wthr<=0.51) {
				return Gewichtsklasse.UEBERGEWICHT;
			} else if (wthr>0.51 && wthr<=0.63) {
				return Gewichtsklasse.ADIPOSITAS;
			} else {
				return Gewichtsklasse.KEINEAHNUNG;
			}
		} else if (alter>15 && alter<=50) {
			if(wthr<0.40) {
				return Gewichtsklasse.UNTERGEWICHT;
			} else if (wthr>=0.40 && wthr<=0.50) {
				return Gewichtsklasse.NORMALGEWICHT;
			} else if (wthr>0.50 && wthr<=0.56) {
				return Gewichtsklasse.UEBERGEWICHT;
			} else if (wthr>0.56 && wthr<=0.68) {
				return Gewichtsklasse.ADIPOSITAS;
			} else {
				return Gewichtsklasse.SCHWEREADIPOSITAS;
			}
		} else if (alter>50) {
			if(wthr<0.40) {
				return Gewichtsklasse.UNTERGEWICHT;
			} else if (wthr>=0.40 && wthr<=0.60) {
				return Gewichtsklasse.NORMALGEWICHT;
			} else if (wthr>0.60 && wthr<=0.66) {
				return Gewichtsklasse.UEBERGEWICHT;
			} else if (wthr>0.66 && wthr<=0.78) {
				return Gewichtsklasse.ADIPOSITAS;
			} else {
				return Gewichtsklasse.SCHWEREADIPOSITAS;
			}
		}
		return Gewichtsklasse.KEINEAHNUNG;
	}
}