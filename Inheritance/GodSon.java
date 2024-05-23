class GodSon extends GodFather{
	
	String godName;
	
	public void nameSon(String godName){
		
		System.out.println("the name of the god is==="+this.godName);
		this.godName=godName;
		System.out.println("the name of the god is==="+this.godName);
		super.godName=godName;
	}

}
