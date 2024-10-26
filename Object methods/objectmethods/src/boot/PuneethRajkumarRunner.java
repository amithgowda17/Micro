package boot;

import thing.PuneethRajkumar;

public class PuneethRajkumarRunner {
	
	public static void main(String[] args) {
		
		PuneethRajkumar puneeth= new PuneethRajkumar("Appu","Abhi","Veera kannadiga","Mourya","Akash","Namma Basava","Ajay");
		
		
		puneeth.setMovies1("Appu");
		puneeth.setMovies2("Abhi");
		puneeth.setMovies3("Veera Kannadiga");
		puneeth.setMovies4("Mourya");
		puneeth.setMovies5("Akash");
		puneeth.setMovies6("Namma Basava");
		puneeth.setMovies7("Ajay");
		
		
		PuneethRajkumar appu=new PuneethRajkumar("Arasu","Bindass","Milana","Vamshi","Raj","Raam","Pruthvi",30);
		
		appu.setMovies8("Arasu");
		appu.setMovies9("Milana");
		appu.setMovies10("Bindass");
		appu.setMovies11("Vamshi");
		appu.setMovies12("Raj");
		appu.setMovies13("Raam");
		appu.setMovies14("Pruthvi");
		appu.setMovies15(30);
		
		System.out.println(puneeth.toString());
		System.out.println(appu.toString());
		
		System.out.println(puneeth.equals(appu));
		System.out.println(puneeth.equals(puneeth));
		System.out.println(appu.equals(puneeth));
		
		System.out.println(puneeth.hashCode());
		System.out.println(appu.hashCode());
		
	}

}
