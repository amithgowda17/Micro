package boot;

import things.FacebookThings;

public class FacebookRunner {
	
	public static void main(String[] args) {
		
		FacebookThings things = new FacebookThings();
		
		things.save(14, "Vijay");
	}

}
