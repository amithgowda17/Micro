package com.xworkz.facebook.things;

import com.xworkz.facebook.dto.FacebookDto;

public class FacebookThings {
	
	public void save(int accounts,int followings,String hesaru,String address,long contactNumber,
			         String gmail,int photos,int age,boolean isDataValid,int friends) {
		
		FacebookDto dto=new FacebookDto();
		
		dto.setTotalAccounts(accounts);
		dto.setNoOfFollowings(followings);
		dto.setName(hesaru);
		dto.setAddress(address);
		dto.setPhoneNumer(contactNumber);
		dto.setEmailId(gmail);
		dto.setNoOfPhotos(photos);
		dto.setAge(age);
		dto.setDataValid(isDataValid);
		dto.setNoOfFriends(friends);
		
		dto.getTotalAccounts();
		dto.getNoOfFollowings();
		dto.getName();
		dto.getAddress();
		dto.getPhoneNumer();
		dto.getEmailId();
		dto.getNoOfPhotos();
		dto.getAge();
		dto.getDataValid();
		dto.getNoOfFriends();
	
	
	}

}
