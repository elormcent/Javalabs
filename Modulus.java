import java.util.*;
import java.lang.Math;
public class Modulus {

	public static int generator() {
	//	int ran = Math.random();
		int num = (int) (Math.random() * 100)+0;

		return num;
	}

	public static void main (String[] args) {


		int numb = generator();

		if (numb % 2 == 0) {
			
			System.out.println("The number " + numb + " is an EVEN number.\n");
		}
		else { 
			System.out.println("The number " + numb + " is an ODD number.\n");
		}


		// Temperature

		if (numb == 0) {
			System.out.println("Frozen" + numb);
		}
		else if (numb > 0 && numb <= 14) {
			System.out.println("Cold" + numb);
		}
		else if (numb >14 && numb <= 24) {
			System.out.println("Cool" + numb);
		}
		else if (numb >24 && numb <= 40) {
			System.out.println("Worm" + numb);
		}
		else if (numb > 40 && numb <= 60) {
			System.out.println("Hot" + numb);
		}
		else if (numb > 60 && numb <= 80) {
			System.out.println("Very Hot" + numb);
		}
		else if (numb > 80 && numb <= 99) {
			System.out.println("Extremely Hot" + numb);
		}
		else {
			System.out.println("Boiling" + numb);
		}


	}



}

