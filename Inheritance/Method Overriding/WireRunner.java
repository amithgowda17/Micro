class WireRunner{
	
	public static void main(String []args){
		
		Wire wire=new Finolex();
		wire.quality();
		wire.cost();
		((Finolex)wire).companyName();
		((Finolex)wire).price();
		
	}
	
}