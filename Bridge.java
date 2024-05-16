class Bridge{
	
	 public static String bridgeName="Atal Sethu";
	 public static int noOfBridge;
	//public static boolean ifBridgeAvailable;
	 
	public static void name(){
		System.out.println("name="+bridgeName);
		 
	}
	 
	public static void total(){
		 noOfBridge=10;
		 System.out.println("total==="+noOfBridge);
	}
	 
	public static void available(boolean ifAvailable){
		boolean ifBridgeAvailable=ifAvailable;
		 System.out.println("if available==="+ifBridgeAvailable);
		 
	}
	 
	public static void main(String [] args){
		name();
                total();
                available(true);		
		
	}
	 
}
