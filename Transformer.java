class Transformer{
	
	 public static String companyName="Power Transformer";
	 public static int noOfTransformer;
	
	 
	public static void name(){
		System.out.println("name="+companyName);
		 
	}
	 
	public static void total(){
		 noOfTransformer=10;
		 System.out.println("total==="+noOfTransformer);
	}
	 
	public static void available(boolean ifAvailable){
		boolean ifElectricityAvailable=ifAvailable;
		System.out.println("if available==="+ifElectricityAvailable);
		 
	}
	 
	public static void main(String [] args){
		name();
                total();
                available(true);		
		
	}
	 
}
