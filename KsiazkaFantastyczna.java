package lab4;
//import lab4.Ksiazka;


public class KsiazkaFantastyczna extends Ksiazka
{
	static String rodzaj = "Ksi��ka Fantastyczna";
	static String czasAkcji;
	static String tematyka;
	
	public KsiazkaFantastyczna(String tytul, String czasA, String temat)
	{
		super(tytul);
		czasAkcji = czasA;
		tematyka = temat;
		
	}

	public String dajRodzaj()
	{
		return rodzaj ;
	}
	
	public String dajOpis()
	{
		return " Podaj� szczeg�y ksi�zki " + tytul + ": \n" + " Czas akcji: " + czasAkcji + "\n Tematyka: " + tematyka;
	}
}