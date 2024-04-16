class ItCompany{
	
	public static void main(String args[]){
	
     	int[] noOfItCompanies={21,2,3,4,5,5,44,32,112,134};
		byte[] emplyeesOfItCompany={112,14,12,50,47,15,99,74};
		short[] locationsOfItCompany={1,10,3,4,4,5,8,2};
		long[] dataOfItCompanies={1112,323,4,435,56566,8764,2324,1435435,978645};
		
		for(int i=0;i<noOfItCompanies.length;i++){
			System.out.println("number Of It Companies : "+noOfItCompanies[i]);
		}
		
		for(int i=0;i<emplyeesOfItCompany.length;i++){
			System.out.println("Emplyees Of It Company: "+emplyeesOfItCompany[i]);
		}
		
		for(int i=0;i<locationsOfItCompany.length;i++){
			System.out.println("locations Of ItCompany: "+locationsOfItCompany[i]);
		}
		
		for(int i=0;i<dataOfItCompanies.length;i++){
			System.out.println("Data Of It Companies: "+dataOfItCompanies[i]);
		}
		
	}
}