class AkkiRunner{
	
	public static void main(String []args){
		
		Akki akki=new Dosa();
		akki.items();
		akki.dish();
		((Dosa)akki).oil();
		((Dosa)akki).chutney();
		
	}
	
}