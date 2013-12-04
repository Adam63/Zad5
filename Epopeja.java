package lab4;
//import lab4.Ksiazka;

public class Epopeja extends Ksiazka
{
	static String rodzaj = "Epopeja";
	static String glownyBohater;
	static int rokWydania;
	
	public Epopeja(String tytul, String GlBohater, int rok)
	{
		super(tytul);
		glownyBohater = GlBohater;
		rokWydania = rok;
	}

	public String dajRodzaj()
	{
		return rodzaj ;
	}
	
	public String dajOpis()
	{
		return " Podajê szczegó³y ksi¹zki " + tytul + ":\n" + " G³ówny bohater: " + glownyBohater
				+ "\n Rok wydania: " + rokWydania;
	}
}
