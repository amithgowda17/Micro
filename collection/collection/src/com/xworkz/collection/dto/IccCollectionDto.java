package com.xworkz.collection.dto;

public class IccCollectionDto {
	
	private int iccRankings;
	private String teamName;
	private String captainName;
	
	public IccCollectionDto(int iccRankings, String teamName, String captainName) {
		
		super();
		this.iccRankings = iccRankings;
		this.teamName = teamName;
		this.captainName = captainName;
	}

	public int getIccRankings() {
		return iccRankings;
	}

	public void setIccRankings(int iccRankings) {
		this.iccRankings = iccRankings;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	@Override
	public String toString() {
		return "IccCollectionDto [iccRankings=" + iccRankings + ", teamName=" + teamName + ", captainName="
				+ captainName + "]";
	}
	
	

}
