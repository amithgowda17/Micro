class Sambar{
	
    public static int noOfSamabars=10;
    public static String sambarName="Mutton Sambar";
	
    public static int total(){
		
		if (noOfSamabars==10){
			
			System.out.println("there are many sambars");
			return noOfSamabars;

		}else{
			
			System.out.println("no sambars available");
			return noOfSamabars;
			
		}
   }
	
    public static String name(){
		
		if (sambarName=="Bele Sambar"){
			
			System.out.println("Sambar doesn't matched");

		}else{
			
			System.out.println("sambar name matched as");
		}
		return sambarName;
	}
}
