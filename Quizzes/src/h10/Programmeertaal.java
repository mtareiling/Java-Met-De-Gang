package h10;

public class Programmeertaal {
	static int aantalTalen;
    static String taal = "";
	
    /* One-argument constructor that calls upon
     * the method named "rememberMe". It takes
     * a String and tells the method to take
     * that String.
     */
	Programmeertaal(String lang) {
		rememberMe(lang);
	}
	
	/* This method adds 1 to "aantalTalen"
	 * and adds the argument lang to "taal"
	 * and prints out these values
	 */
	void rememberMe(String lang) {
		aantalTalen ++;
		taal += lang + " ";
		System.out.println(aantalTalen + ". " + taal);
	}
	
	public static void main(String[] args) {
		Programmeertaal java = new Programmeertaal("Java");
		Programmeertaal cplusplus = new Programmeertaal("C++");
		Programmeertaal python = new Programmeertaal("Python");
		Programmeertaal php = new Programmeertaal("PHP");
		Programmeertaal ruby = new Programmeertaal("Ruby");
	}
}
