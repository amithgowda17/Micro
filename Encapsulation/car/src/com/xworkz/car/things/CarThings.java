package com.xworkz.car.things;

import com.xworkz.car.dto.CarDto;

public class CarThings {
	
	public void save(String showRoomName,String customerName,String showRoomAddress,String customerAddress,
			long customerNumber,int totalBrands,long showRoomNumber, int noOfCustomers,int totalStaff,boolean ifDataValid) {
		
		CarDto dto=new CarDto();
		
		dto.setShowRoomName(showRoomName);
		dto.setCustomerName(customerName);
		dto.setShowRoomAddress(showRoomAddress);
		dto.setCustomerAddress(customerAddress);
		dto.setCustomerNumber(customerNumber);
		dto.setTotalBrands(totalBrands);
		dto.setShowRoomNumber(showRoomNumber);
		dto.setNoOfCustomers(noOfCustomers);
		dto.setTotalStaff(totalStaff);
		dto.setIfDataValid(ifDataValid);
		
		dto.getShowRoomName();
		dto.getCustomerName();
		dto.getShowRoomAddress();
		dto.getCustomerAddress();
		dto.getCustomerNumber();
		dto.getTotalBrands();
		dto.getShowRoomNumber();
		dto.getNoOfCustomers();
		dto.getTotalStaff();
		dto.getIfDataValid();
		
	}

}
