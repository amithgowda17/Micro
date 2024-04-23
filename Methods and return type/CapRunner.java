class CapRunner{
	
	public static void main(String []args){
		
		Cap.capTotalVaries();
	
		int [] capTotal=Cap.capTotalVaries();
		
		for(int cap:capTotal){
			
			System.out.println("total numbers of caps are=="+cap);
		
		}
		
		Cap.ownerDetails();
		
		String [] owner=Cap.ownerDetails();
		
		for(int i=0;i<owner.length;i++){
			
			System.out.println("cap owners name is==="+owner[i]);
		}
		
	}

}