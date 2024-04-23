class BallonRunner{
	
	public static void main(String []args){
		
		int[] totalBallon=Ballon.ballonTotal();
		
		for(int i=0;i<totalBallon.length;i++){
			
			System.out.println("number of ballons varies==="+totalBallon[i]);
		}
		
		float [] cost=Ballon.ballonCost();
		
		for(float price:cost){
			
			System.out.println("cost of ballons are==="+price);
		}
	}
}