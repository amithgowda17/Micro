package com.xworkz.constants;

public enum TheatrePlaceEnum {
	
	HEGGANHALLI_CROSS("Mohan",1), RAJGOPALNAGAR("Maruthi",2),DASARAHALLI("Veeresh",2),KAMAKSHIPALYA("Victory",2)
	,SUMMANHALLI("Virabhadreshwara",2),TOLGATE("Prasanna",1),GT_MALL("PVR",4),MAGADI_ROAD("Narthaki",2);
	
	private String theatreName;
	private int noOfScreen;
	
	
	TheatrePlaceEnum(String theatreName, int noOfScreen) {
		
		this.theatreName=theatreName;
		this.noOfScreen=noOfScreen;
	}


	public String getTheatreName() {
		return theatreName;
	}


	public int getNoOfScreen() {
		return noOfScreen;
	}


}
