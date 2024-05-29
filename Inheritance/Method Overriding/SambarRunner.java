class SambarRunner{
	
	public static void main(String []args){
		
		Sambar sambar=new FishSambar();
		sambar.ingredients();
		sambar.cost();
		((FishSambar)sambar).fish();
		((FishSambar)sambar).price();
		
	}
	
}