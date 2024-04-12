class Army{
	
	public static void main(String []args){
		
		int noOfPersons=200;
        String armyType="Cammandos";
        char armySeries='Z';	
		
		if(noOfPersons==200 || armyType=="Cammandos" || armySeries=='Z'){
			
			System.out.println("Army trained Successfully");
		}else{
			System.out.println("Army not yet trained");
		}
		
		if(noOfPersons==150 || armyType=="Cammandos" || armySeries=='A'){
			
			System.out.println("Army trained Successfully");
		}else{
			System.out.println("Army not yet trained");
		}
		
		if(noOfPersons==250 || armyType=="Airforce" || armySeries=='C'){
			
			System.out.println("Army trained Successfully");
		}else{
			System.out.println("Army not yet trained");
		}
			
	}
}