package src.lab4;
import java.util.ArrayList;
import src.lab4.Ksiazka;

class Biblioteka
    {
    	public int i=0;
    	
    	public String nazwaBiblioteki;
    	//public Ksiazka[] ksiazki = new Ksiazka[100];
    	ArrayList<Ksiazka> ksiazki = new ArrayList<Ksiazka>();
    	
    	
    public Biblioteka(String nazwa)
	{
    	
    	nazwaBiblioteki = nazwa;
	}

    public void dodajKsiazke(Ksiazka tyt)
    {    	
    	ksiazki.add(tyt);
    	
    	
    }
    
    public static void wypiszGodzinyOtwarcia()
    {
    	System.out.println("Biblioteki sa otwarte codziennie od 9:00 do 17:00.");
    }
    
    public void wypiszAdres()
    {
    	System.out.println(nazwaBiblioteki);
    }
    
    public void wypozyczKsiazke( String tytul )
    {
    	
    	boolean pom = false;
    	for(int i = 0 ; i<ksiazki.size() ; i++)
    	{
    		if(ksiazki.get(i) != null && ksiazki.get(i).czyWypozyczona() == false)
    		{
    			if (ksiazki.get(i).dajTytul().equals(tytul) == true)
    			{
    				System.out.println("Uda�o si� wypo�yczy� ksiazke: " + ksiazki.get(i).dajTytul() );
        			ksiazki.get(i).wypozycz();
        			pom = true;
        			
    			}
    			
    			
    		}

    	}
    	if ( pom == false)
		{
			System.out.println("Nie uda�o si� wypo�yczy� ksi��ki");
		}
    	
    }
    	
    public void wypiszDostepneKsiazki()
    {
    	int k=0;
    	for (int i = 0 ; i<ksiazki.size() ; i++)
    	{
    		if(ksiazki.get(k).czyWypozyczona == false)
    		{
    		System.out.println(ksiazki.get(k).dajTytul());
    		}
    		k++;
    	}
    	if ( ksiazki.size() == 0)
    	{
    		System.out.println("Brak ksi��ek");
    	}
    }
    
    public void oddajKsiazke(String tytul)
    {
    	for(int i = 0 ; i<ksiazki.size() ; i++)
    	{
    		if(ksiazki.get(i) != null && ksiazki.get(i).czyWypozyczona() == true)
    		{
    			if (ksiazki.get(i).dajTytul().equals(tytul) == true)
    			{
    				System.out.println("Uda�o si� zwr�ci� ksiazke: " + ksiazki.get(i).dajTytul() );
    				ksiazki.get(i).oddaj();
        			
    			}
    		}	
    	}		
    		
    }
	
    public void szczegoly()
    {
    	int k=0;
    	for (int i = 0 ; i<ksiazki.size() ; i++)
    	{
    		if(ksiazki.get(k).czyWypozyczona == false)
    		{
    		System.out.print("Tytu�: " + ksiazki.get(k).dajTytul() + "   ");
    		System.out.println("Rodzaj: " + ksiazki.get(k).dajRodzaj() + "   ");
    		System.out.println(" Opis: " + ksiazki.get(k).dajOpis() + "   \n");
    		}
    		k++;
    	}
    	if ( k == 0)
    	{
    		System.out.println("Brak ksi��ek, wi�c nie mog� poda� ich szczeg��w");
    	}
    }
        
    
    public static void main( String[] argumenty )
    {
    	
    	
    //Stworz dwie biblioteki
    Biblioteka pierwsza = new Biblioteka( "Armi Krajowej 24" );
    Biblioteka druga = new Biblioteka( "Plac Grunwaldzki 6" );
     
    //Dodaj cztery ksiazki do pierwszej biblioteki
    //pierwsza.dodajKsiazke( new Ksiazka( "Pan Tadeusz" ) );
    //pierwsza.dodajKsiazke( new Ksiazka( "Pan Tadeusz" ) );
    pierwsza.dodajKsiazke( new Epopeja( "Pan Tadeusz" , "Pan Tadeusz", 1980) );
    pierwsza.dodajKsiazke( new KsiazkaFantastyczna( "Gra o Tron", "�redniowiecze", "Rozgrywki polityczne znacz�cych rodzin" ) );
    pierwsza.dodajKsiazke( new Kryminal( "Tozsamosc Bourne'a" , "Bardzo du�a", "The Bourne Identity") );
    pierwsza.dodajKsiazke( new KsiazkaNaukowa( "Analiza Matematyczna" , "Matematyka" , 346 ) );
     
    //Wypisz godziny urzedowania bibliotek
    System.out.println( "Godziny otwarcia bibliotek ");
    wypiszGodzinyOtwarcia();
    System.out.println(); //pusta linijka
     
    System.out.println( "Adresy bibliotek " );
    pierwsza.wypiszAdres();
    druga.wypiszAdres();
    System.out.println(); //pusta linijka
     
    //wypozycz Pana Tadeusza z obu bibliotek
    System.out.println( "Wypozyczanie Pana Tadeusza" );
    pierwsza.wypozyczKsiazke( "Pan Tadeusz" );
     
    pierwsza.wypozyczKsiazke( "Pan Tadeusz" ); //sprobuj jeszcze raz
    
    druga.wypozyczKsiazke( "Pan Tadeusz" );
     
    System.out.println(); //pusta linijka
     
    //Wypisz dostepne tytuly w obu bibliotekach
    System.out.println( "Ksiazki dostepne w pierwszej bibliotece" );
    pierwsza.wypiszDostepneKsiazki();
    System.out.println(); //pusta linijka
    System.out.println( "Ksiazki z drugiej biblioteki" );
    druga.wypiszDostepneKsiazki();
    System.out.println();
     
    //zwroc Pana Tadeusza do biblioteki
    System.out.println( "Zwrot Pana Tadeusza" );
    pierwsza.oddajKsiazke( "Pan Tadeusz" );
    System.out.println();
     
    // Wypisz tytuly dostepne w pierwszej bibliotece
    System.out.println( "Ksiazki dostepne w pierwszej bibliotece" );
    pierwsza.wypiszDostepneKsiazki();
    System.out.println();
    
    //Wypisz szczeg�y dostepnych ksiazek
    System.out.println( "Szczeg�y dost�pnych ksi��ek: \n");
    pierwsza.szczegoly();
    }
}
