//7) write a program to declare 2 types of datatypes give an example for if else and for(and operator and or operator 

class Pen{
	
	public static void main(String []args){
		
		int noOfPens=10;
	    int[] price={10,15,20,15,15,20,10,10,20,15};
		String ownerName="Girish";
		
		if(noOfPens==10 && ownerName=="Girish"){
			
			System.out.println("owner name is succesfully verified as=="+ownerName);
		}else{
			
			System.out.println("Invalid input");
		}
		
		if(noOfPens!=10 || ownerName=="Girish"){
			
			System.out.println("Girish brought 10 pens");
		}else{
			
			System.out.println("Invalid input");
		}
		
		System.out.println("length of the price is=="+price.length);
		
		for(int i=0;i<price.length;i++){
			
			System.out.println("price of each pen is=="+price[i]);
		}
	
		
	}
}
