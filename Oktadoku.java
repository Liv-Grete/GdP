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
		int[]a= new int[64];
		for (int i=0; i<a.length; i++)
			//for (int j=0; j<a.length; j++)
				a[i]=StdIn.readInt();
	}
	//		public void write()            {  /* TODO */  }		
	public boolean check()         {  
		//checkt nur teilweise, ob die Schritte legal sind
		//Zeile	([i][j(gleichbleibend)]

		//Reihe: i+1 
		for (int i=0;i<9;i++)
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
//factorial for 8 for one part of the oktadoku  
//basecase: alles aufgefüllt und gecheckt 
//möglich: alles als ein dimensionaler Array darstellen und in größeren Abständen springen 

