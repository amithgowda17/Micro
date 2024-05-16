class Telivision{
	
	 public static String brandName="Atal Sethu";
	 public static int noOfTelivision;
	
	 
	public static void name(){
		System.out.println("name="+brandName);
		 
	}
	 
	public static void total(){
		 noOfTelivision=10;
		 System.out.println("total==="+noOfTelivision);
	}
	 
	public static void available(boolean ifAvailable){
		boolean ifTvAvailable=ifAvailable;
		 System.out.println("if available==="+ifTvAvailable);
		 
	}
	 
	public static void main(String [] args){
		name();
        total();
        available(true);		
		
	}
	 
}
