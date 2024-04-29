class PetrolBunk{
	
	public int noOfRefills=6;
	public byte storage=100;
	public short code=5567;
	public long ownerNumber=9875364526l;
	public char seriesOfBunk='P';
	public boolean isPetrolAvailable=true;
	public float costOfPetrol=100.1234f;
	public double gstOfPetrol=2.325219d;
	public String bunkName="Shell";
	
	public void totalRefills(){
		
		System.out.println("Each petrol bunk contains 6 refills");
	}
	
	public void isDesielAvailable(){
		
		System.out.println("desiel also available");
	}
	
	public void nameOfBunk(){
		
		System.out.println("Shell is the name of bunk");
	}
	
}