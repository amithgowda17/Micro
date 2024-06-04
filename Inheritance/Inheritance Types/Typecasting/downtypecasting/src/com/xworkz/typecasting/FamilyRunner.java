package com.xworkz.typecasting;

public class FamilyRunner {
	
	
	public static void main(String[] args) {
		
		Shivaram shiv=new Shivaram();
		
		Shivaram shivaram=new Ravi();
		shivaram.father();
		((Ravi) shivaram).son();
		
		Nanjappa nanjappa = new Nanjappa();
		
		Ravi ravi=new Ravi();
		
		ravi.youngerSon("Ravi", 1);
		
		
		System.out.println(shivaram instanceof Ravi);
		System.out.println(shivaram instanceof Shivaram);
		System.out.println(nanjappa instanceof Nanjappa);
		System.out.println(shiv instanceof Ravi);
		
		System.out.println("this is string representation==="+ravi.toString());
		
		
		
		
		
		
		
	}

}
