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
	public static void main(String[] args) {
		//big numbers represented in an array
		long N = Long.parseLong(args[0]);
		long number = N;
		String snumber = "" + N; // number is saved in a string to evaluate its length 
		
		long[] array = new long [snumber.length()]; 
		
		for (int i=0; i<array.length; i++ ) {
			array [i]= number%10;
			number= number/10;
			System.out.println(array[i]);
		}
		
		//implement following methods 
	}

}
//		for(int i=0; i< number.length; i++) {
//			number[i]= number[i]%10;
//			System.out.println(number[i]);
//		}
//first Array is saved as char a and reverse it to long array -> same length etc.