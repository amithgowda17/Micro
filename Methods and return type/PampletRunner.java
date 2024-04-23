class PampletRunner{
	
	public static void main(String []args){
		
		int[] total=Pamplet.noOfPamplet();
		
		for(int i=0;i<total.length;i++){
			
			System.out.println("no of pamplets are==="+total[i]);
		}
		
		String [] content=Pamplet.pampletContent();
		
		for(String contentInPamplet:content){
			
			System.out.println("content in pamplets are==="+contentInPamplet);
		}
	}
}