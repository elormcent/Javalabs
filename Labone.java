import java.util.*;

public class Labone {


	public void generate() {
	//	double rand = Math.random();

		int n = (int) (Math.random()*90)+1;

		System.out.print("" + n + " - ");
	//	System.out.println("");
	}	

	public static void main (String[] args) {
	
		System.out.println("\tTURNTABL LOTTO");

		System.out.println("\n===============================\n\n");
		
		Labone i = new Labone();
		int a = 0;
			
		
		for (a = 0; a <= 5; a++) {
			i.generate();
		}

	

		System.out.println("");
	}


}
