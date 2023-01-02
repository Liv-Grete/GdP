/**
 * 
 */

/**
 * 
 *
 */
public class Roman {

	/**
	 * 
	 */

	static int[ ] fromInt(int n)            { 

		int number = n;
		String snumber = "" + n; // number is saved in a string to evaluate its length 

		int[] array = new int [snumber.length()]; 

		for (int i=0; i<array.length; i++ ) {
			array [i]= number%10;
			number= number/10;
		}
		return array;}

	static void print (int[ ] n)             { 
		for (int i=n.length-1; i>=0; i--) {
			System.out.print(n[i]);
		}
		System.out.println();}

	static String roman (int n) {
		String[] Zeichen = new String[]{"I","V","X","L","C","D","M"};
		if (n==1) return Zeichen[0];
		if (n==5) return Zeichen[1];
		// für jeden schritt bis zum nächsten den vorhärigen 
		//else return roman(n-1)+"I";
		if (n==10)return "X";
		else return "X"+roman(n%10);
//		if (n==50)return "L";
//		if (n== 100)return "C";
//		if (n==500)return "D";
//		if (n==1000)return "M"; 
//		return roman(n-1);

	}
	// nach der nächst größten Base suchen, durch iteration also: ist der Rest der Teilung > 0. 
	// dann muss man mit dem Rest weiter arbeiten
	// vllt. Fkt. für die Zerlegung der zahl in Bases prüft, ob es eine der Bases ist oder kleiner, als die Nächste
	public static void main(String[] args) {
		// 1=I; V=5;X=10;L=50C=100;D=500;M=1000
		//Behandlung fehlender oder falscher Eingabeparameter
		int N=Integer.parseInt(args[0]);
		assert (1<=N && N<=5000);
		System.out.println(roman(N));
		//print(fromInt(N));
	}


}
// vielfache der Zahl müssen 
// 