class Plate{
	
	public static void main(String []args){
		
		int plateNumber=8;
		String dishName="Fried Rice";
		
		switch(plateNumber){
			
			case 1:dishName="Rice and Samber";
			break;
			
			case 2:dishName="Biryani";
			break;
			
			case 3:dishName="GheeRice";
			break;
			
			case 4:dishName="Pulav";
			break;
			
			case 5:dishName="Dosa";
			break;
			
			case 6:dishName="Idly";
			break;
			
			case 7:dishName="Curd Rice";
			break;
			
			case 8:dishName="Fried Rice";
			break;
			
			case 9:dishName="Parota";
			break;
			
			case 10:dishName="Poori";
			break;
			
			default:dishName="invalid";
			
		}System.out.println("the selected dish is==="+dishName);
	
	}
}
