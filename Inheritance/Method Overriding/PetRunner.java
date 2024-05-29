class PetRunner{
	
	public static void main(String []args){
		
		Pet pet=new Dog();
		pet.pets();
		pet.food();
		((Dog)pet).breed();
		((Dog)pet).color();
		
	}
	
}