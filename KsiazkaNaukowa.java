package lab4;
import lab4.Ksiazka;


public class KsiazkaNaukowa extends Ksiazka
{
	static String rodzaj = "Ksi¹¿ka Naukowa";
	static String dziedzina;
	static int liczbaStron;
	
	public KsiazkaNaukowa(String tytul, String dziedzinaNaukowa, int liczbaStr)
	{
		super(tytul);
		dziedzina = dziedzinaNaukowa;
		liczbaStron = liczbaStr;
	}

	public String dajRodzaj()
	{
		return rodzaj ;
	}
	
	public String dajOpis()
	{
		return " Podajê szczegó³y ksi¹zki " + tytul + ": \n" + " Dziedzina naukowa: " + dziedzina
				+ "\n Liczba stron: " + liczbaStron;
	}
}