class Bottle{
	
	public static void main(String [] args){
		
		int price=100;
		double gst = price;
		System.out.println("this is implicit cost="+gst);
		
		double cgst=1000.123;
		int rate = (int)cgst;
		System.out.println("this is expilict cost="+rate);
		
		int data=65;
        char name=(char)data;
        System.out.println("this is convertion of int to char=="+name);	 
	 
        char nameLetter='c';
	    int valueOfTheLetter=nameLetter;
	    System.out.println("this is convertion of char to int==="+valueOfTheLetter);	 
	 
	    boolean ifBottle=false;
	    int bottleValue = ifBottle ?1:0 ;
	    System.out.println("this is convertion of boolean  to int==="+bottleValue);	 
	 
	}
}