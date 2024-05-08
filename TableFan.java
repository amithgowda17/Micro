class TableFan{
	
	public TableFan(){
		
		System.out.println("This is no argument constructor");
	}
	
	public TableFan(int noOfTableFan){
		System.out.println("number of fans are==="+noOfTableFan);
	}
	
	public TableFan(int noOfTableFan,long ownerNumber){
		System.out.println("the details of tablefan are noOfTableFan==="+noOfTableFan+"and ownerNumber==="+ownerNumber);
		
	}
	
	public TableFan(int noOfTableFan,long ownerNumber,char series){
		System.out.println("the details of tablefan are noOfTableFan==="+noOfTableFan+"and ownerNumber==="+ownerNumber+" and series==="+series);
	}
	
	public TableFan(int noOfTableFan,long ownerNumber,char series,float cost){
		System.out.println("the details of tablefan are noOfTableFan==="+noOfTableFan+"and ownerNumber==="+ownerNumber+" and series==="+series+" and cost==="+cost);

	}
	
	public TableFan(int noOfTableFan,long ownerNumber,char series,float cost,double gst){
		System.out.println("the details of tablefan are noOfTableFan==="+noOfTableFan+"and ownerNumber==="+ownerNumber+" and series==="+series+" and cost==="+cost+" and gst==="+gst);
	}
	
	public TableFan(int noOfTableFan,long ownerNumber,char series,float cost,double gst,boolean ifFanWorking){
		System.out.println("the details of tablefan are noOfTableFan==="+noOfTableFan+"and ownerNumber==="+ownerNumber+" and series==="+series+" and cost==="+cost+" and gst==="+gst+" and ifFanWorking==="+ifFanWorking);
	}
	
	public TableFan(int noOfTableFan,long ownerNumber,char series,float cost,double gst,boolean ifFanWorking,String companyName){
		System.out.println("the details of tablefan are noOfTableFan==="+noOfTableFan+"and ownerNumber==="+ownerNumber+" and series==="+series+" and cost==="+cost+" and gst==="+gst+" and ifFanWorking==="+ifFanWorking+" and company name==="+companyName);
	}
	
	
}