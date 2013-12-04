package lab4;
import lab4.Ksiazka;


public class Kryminal extends Ksiazka
{
	static String rodzaj = "Krymina�";
	static String liczbaZamordowanych;
	static String tytulOryginalny;
	
	public Kryminal(String tytul, String liczbaZam, String tytulOryg)
	{
		super(tytul);
		liczbaZamordowanych = liczbaZam;
		tytulOryginalny = tytulOryg;
	}

	public String dajRodzaj()
	{
		return rodzaj ;
	}
	
	public String dajOpis()
	{
		return " Podaj� szczeg�y ksi�zki " + tytul + ": \n" + " Liczba zamordowanych: " + liczbaZamordowanych 
				+ "\n Tytu� oryginalny: " + tytulOryginalny;
	}
}