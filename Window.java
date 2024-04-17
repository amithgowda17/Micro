class Window{
	
	static int noOfWindow=4;
	static boolean isWindowOpened=true;
	
	public static void totalWindow(){
		doesWindowOpened();
		System.out.println("total number of windows are=="+noOfWindow);
	}
	
	public static void doesWindowOpened(){
		System.out.println("does window opened=="+isWindowOpened);
	}
	
}