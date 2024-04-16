class Geometry{
	
	public static void main(String []args){
		 
		 int geometryId=15;
		 String geometryType="Circle";
		 
		 if(geometryId!=25 && geometryType=="Circle"){
		 
		 System.out.println("the geometry type is=="+geometryType);
		 
		 }else{
			 
			System.out.println("invalid");
		}
		
		if(geometryId==15 && geometryType!="Square"){
		 
		 System.out.println("geometry type is verified successfully");
		 
		 }else{
			 
			System.out.println("Invalid entry");
		}
	}
}
