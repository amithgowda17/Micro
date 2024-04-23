class BuildingRunner{
	
	public static void main(String []args){
		
		int[] totalFloors=Building.noOfFloors();
		
		for(int i=0;i<totalFloors.length;i++){
			
			System.out.println("number of floors in various buildings are==="+totalFloors[i]);
		}
		
		short [] squareFeet=Building.sqFeet();
		
		for(short dimensions:squareFeet){
			
			System.out.println("sqfeet of buildings are==="+dimensions);
		}
	}
}