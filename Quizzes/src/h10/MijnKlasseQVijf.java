package h10;

public class MijnKlasseQVijf {
	static int x;
	static StringBuffer sb = new StringBuffer();
	
	/* The no argument constructor calls
	 * upon the method named mijnMethod
	 */
	public MijnKlasseQVijf() {
		mijnMethode();
	}
	
	/* This method adds 3 to class variable x
	 * and appends the value of x to object sb
	 */
	public void mijnMethode() {
		x += 3;
		sb.append(x);
	}
	public static void main(String[] args) {
		/* Triggers constructor, adds 3 to x and appends to sb 
		 * result: x = 3, sb = 3
		 */
		MijnKlasseQVijf object1 = new MijnKlasseQVijf();
		/* Triggers constructor, adds 3 to x and appends to sb 
		 * result: x = 6, sb = 36
		 */
		MijnKlasseQVijf object2 = new MijnKlasseQVijf();
		/* Triggers constructor, adds 3 to x and appends to sb 
		 * result: x = 9, sb = 369
		 */
		MijnKlasseQVijf object3 = new MijnKlasseQVijf();
		/* Prints out 369, because object 1 uses latest value
		 * of static StringBuffer sb.
		 */
		System.out.println(object1.sb);
	}
}
