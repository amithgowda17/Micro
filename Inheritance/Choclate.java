class Choclate extends Parle{
	
	String type;
	
	public void chocoType(String type){
		
		System.out.println("type==="+this.type);
		this.type=type;
		System.out.println("type==="+this.type);
		super.type=this.type;
	}
}