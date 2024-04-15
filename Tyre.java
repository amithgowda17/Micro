class Tyre{
	
	public static void main(String []args){
		
		int noOfTyre=4;
        String vehicleType="car";
        short vehicleNumber=5567;	
		
		if(noOfTyre==4 && vehicleType=="car" && vehicleNumber==5567){
			
			System.out.println("Vehicle Booked Successfully");
		}else{
			System.out.println("Vehicle not booked yet");
		}
		
		if(noOfTyre==4 && vehicleType=="car" && vehicleNumber==4467){
			
			System.out.println("Vehicle Booked Successfully");
		}else{
			System.out.println("Vehicle not booked yet");
		}
		
		if(noOfTyre==5 && vehicleType=="car" && vehicleNumber==5567){
			
			System.out.println("Vehicle Booked Successfully");
		}else{
			System.out.println("Vehicle not booked yet");
		}
			
	}
}