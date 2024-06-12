package com.xworkz.facebook.boot;

import com.xworkz.facebook.things.FacebookThings;

public class FacebookRunner {

	public static void main(String[] args) {
		
		FacebookThings things=new FacebookThings();
		
		things.save(1, 10, "Ravi", "Bengaluru", 767778890l, "ravi@gmail.com", 10, 19, true, 200);
		

	}

}
