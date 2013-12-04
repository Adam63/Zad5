package lab4;
import lab4.Ksiazka;


public class Kryminal extends Ksiazka
{
	static String rodzaj = "Krymina³";
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
		return " Podajê szczegó³y ksi¹zki " + tytul + ": \n" + " Liczba zamordowanych: " + liczbaZamordowanych 
				+ "\n Tytu³ oryginalny: " + tytulOryginalny;
	}
}