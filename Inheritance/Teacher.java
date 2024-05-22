class Teacher extends Principal{
	
	int totalStaff;
	
	public void staff(int totalStaff){
		
		System.out.println("total==="+this.totalStaff);
		this.totalStaff=totalStaff;
		System.out.println("total==="+this.totalStaff);
		super.totalStaff=this.totalStaff;
	}
}