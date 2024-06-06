package boot;

import thing.Pen;

public class PenRunner {
	
	public static void main(String[] args) {
		
		Object obj=new Object();
		
		Pen pen = new Pen(1000,"Ravi","Venu",100,"RR Nagar",1100,"Akask");
		
		Pen pen1=new Pen("Abhi",110,"Btm layout",1200,"Ramesh","Rakshith",120,"Rajajinagar");
		
		pen.setDetails1(1000);
		pen.setDetails2("Ravi");
		pen.setDetails3("Venu");
		pen.setDetails4(100);
		pen.setDetails5("RR Nagar");
		pen.setDetails6(110);
		pen.setDetails7("Akash");
		
		pen1.setDetails8("Abhi");
		pen1.setDetails9(110);
		pen1.setDetails10("Btm layout");
		pen1.setDetails11(1200);
		pen1.setDetails12("Ramesh");
		pen1.setDetails13("Rakshith");
		pen1.setDetails14(120);
		pen1.setDetails15("Rajajinagar");
		
		System.out.println(pen.toString());
		
		System.out.println(pen1.toString());
		

		System.out.println(pen.equals(pen1));
		System.out.println(pen1.equals(pen));
		System.out.println(pen.equals(obj));
		
		System.out.println(pen.hashCode());
		System.out.println(pen1.hashCode());
		
		
		
		
		
		
	}

}
