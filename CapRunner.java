class CapRunner{
	
	public static void main(String []args){
		
		Cap.capTotalVaries();
		int[] capTotal;
		capTotal=Cap.capTotalVaries();
		
		for(int cap:capTotal){
			
			System.out.println("total numbers of caps are=="+Cap.capTotalVaries());
		}
		
	}

}