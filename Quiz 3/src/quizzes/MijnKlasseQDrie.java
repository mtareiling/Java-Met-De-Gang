package quizzes;

public class MijnKlasseQDrie {
	/* Class variable
	 * Constructor is triggered three times
	 * so x = 6 + 3 x 3 = x = 15
	 */
	static int x = 6;
	
	/* Instance variable
	 * Gives each object y = 3 + 2
	 */
	int y = 3;
	
	// No argument constructor
	MijnKlasseQDrie() {
		x += 3;
		y += 2;
	}
	
	/* Method taking int
	 * Instance int y = 5 - 3 = y = 2
	 * Class int x = 15 + 1 = x = 16
	 * 
	 */
	void mijnMethode(int i) {
		this.y = y - i;
		x ++;
	}
	
	public static void main(String[] args) {
		MijnKlasseQDrie mk1 = new MijnKlasseQDrie();
		MijnKlasseQDrie mk2 = new MijnKlasseQDrie();
		MijnKlasseQDrie mk3 = new MijnKlasseQDrie();
		mk1.mijnMethode(3);
		
		/* mk2's int x = 16 & mk1's int y = 2
		 * 
		 * As explained x is bound by class while
		 * y is bound by object. Each object
		 * shares class variables, but has seperate
		 * instanced variables
		 */
		System.out.print(mk2.x + ", " + mk1.y);
	}

}
