class MatchBox{
	
	 public static String matchBoxName="Matches";
	 public static int noOfMatchBox;
	
	 
	public static void name(){
		System.out.println("name="+matchBoxName);
		 
	}
	 
	public static void total(){
		 noOfMatchBox=10;
		 System.out.println("total==="+noOfMatchBox);
	}
	 
	public static void available(boolean ifAvailable){
		boolean ifMatchBoxAvailable=ifAvailable;
		System.out.println("if available==="+ifMatchBoxAvailable);
		 
	}
	 
	public static void main(String [] args){
		name();
                total();
                available(true);		
		
	}
}
