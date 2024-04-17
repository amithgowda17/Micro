//6)write a program to declare 2 datatypes give a example for switch

class Week{
	
	public static void main(String []args){
		
		int noOfTheDay=5;
		String dayName="Friday";
		
		switch(noOfTheDay){
		
		 case 1:dayName="Monday";
		 break;
		 
		 case 2:dayName="Tuesday";
		 break;
		 
		 case 3:dayName="Wednesday";
		 break;
		 
		 case 4:dayName="Thursday";
		 break;
		 
		 case 5:dayName="Friday";
		 break;
		 
		 case 6:dayName="Saturday";
		 break;
		 
		 case 7:dayName="Sunday";
		 break;
		 
		 default:dayName="Invalid";
		 break;
		}
		System.out.println("the name of the particular day is=="+dayName);
	}
}