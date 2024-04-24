class ShipRunner{
	
	public static void main(String []args){
		int [] shipNumbers={2,4,6,8,9};
		int [] shipTotal=Ship.noOfShips(shipNumbers);
		
		for(int ship:shipTotal){
			
			System.out.println("Ship numbers are=="+ship);
		}
		
		String[] nameOfBriganda=Ship.brigandaName();
		
		for(String briganda:nameOfBriganda){
			
			System.out.println("name  of brigandas for each ship are=="+briganda);
		}
	}
}