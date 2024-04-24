class MoleRunner{
	
	public static void main(String []args){
		
		String[] commandoNames=Mole.comnmanderNameOfEachCamp();
		
		for(String nameOfCammdos:commandoNames){
			
			System.out.println("commandos name are=="+nameOfCammdos);
		}
		
		int [] camps={10,15,20,14,10};
		int [] campsVaries=Mole.noOfCamps(camps);
		
		for(int totalCamps:campsVaries){
			
			System.out.println("number of camps are=="+totalCamps);
		}
	}
}