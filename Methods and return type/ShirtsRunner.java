class ShirtsRunner{
	
	public static void main(String []args){
		
		int[] cost=Shirt.costOfShirt();
		
		for(int i=0;i<cost.length;i++){
			
			System.out.println("cost of various shirts are==="+cost[i]);
		}
		
		char [] size=Shirt.shirtSize();
		
		for(char sizeOfShirt:size){
			
			System.out.println("cost of ballons are==="+sizeOfShirt);
		}
	}
}