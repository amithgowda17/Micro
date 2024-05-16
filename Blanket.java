class Blanket{
	
	 public static String brandName="Sleepweel";
	 public static int noOfBlanket;
	//public static boolean ifBlanketAvailable;
	 
	public static void name(){
		System.out.println("name="+brandName);
		 
	}
	 
	public static void total(){
		 noOfBlanket=10;
		 System.out.println("total==="+noOfBlanket);
	}
	 
	public static void available(boolean ifAvailable){
		boolean ifBlanketAvailable=ifAvailable;
		 System.out.println("if available==="+ifBlanketAvailable);
		 
	}
	 
	public static void main(String [] args){
		name();
        total();
        available(true);		
		
	}
	 
}
