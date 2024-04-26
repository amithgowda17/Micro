class CylinderRunner{
	
	public static void main(String []args){
		
		System.out.println("This is main method");
		
		Cylinder cylinderDetails=new Cylinder();
		cylinderDetails.cylinderType();
		cylinderDetails.cylinderWeight();
		cylinderDetails.cylinderAgency();
		
		System.out.println("total number of cylinders are=="+cylinderDetails.noOfCylinder);
		System.out.println("storage capacity is==="+cylinderDetails.storage);
		System.out.println("cylinder code is==="+cylinderDetails.cylinderCode);
		System.out.println("series of cylinder is==="+cylinderDetails.seriesOfCylinder);
		System.out.println("owner phone number is==="+cylinderDetails.ownerNumber);
		System.out.println("is cylinder available==="+cylinderDetails.isCylinderAvailable);
		System.out.println("cost of cylinder is==="+cylinderDetails.costOfCylinder);
		System.out.println("gst of the cylinder==="+cylinderDetails.gstOfCylinder);
		System.out.println("cylinder name==="+cylinderDetails.cylinderName);
		
		
		
	}
}