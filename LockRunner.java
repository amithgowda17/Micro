class LockRunner{
	
	public static void main(String []args){
		int []lockNum={2,4,6,8,9};
		int []lockVaries=Lock.noOfLocks(lockNum);
		
		for(int lock:lockVaries){
			
			System.out.println("lock numbers are=="+lock);
		}
		
		String[] ownerNames=Lock.ownerName();
		
		for(String nameOfOwners:ownerNames){
			
			System.out.println("owners name are=="+nameOfOwners);
		}
	}
}