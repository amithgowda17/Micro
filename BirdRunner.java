class BirdRunner{
	
	public static void main(String args[]){
		
	   String [] bird=Bird.birdName();
		
	   for(String values:bird){
			
			System.out.println("The names of Birds : "+values);
		}

	   int [] ageOfTheBirds ={16,23,10};
	   int [] ageMethod=Bird.birdAge(ageOfTheBirds);
	
	   for(int forOfAnAge:ageMethod){
			
	      System.out.println("The age of Birds : "+forOfAnAge);
	    }
	}
}
