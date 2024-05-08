class Bottle{
	
	public Bottle(){
		
		System.out.println("This is no argument constructor");
	}
	
	public Bottle(int noOfBottles){
		System.out.println("number of bottles are==="+noOfBottles);
	}
	
	public Bottle(int noOfBottles,long ownerNumber){
		System.out.println("the details of bottle are noOfBottles==="+noOfBottles+"and ownerNumber==="+ownerNumber);
		
	}
	
	public Bottle(int noOfBottles,long ownerNumber,char series){
		System.out.println("the details of bottle are noOfBottles==="+noOfBottles+"and ownerNumber==="+ownerNumber+" and series==="+series);
	}
	
	public Bottle(int noOfBottles,long ownerNumber,char series,float cost){
		System.out.println("the details of bottle are noOfBottles==="+noOfBottles+"and ownerNumber==="+ownerNumber+" and series==="+series+" and cost==="+cost);

	}
	
	public Bottle(int noOfBottles,long ownerNumber,char series,float cost,double gst){
		System.out.println("the details of bottle are noOfBottles==="+noOfBottles+"and ownerNumber==="+ownerNumber+" and series==="+series+" and cost==="+cost+" and gst==="+gst);
	}
	
	public Bottle(int noOfBottles,long ownerNumber,char series,float cost,double gst,boolean ifWaterAvailable){
		System.out.println("the details of bottle are noOfBottles==="+noOfBottles+"and ownerNumber==="+ownerNumber+" and series==="+series+" and cost==="+cost+" and gst==="+gst+" and ifwateravailable==="+ifWaterAvailable);
	}
	
	public Bottle(int noOfBottles,long ownerNumber,char series,float cost,double gst,boolean ifWaterAvailable,String bottleContains){
		System.out.println("the details of bottle are noOfBottles==="+noOfBottles+"and ownerNumber==="+ownerNumber+" and series==="+series+" and cost==="+cost+" and gst==="+gst+" and ifwateravailable==="+ifWaterAvailable+" and bottle contains==="+bottleContains);
	}
	
	
}