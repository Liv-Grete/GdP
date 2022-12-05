/**
 * 
 */

/**
 * 
 *
 */
public class Bigs {

	/**
	 * @param args
	 */
	//	public static void main(String[] args) {
	//		//big numbers represented in an array
	//		int N = Integer.parseInt(args[0]);
	//		int number = N;
	//		String snumber = "" + N; // number is saved in a string to evaluate its length 
	//
	//		int[] array = new int [snumber.length()]; 
	//
	//		for (int i=0; i<array.length; i++ ) {
	//			array [i]= number%10;
	//			number= number/10;
	//			System.out.println(array[i]);
	//		}
	//	}

	//implement following methods 

	// addiert die Ziffernfelder a und b
	//	public static int[ ] add (int[ ] a, int[ ] b) { /* TODO */ }

	//	
	// gibt das Ziffernfeld n in lesbarer dezimaler Form aus
	static void print (int[ ] n)             { 
		for (int i=n.length-1; i>=0; i--) {
			System.out.print(n[i]);
		}
		System.out.println();
	}

	//
	//	// konstruiert ein einstelliges Ziffernfeld aus d
	//	static int[ ] digit(int d)	             { /* TODO */ }
	//
	//	// konstruiert das Ziffernfeld, welches den Wert Null repraesentiert
	//	static int[ ] Null()                     { /* TODO */ }
	//
	//	// konstruiert das Ziffernfeld, welches den Wert Eins repraesentiert
	//	static int[ ] One()                     { /* TODO */ }
	//
//		// Rest des Ziffernfeldes n bei Division durch 10 (eine int-Zahl!)
//		static int mod10(int[ ] n)               { /* TODO */ }
	
		// ganzzahliger Quotient bei Division durch 10
		static int[ ] div10(int[ ] n)            { 
			int[] result= new int[n.length-1];
			
			for (int i = 0; i < result.length; i++) {
				result[i] = n[i+1];
			}
			
			return result;
		}
	
		
	//	// Umwandlung einer int-Zahl in ein Ziffernfeld	
	static int[ ] fromInt(int n)             { 

		int number = n;
		String snumber = "" + n; // number is saved in a string to evaluate its length 

		int[] array = new int [snumber.length()]; 

		for (int i=0; i<array.length; i++ ) {
			array [i]= number%10;
			number= number/10;
		}
		return array;
	}

	// kopiert den Wert von a
	static int[ ] copy(int[ ] n)             { 
		int[] copy= new int[n.length];
		for (int i = 0; i < copy.length; i++) {
			copy[i]=n[i];
		}
		return copy;
	}

	//	// multipliziert das Ziffernfeld a mit einer int-Zahl
	//	static int[ ] times(int[ ] n, int d)     { /* TODO */ }
	//
	//	// multipliziert das Ziffernfeld n mit 10
	//	static int[ ] times10(int[ ] n)          { /* TODO */ }
	//
	//	// multipliziert zwei Ziffernfelder	
	//	static int[ ] times(int[ ]a, int[ ] b)   { /* TODO */ }
	//
	//	// Quadratzahl eines Ziffernfeldes
	//	static int[ ] square(int[ ]a)            { /* TODO */ }
	//
	//	// Kubikzahl eines Ziffernfeldes
	//	static int[ ] cubic(int[ ]a)             { /* TODO */ }
	//
	//	// Test auf kleiner-Relation zweier Ziffernfelder: a < b ?
	//	static boolean less (int[ ] a, int[ ] b) { /* TODO */ }
	//
	// Test auf Gleichheit zweier Ziffernfelder
	static boolean equal (int[ ] a, int[ ] b) { 

		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < b.length; i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}

	//	// Test auf Korrektheit eines Ziffernfeldes: Feld existiert und enthaelt
	//	// mindenstens eine Ziffer, alle Positionen liegen zwischen 0 und 9
	//	// keine fuehrenden Nullen (ausser bei Null selbst) 
	//	static boolean ok (int[ ] n)             { /* TODO */ }
	//
	//	// gibt die (kleinste) Ziffer mit der groessten Haeufigkeit in n aus	
	//	static void maxDigit(int[] n)            { /* TODO */ }

	public static void main (String[ ] s) {

		int[] a = fromInt(123);
		print(copy(a));
		System.out.println(equal(a, fromInt(345)));
		print(div10(a));

		//		int[] a = One();
		//
		//		for (int i=0; i<33222; ++i) {
		//			a = times(a, 2);
		//		}
		//
		//		System.out.println("2^33222 hat " + a.length + " Stellen");
		//		print(a); 
		//		System.out.println(); 
		//
		//		int[] b = fromInt(13);
		//		int[] c = copy(b);
		//
		//		for (int i=1; i<8978; ++i) {
		//			c=times(c, b);
		//		}
		//
		//		System.out.println("13^8978 hat " + c.length + " Stellen");
		//		print(c); 
		//		System.out.println(); 
		//
		//		System.out.println(less(a, c)); // beantwortet die Frage aus der Aufgabenueberschrift
		//		maxDigit(a);
		//		maxDigit(c);
	}

}



//		for(int i=0; i< number.length; i++) {
//			number[i]= number[i]%10;
//			System.out.println(number[i]);
//		}
//first Array is saved as char a and reverse it to long array -> same length etc.