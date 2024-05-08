class Door{
	
	public Door(){
		
		System.out.println("This is no argument constructor");
	}
	
	public Door(int noOfDoor){
		System.out.println("number of door are==="+noOfDoor);
	}
	
	public Door(int noOfDoor,long ownerNumber){
		System.out.println("the details of door are noOfDoor==="+noOfDoor+"and ownerNumber==="+ownerNumber);
		
	}
	
	public Door(int noOfDoor,long ownerNumber,char series){
		System.out.println("the details of door are noOfDoor==="+noOfDoor+"and ownerNumber==="+ownerNumber+" and series==="+series);
	}
	
	public Door(int noOfDoor,long ownerNumber,char series,float cost){
		System.out.println("the details of door are noOfDoor==="+noOfDoor+"and ownerNumber==="+ownerNumber+" and series==="+series+" and cost==="+cost);

	}
	
	public Door(int noOfDoor,long ownerNumber,char series,float cost,double gst){
		System.out.println("the details of door are noOfDoor==="+noOfDoor+"and ownerNumber==="+ownerNumber+" and series==="+series+" and cost==="+cost+" and gst==="+gst);
	}
	
	public Door(int noOfDoor,long ownerNumber,char series,float cost,double gst,boolean ifDoorClosed){
		System.out.println("the details of door are noOfDoor==="+noOfDoor+"and ownerNumber==="+ownerNumber+" and series==="+series+" and cost==="+cost+" and gst==="+gst+" and ifDoorClosed==="+ifDoorClosed);
	}
	
	public Door(int noOfDoor,long ownerNumber,char series,float cost,double gst,boolean ifDoorClosed,String ownerName){
		System.out.println("the details of door are noOfDoor==="+noOfDoor+"and ownerNumber==="+ownerNumber+" and series==="+series+" and cost==="+cost+" and gst==="+gst+" and ifDoorClosed==="+ifDoorClosed+" and owner name==="+ownerName);
	}
	
	
}