class Temple{
	
	public static void main(String []args){
		
		String templeName="Sri Venkateshwara Swamy";
		boolean isTempleOpened=true;
		
		if(templeName=="Sri Venkateshwara Swamy" && isTempleOpened==true){
			
			System.out.println("Temple is opened");
		}else{
			System.out.println("Temple not opened");
		}
		
		if(templeName=="Sri Vinayaka Temple" && isTempleOpened==true){
			
			System.out.println("temple is opened");
		}
		
		if(templeName=="Sri Vinayaka Temple" && isTempleOpened==false){
			
			System.out.println("temple not opened");
		}
			
	}
}