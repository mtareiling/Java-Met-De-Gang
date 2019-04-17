package h10;

public class MijnKlasseQVier {
	static int x = 2;
	
	/* A no argument constructor that gets
	 * triggered twice. Once upon creation
	 * of object 1 and once upon creation
	 * of object 2.
	 * Adds 4 on static int x per trigger
	 */
	MijnKlasseQVier() {
		x += 4;
	}
	
	/* When called upon, this method
	 * will reduce x by the value of
	 * i. In this case it's x - 2
	 */
	static void methodA(int i) {
		x = x - i;
	}
	
	
	int methodB(int i) {
		return x + i;
	}
	public static void main(String[] args) {
		MijnKlasseQVier object1 = new MijnKlasseQVier();
		MijnKlasseQVier.methodA(2);
		MijnKlasseQVier object2 = new MijnKlasseQVier();
		System.out.print(object2.methodB(3));
	}

}
