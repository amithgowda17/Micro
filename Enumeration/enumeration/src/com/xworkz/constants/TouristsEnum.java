package com.xworkz.constants;

public enum TouristsEnum {
	
	GOKARANA("Murudeshwara Temple",467), MYSORE("Mysorpalace",142),CHIKKBALLAPURA("Nandihills",60),BHATKAL("Netrani",525)
	,VIJAYANAGARA("Hampi",340),UDUPI("Sri Kirshna Temple",403),NAGARHOLE("Rajiv Gandhi National Park",218),BANDIPURA("Bandipura national park",231);

	
	
	private String placeName;
	private int noOfKm;
	
	TouristsEnum(String placeName, int noOfKm) {
		this.placeName=placeName;
		this.noOfKm=noOfKm;
	}

	public String getPlaceName() {
		return placeName;
	}

	public int getNoOfKm() {
		return noOfKm;
	}

		
}
