public class MijnKlasse {
	static int x = 2;
	
	MijnKlasse(){
		x ++;
	}
	static void methodeA(int i)
	{
		x = x - i;
	}
	int methodeB(int i)
	{
		return x + i;
	}
	public static void main(String[] arg)
	{
		// de code hieronder roept eerste de contstructor aan vermeerdert de waarde van x met 1 (x ++;)
		MijnKlasse mk1 = new MijnKlasse();
		// vervolgens wordt methode a aangeroepen(x = x - i = 3-2 = 1)
		MijnKlasse.methodeA(2);
		// daarna in de code hieronder word de constructor weer aangeroepen en vermeerdert de waarde met 1
		// x = 1 + 1 = 2
		MijnKlasse mk2 = new MijnKlasse();
		// daarna wordt methode b aangeroepen en wordt 3 bij opgeteld met de parameter 3 die wordt meegegeven x uitgeprint 
		System.out.println(mk2.methodeB(3));
	}
}

