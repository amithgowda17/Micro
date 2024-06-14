package com.xworkz.tv.dto;

public class TvDto {
		
		private String showRoomName;
		private String customerName;
		private String showRoomAddress;
		private String customerAddress;
		private long customerNumber;
		private int totalBrands;
		private long showRoomNumber;
		private int noOfCustomers;
		private int totalStaff;
		private boolean ifDataValid;
		
		public TvDto() {
			// TODO Auto-generated constructor stub
		}

		public TvDto(String showRoomName, String customerName, String showRoomAddress, String customerAddress,
				long customerNumber, int totalBrands, long showRoomNumber, int noOfCustomers, int totalStaff,
				boolean ifDataValid) {
			super();
			this.showRoomName = showRoomName;
			this.customerName = customerName;
			this.showRoomAddress = showRoomAddress;
			this.customerAddress = customerAddress;
			this.customerNumber = customerNumber;
			this.totalBrands = totalBrands;
			this.showRoomNumber = showRoomNumber;
			this.noOfCustomers = noOfCustomers;
			this.totalStaff = totalStaff;
			this.ifDataValid = ifDataValid;
		}

		public String getShowRoomName() {
			return showRoomName;
		}

		public void setShowRoomName(String showRoomName) {
			this.showRoomName = showRoomName;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getShowRoomAddress() {
			return showRoomAddress;
		}

		public void setShowRoomAddress(String showRoomAddress) {
			this.showRoomAddress = showRoomAddress;
		}

		public String getCustomerAddress() {
			return customerAddress;
		}

		public void setCustomerAddress(String customerAddress) {
			this.customerAddress = customerAddress;
		}

		public long getCustomerNumber() {
			return customerNumber;
		}

		public void setCustomerNumber(long customerNumber) {
			this.customerNumber = customerNumber;
		}

		public int getTotalBrands() {
			return totalBrands;
		}

		public void setTotalBrands(int totalBrands) {
			this.totalBrands = totalBrands;
		}

		public long getShowRoomNumber() {
			return showRoomNumber;
		}

		public void setShowRoomNumber(long showRoomNumber) {
			this.showRoomNumber = showRoomNumber;
		}

		public int getNoOfCustomers() {
			return noOfCustomers;
		}

		public void setNoOfCustomers(int noOfCustomers) {
			this.noOfCustomers = noOfCustomers;
		}

		public int getTotalStaff() {
			return totalStaff;
		}

		public void setTotalStaff(int totalStaff) {
			this.totalStaff = totalStaff;
		}

		public boolean getIfDataValid() {
			return ifDataValid;
		}

		public void setIfDataValid(boolean ifDataValid) {
			this.ifDataValid = ifDataValid;
		}

		@Override
		public String toString() {
			return "TvDto [showRoomName=" + showRoomName + ", customerName=" + customerName + ", showRoomAddress="
					+ showRoomAddress + ", customerAddress=" + customerAddress + ", customerNumber=" + customerNumber
					+ ", totalBrands=" + totalBrands + ", showRoomNumber=" + showRoomNumber + ", noOfCustomers="
					+ noOfCustomers + ", totalStaff=" + totalStaff + ", ifDataValid=" + ifDataValid + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
			result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
			result = prime * result + (int) (customerNumber ^ (customerNumber >>> 32));
			result = prime * result + (ifDataValid ? 1231 : 1237);
			result = prime * result + noOfCustomers;
			result = prime * result + ((showRoomAddress == null) ? 0 : showRoomAddress.hashCode());
			result = prime * result + ((showRoomName == null) ? 0 : showRoomName.hashCode());
			result = prime * result + (int) (showRoomNumber ^ (showRoomNumber >>> 32));
			result = prime * result + totalBrands;
			result = prime * result + totalStaff;
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
			TvDto other = (TvDto) obj;
			if (customerAddress == null) {
				if (other.customerAddress != null)
					return false;
			} else if (!customerAddress.equals(other.customerAddress))
				return false;
			if (customerName == null) {
				if (other.customerName != null)
					return false;
			} else if (!customerName.equals(other.customerName))
				return false;
			if (customerNumber != other.customerNumber)
				return false;
			if (ifDataValid != other.ifDataValid)
				return false;
			if (noOfCustomers != other.noOfCustomers)
				return false;
			if (showRoomAddress == null) {
				if (other.showRoomAddress != null)
					return false;
			} else if (!showRoomAddress.equals(other.showRoomAddress))
				return false;
			if (showRoomName == null) {
				if (other.showRoomName != null)
					return false;
			} else if (!showRoomName.equals(other.showRoomName))
				return false;
			if (showRoomNumber != other.showRoomNumber)
				return false;
			if (totalBrands != other.totalBrands)
				return false;
			if (totalStaff != other.totalStaff)
				return false;
			return true;
		}
		
		
}
