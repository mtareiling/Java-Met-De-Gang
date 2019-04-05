package _10_statische_leden.qz01;

public class Werknemer
{
  int nr; // instantievariabele
  static int stNr; // klassenvariabele
  public Werknemer()
  {
    nr++;
    stNr++;
  }
  public static void main(String[] args)
  {
    Werknemer wn1 = new Werknemer();
    Werknemer wn2 = new Werknemer();
    Werknemer wn3 = new Werknemer();
    // Antwoord 1
    Werknemer wn4 = new Werknemer();
    Werknemer wn5 = new Werknemer();
    // Antwoord 2
    System.out.print(Werknemer.stNr + ", ");
    System.out.print(wn1.nr + ", ");
    System.out.print(wn2.nr + ", ");
    System.out.print(wn3.nr);
  }
}
