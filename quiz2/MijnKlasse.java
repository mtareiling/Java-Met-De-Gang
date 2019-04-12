package _10_statistische_leden.qz02;

public class MijnKlasse {
	static int x = 3;
	
	public MijnKlasse() {
		x++;
	}
	
	public static int mijnMethode (int i, int i2) {
		x += (i - i2);
		return x;
	}
	
	/* Opdrachten */
	public static int resetX (int j) {
		x = j;
		return x;
	}
	
	public static void main(String[] args) {
		MijnKlasse mk1 = new MijnKlasse();	// x = 3++ = 4
		MijnKlasse mk2 = new MijnKlasse();	// x = 5
		System.out.print(MijnKlasse.x + ", ");
		
		MijnKlasse mk3 = new MijnKlasse();	// x = 6
		MijnKlasse.mijnMethode(8,3);		// x = 6 + (8-3) = 11
		System.out.print(MijnKlasse.x + ", ");
		
		/* Opdrachten */
		MijnKlasse.resetX(100);
		System.out.print(MijnKlasse.x);
	}
}
