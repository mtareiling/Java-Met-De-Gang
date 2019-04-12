
package _10_statistische_leden.qz01;

public class Werknemer {
	int nr;	// instantievariabele: is voor elk Werknemerobject anders
	static int stNr;	// klassenvariabele, wordt gedeeld onder alle objecten
	
	public Werknemer() {	// constructor
		nr ++;		// 0 + 1 = 1
		stNr ++;	// huidige waarde + 1 = totaal aantal objecten
	}
	
	public static void main(String[] args) {
		Werknemer wn1 = new Werknemer();	// stNr = 0++ = 1
		Werknemer wn2 = new Werknemer();	// stNr = 1++ = 2
		Werknemer wn3 = new Werknemer();	// stNr = 2++ = 3
		
		System.out.print(Werknemer.stNr + ", ");
		System.out.print(wn1.nr + ", ");
		System.out.print(wn2.nr + ",");
		System.out.print(wn3.nr);
		
		/* Opdrachten */
		Werknemer wn4 = new Werknemer();
		Werknemer wn5 = new Werknemer();
	}
}
