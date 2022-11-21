/**
 * 
 */

/**
 * @author harderli
 *	Die Zahl wird umgekehrt,
 *danach wird überprüft, ob es sich um ein Palindrom (perspektivisch gleich) handelt
 */
public class Nolindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		long N = 123;
		
		
	long lastdigit= N%10;
	long restofnumber = N/10;
	
	long befordigit = restofnumber%10;
	restofnumber = restofnumber/10;
	long reverse= (lastdigit*100)+(befordigit*10)+(restofnumber*1);
	
	System.out.println(lastdigit+ ","+befordigit+","+restofnumber );	
	System.out.println(reverse);
	
	long sum = N + reverse;
	
	System.out.println(sum);
	// die summe wieder in einzelne Variablen aufspalten und in array speichern. 
	
	long as = sum%10;
	
	long newsum = sum/10;
	long bs = newsum%10;
	newsum = newsum/10;
	System.out.println(as+","+bs+","+newsum);
	
	long R = (as*100)+(bs*10)+(newsum*1);
	System.out.println(R);
	
	if (sum == R) {
		System.out.println("palindrome = "+ sum);
	}
	
	//long [] R
	
	}
}

//	String s = lastdigit + ""; 				//e.g., "123"
//	char[] array = s.toCharArray();
//	char[] reverse = new char[array.length];
//	for (int i=array.length-1, j=0;i>0;i--,j++) {
//		reverse[j] = array[i];
	//}
	//comparison: option 1

// Summe in Array speichern den dann in der Hälfte teilen und dann hinten und vorn prüfen

// for schleife prüft ein array in beide richtungen von der Mitte aus (j und i)
//Mitte ist der rest des Arrays durch 2 == 0, dann plus 1, wegen keine rundungen etc. 
// endet, wenn eines der beiden Enden das ende erreicht.

// alternativ kann man die kehrzahl der summe bilden und dann beide so prüfen, ist wahrscheinlich 
//delich leichter
	