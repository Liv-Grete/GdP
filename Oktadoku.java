/**
 * 
 */

/**
 * 
 */
import gdp.stdlib.*;
public class Oktadoku {

	public enum Variante { normal, mitDiagonalen };
	private Variante v;
	// was sonst noch noetig ist …

	public Oktadoku(Variante var)  {  /* TODO */  }
	public void read()             {  
		int[][] a= new int[8][8];
		for (int i=0; i<a.length; i++)
			for (int j=0; j<a.length; j++)
				a[i][j]=StdIn.readInt();
	}
	//		public void write()            {  /* TODO */  }		
	public boolean check()         {  
		//Zeile	([i][j(gleichbleibend)]

		//spalte 
		int numbers[] = {1,2,3,4,5,6,7,8};
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a.length;i++) {
				if (numbers[i]==a[i][j]) {
				}return true;
			}
		}
		//diagonale int [i][i]
	}
	public void solve() 	       { 

	}



	public static void main(String[] args) {
		//		Test für Oktadoku
		//		Oktadoku.Variante v = Oktadoku.Variante.normal;
		//		if (args.length > 0 && args[0].equals("-x"))
		//			v = Oktadoku.Variante.mitDiagonalen;
		//		Oktadoku s = new Oktadoku(v);
		//
		//		s.read();
		//		s.write();
		//		if (s.check())
		//			s.solve();
		//		else
		//			System.out.println("nicht ok");
	}
}
// check the contents of fields with the factorial 

