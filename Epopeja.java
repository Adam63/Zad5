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
		return " Podaj� szczeg�y ksi�zki " + tytul + ":\n" + " G��wny bohater: " + glownyBohater
				+ "\n Rok wydania: " + rokWydania;
	}
}
