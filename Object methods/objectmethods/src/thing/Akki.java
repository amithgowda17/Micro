package thing;

public class Akki {

	public int price;
	public String companyName;
	public long customerNumber;
	public long ownerNumber;
	public double gst;
	public String storeName;
	public String customerName;
	public String ownerName;
	public String storeAddress;
	public String customerAddress;
	public int priceOfAnother;
	public String anotherCompanyName;
	public long secondCustomerNumber;
	public double gstOfSecond;
	public int totalPrice;

	public void setDetails1(int price) {
		this.price = price;
	}

	public void setDetails2(String companyName) {
		this.companyName = companyName;
	}

	public void setDetails3(long customerNumber) {
		this.customerNumber = customerNumber;

	}

	public void setDetails4(long ownerNumber) {
		this.ownerNumber = ownerNumber;

	}

	public void setDetails5(double gst) {
		this.gst = gst;

	}

	public void setDetails6(String storeName) {
		this.storeName = storeName;

	}

	public void setDetails7(String customerName) {
		this.customerName = customerName;

	}

	public void setDetails8(String ownerName) {
		this.ownerName = ownerName;

	}

	public void setDetails9(String storeAddress) {
		this.storeAddress = storeAddress;

	}

	public void setDetails10(String customerAddress) {
		this.customerAddress = customerAddress;

	}

	public void setDetails11(int priceOfAnother) {
		this.priceOfAnother = priceOfAnother;

	}

	public void setDetails12(String anotherCompanyName) {
		this.anotherCompanyName = anotherCompanyName;

	}

	public void setDetails13(long secondCustomerNumber) {
		this.secondCustomerNumber = secondCustomerNumber;

	}

	public void setDetails14(double gstOfSecond) {
		this.gstOfSecond = gstOfSecond;

	}

	public void setDetails15(int totalPrice) {
		this.totalPrice = totalPrice;

	}

	public int getDetails1() {
		return price; 

	}

	public String getDetails2() {
		return companyName;

	}

	public long getDetails3() {
		return customerNumber;

	}

	public long getDetails4() {
		return ownerNumber;

	}

	public double getDetails5() {
		return gst;

	}

	public String getDetails6() {
		return storeName;

	}

	public String getDetails7() {
		return customerName;

	}

	public String getDetails8() {
		return ownerName;

	}

	public String getDetails9() {
		return storeAddress;

	}

	public String getDetails10() {
		return customerAddress;

	}

	public int getDetails11() {
		return priceOfAnother;

	}

	public String getDetails12() {
		return anotherCompanyName;

	}

	public long getDetails13() {
		return secondCustomerNumber;

	}

	public double getDetails14() {
		return gstOfSecond;

	}

	public int getDetails15() {
		return totalPrice;

	}

	public Akki(int price, String companyName, long customerNumber, long ownerNumber, double gst, 
			    String storeName,String customerName) {

		this.price = price;
		this.companyName = companyName;
		this.customerNumber = customerNumber;
		this.ownerNumber = ownerNumber;
		this.gst = gst;
		this.storeName = storeName;
		this.customerName = customerName;

	}

	public Akki(String ownerName, String storeAddress, String customerAddress, int priceOfAnother,
			    String anotherCompanyName, long secondCustomerNumber, double gstOfSecond, int totalPrice) {

		this.ownerName = ownerName;
		this.storeAddress = storeAddress;
		this.customerAddress = customerAddress;
		this.priceOfAnother = priceOfAnother;
		this.anotherCompanyName = anotherCompanyName;
		this.secondCustomerNumber = secondCustomerNumber;
		this.gstOfSecond = gstOfSecond;
		this.totalPrice = totalPrice;

	}
	
	
	@Override
	
	public String toString() {
		
		System.out.println("this is string representation");
		
		return "[price==="+price +",  companyName==="+companyName +",  customerNumber==="+customerNumber+",  ownerNumber==="+ownerNumber+","
				+ "  gst==="+gst+",  storeName==="+storeName+", customerName==="+customerName+", ownerName==="+ownerName+", storeAddress==="
		        +storeAddress+", customerAddress==="+customerAddress+", priceOfAnother==="+priceOfAnother+", anotherCompanyName==="+anotherCompanyName+
				", secondCustomerNumber==="+secondCustomerNumber+", gstOfSecond==="+gstOfSecond+", totalPrice==="+totalPrice+"]";
	}
	
	
	@Override
	
	public boolean equals(Object obj) {
		
		System.out.println("this is equals method");
		
		if(this==obj) {
			return true;
		}
		
		if(obj==null) {
			return false;
		}
		
		if(this.getClass()!=obj.getClass()) {
			return false;
		}
		
		if(!(this instanceof Object)) {
			return false;
		}
		
		Akki rice = (Akki) obj;
		
		return this.price==rice.price && this.companyName.equals(rice.companyName) && this.customerNumber==rice.customerNumber 
				&& this.ownerNumber==rice.ownerNumber && this.gst==rice.gst && this.storeName.equals(rice.storeName)
				 && this.customerName.equals(rice.customerName) && this.ownerName.equals(rice.ownerName)
				 && this.storeAddress.equals(rice.storeAddress) && this.customerAddress.equals(rice.customerAddress)
				 && this.priceOfAnother==rice.priceOfAnother && this.anotherCompanyName.equals(rice.anotherCompanyName)
				 && this.secondCustomerNumber==rice.secondCustomerNumber && this.gstOfSecond==rice.gstOfSecond
				 && this.totalPrice==rice.totalPrice;
				 
				 
	}
	
	@Override
	
	public int hashCode() {
		
		System.out.println("this is hash code method");
		
		final int prime=27;
		int result=1;
		
		result=result*prime+price;                      
		result=result*prime+companyName.hashCode();
		result=(int) (result*prime+customerNumber);
		result=(int) (result*prime+ownerNumber);
		result=(int) (result*prime+gst);
		result=result*prime+storeName.hashCode();
		result=result*prime+customerName.hashCode();
		result=result*prime+ownerName.hashCode();
		result=result*prime+storeAddress.hashCode();
		result=result*prime+customerAddress.hashCode();
		result=result*prime+priceOfAnother;
		result=result*prime+anotherCompanyName.hashCode();
		result=(int) (result*prime+secondCustomerNumber);
		result=(int) (result*prime+gstOfSecond);
		result=result*prime+totalPrice;
		
		
		return result;
	}
	
	
	
}
