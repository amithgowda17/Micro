class PetrolBunkRunner{
	
	public static void main(String []args){
		
		System.out.println("This is main method");
		
		PetrolBunk bunk=new PetrolBunk();
		bunk.totalRefills();
		bunk.isDesielAvailable();
		bunk.nameOfBunk();
		
		System.out.println("total number of refills in bunk are=="+bunk.noOfRefills);
		System.out.println("storage capacity is==="+bunk.storage);
		System.out.println("code of the bunk is is==="+bunk.code);
		System.out.println("series of the bunk is==="+bunk.seriesOfBunk);
		System.out.println("owner phone number is==="+bunk.ownerNumber);
		System.out.println("is petrol available==="+bunk.isPetrolAvailable);
		System.out.println("cost of one litre petrol is==="+bunk.costOfPetrol);
		System.out.println("gst of the petrol==="+bunk.gstOfPetrol);
		System.out.println("bunk name==="+bunk.bunkName);
		
		
		
	}
}