class Blade{
	
	public static void main(String []args){
		
		int bladeNumber=5;
		String bladeType="Circular";
		
		switch(bladeNumber){
			
			case 1:bladeType="Long";
			break;
			
			case 2:bladeType="Short";
			break;
			
			case 3:bladeType="Thin";
			break;
			
			case 4:bladeType="Quadrat";
			break;
			
			case 5:bladeType="Circular";
			break;
			
			case 6:bladeType="square";
			break;
			
			case 7:bladeType="Rounded";
			break;
			
			case 8:bladeType="Spiral";
			break;
			
			case 9:bladeType="Sharp";
			break;
			
			case 10:bladeType="notsharped";
			break;
			
			default:bladeType="invalid";
			
		}System.out.println("the selected dish is==="+bladeType);
	}
}