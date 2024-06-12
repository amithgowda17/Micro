package com.xworkz.facebook.dto;

public class FacebookDto {
	
	private int totalAccounts;
	private int noOfFollowings;
	private String name;
	private String address;
	private long phoneNumber;
	private String emailId;
	private int noOfPhotos;
	private int age;
	private boolean isDataValid;
	private int noOfFriends;
	
	
	public FacebookDto() {
		// TODO Auto-generated constructor stub
	}


	public FacebookDto(int totalAccounts, int noOfFollowings, String name, String address, long phoneNumber,
			String emailId, int noOfPhotos, int age, boolean isDataValid, int noOfFriends) {
		super();
		this.totalAccounts = totalAccounts;
		this.noOfFollowings = noOfFollowings;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.noOfPhotos = noOfPhotos;
		this.age = age;
		this.isDataValid = isDataValid;
		this.noOfFriends = noOfFriends;
	}


	public int getTotalAccounts() {
		System.out.println("totalAccounts==="+totalAccounts);
		return totalAccounts;
	}


	public void setTotalAccounts(int totalAccounts) {
		this.totalAccounts = totalAccounts;
	}


	public int getNoOfFollowings() {
		System.out.println("noOfFollowings==="+noOfFollowings);
		return noOfFollowings;
	}


	public void setNoOfFollowings(int noOfFollowings) {
		this.noOfFollowings = noOfFollowings;
	}


	public String getName() {
		System.out.println("name==="+name);
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		System.out.println("address==="+address);
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getPhoneNumer() {
		System.out.println("phoneNumber==="+phoneNumber);
		return phoneNumber;
	}


	public void setPhoneNumer(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmailId() {
		System.out.println("emailId==="+emailId);
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public int getNoOfPhotos() {
		System.out.println("noOfPhotos==="+noOfPhotos);
		return noOfPhotos;
	}


	public void setNoOfPhotos(int noOfPhotos) {
		this.noOfPhotos = noOfPhotos;
	}


	public int getAge() {
		System.out.println("age==="+age);
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean getDataValid() {
		System.out.println("isDataValid==="+isDataValid);
		return isDataValid;
	}


	public void setDataValid(boolean isDataValid) {
		this.isDataValid = isDataValid;
	}


	public int getNoOfFriends() {
		System.out.println("noOfFriends==="+noOfFriends);
		return noOfFriends;
	}


	public void setNoOfFriends(int noOfFriends) {
		this.noOfFriends = noOfFriends;
	}


	@Override
	public String toString() {
		return "Facebookdto [totalAccounts=" + totalAccounts + ", noOfFollowings=" + noOfFollowings + ", name=" + name
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + ", noOfPhotos="
				+ noOfPhotos + ", age=" + age + ", isDataValid=" + isDataValid + ", noOfFriends=" + noOfFriends + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + (isDataValid ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfFollowings;
		result = prime * result + noOfFriends;
		result = prime * result + noOfPhotos;
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
		result = prime * result + totalAccounts;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FacebookDto other = (FacebookDto) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (isDataValid != other.isDataValid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfFollowings != other.noOfFollowings)
			return false;
		if (noOfFriends != other.noOfFriends)
			return false;
		if (noOfPhotos != other.noOfPhotos)
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (totalAccounts != other.totalAccounts)
			return false;
		return true;
	}


	
}
