package boot;

import thing.Akki;

public class AkkiRunner {

	public static void main(String[] args) {
	
		
		Akki akki = new Akki(1000,"Bullet Rice",8654554457l,9979762178l,100.128798d,"Vinayaka stores","Ramesh");
		
		akki.setDetails1(2000);
		akki.setDetails2("Bhasumathi");
		akki.setDetails3(7868299789l);
		akki.setDetails4(8967390088l);
		akki.setDetails5(90.678677d);
		akki.setDetails6("Jaishankar Store");
		akki.setDetails7("Akash");
		
		Akki akki1 = new Akki("Ravi","RR Nagar","Magadi",1450,"Maruthi Stores",8762662268l,90.12676d,2950);
		
		akki1.setDetails8("Rajeev");
		akki1.setDetails9("BTM Layout");
		akki1.setDetails10("Kunigal");
		akki1.setDetails11(1400);
		akki1.setDetails12("Vinayaka Store");
		akki1.setDetails13(8976566783l);
		akki1.setDetails14(80.6776756d);
		akki1.setDetails15(3400);
		
		System.out.println("the string representation is==="+akki.toString());
		System.out.println("the string representation is==="+akki1.toString());
		
		System.out.println("the equals method is==="+akki.equals(akki));
		System.out.println("the equals method is==="+akki1.equals(akki1));
		
		System.out.println("the equals method is==="+akki.equals(akki1));
		
		
		System.out.println(akki.hashCode());
		
		System.out.println(akki1.hashCode());
		
		
		

	}

}
