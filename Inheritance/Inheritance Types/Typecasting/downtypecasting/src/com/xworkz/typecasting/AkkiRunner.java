package com.xworkz.typecasting;

public class AkkiRunner {

	public static void main(String[] args) {
		
		Akki akki=new Akki();
		
		Akki akki1=new Rice();
		Muddhe muddhe = new Muddhe();
		
		System.out.println(akki1 instanceof Rice);
		System.out.println(akki instanceof Rice);
		System.out.println(muddhe instanceof Muddhe);
		System.out.println(akki1 instanceof Akki);
		
		akki1.akki();
		((Rice)akki1).rice();
		((Rice)akki1).details(1500,"Bullet");
		
		
		System.out.println("this is string representation==="+((Rice)akki1).toString());
		
		
		
		

	}

}
