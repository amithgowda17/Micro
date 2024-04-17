class Hotel{
	
	static int noOfDish=10;
	static String dishName="Masala Dosa";
	static boolean isHotelOpened=true;
	
	public static void totalDishesInHotel(){
		famousDishInHotel();
		System.out.println("total number of dishes in hotel are=="+noOfDish);
	}
	
	public static void famousDishInHotel(){
		System.out.println("famous dish of the hotel is=="+dishName);
	}
	
}