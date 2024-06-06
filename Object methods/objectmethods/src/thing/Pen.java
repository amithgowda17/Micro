package thing;

public class Pen {

	public int price;
	public String ownerName;
	public String customerName;
	public int noOfPens;
	public String address;
	public int priceOfSecond;
	public String ownerNameSecond;
	public String customerNameSecond;
	public int noOfPensSecond;
	public String addressOfSecond;
	public int priceOfThird;
	public String ownerNameThird;
	public String customerNameThird;
	public int noOfPensThird;
	public String addressOfThird;

	public void setDetails1(int price) {
		this.price = price;

	}

	public void setDetails2(String ownerName) {
		this.ownerName = ownerName;

	}

	public void setDetails3(String customerName) {
		this.customerName = customerName;

	}

	public void setDetails4(int noOfPens) {
		this.noOfPens = noOfPens;

	}

	public void setDetails5(String address) {
		this.address = address;

	}

	public void setDetails6(int priceOfSecond) {
		this.priceOfSecond = priceOfSecond;

	}

	public void setDetails7(String ownerNameSecond) {
		this.ownerNameSecond = ownerNameSecond;

	}

	public void setDetails8(String customerNameSecond) {
		this.customerNameSecond = customerNameSecond;

	}

	public void setDetails9(int noOfPensSecond) {
		this.noOfPensSecond = noOfPensSecond;

	}

	public void setDetails10(String addressOfSecond) {
		this.addressOfSecond = addressOfSecond;

	}

	public void setDetails11(int priceOfThird) {
		this.priceOfThird = priceOfThird;

	}

	public void setDetails12(String ownerNameThird) {
		this.ownerNameThird = ownerNameThird;

	}

	public void setDetails13(String customerNameThird) {
		this.customerNameThird = customerNameThird;

	}

	public void setDetails14(int noOfPensThird) {
		this.noOfPensThird = noOfPensThird;

	}

	public void setDetails15(String addressOfThird) {
		this.addressOfThird = addressOfThird;

	}

	public int getDetails1() {
		return price;
	}

	public String getDetails2() {
		return ownerName;
	}

	public String getDetails3() {
		return customerName;
	}

	public int getDetails4() {
		return noOfPens;
	}

	public String getDetails5() {
		return address;
	}

	public int getDetails6() {
		return priceOfSecond;
	}

	public String getDetails7() {
		return ownerNameSecond;
	}

	public String getDetails8() {
		return customerNameSecond;
	}

	public int getDetails9() {
		return noOfPensSecond;
	}

	public String getDetails10() {
		return addressOfSecond;
	}

	public int getDetails11() {
		return priceOfThird;
	}

	public String getDetails12() {
		return ownerNameThird;
	}

	public String getDetails13() {
		return customerNameThird;
	}

	public int getDetails14() {
		return noOfPensThird;
	}

	public String getDetails15() {
		return addressOfThird;
	}

	public Pen(int price, String ownerName, String customerName, int noOfPens, String address, int priceOfSecond,
			String ownerNameSecond) {

		this.price = price;
		this.ownerName = ownerName;
		this.customerName = customerName;
		this.noOfPens = noOfPens;
		this.address = address;
		this.priceOfSecond = priceOfSecond;
		this.ownerNameSecond = ownerNameSecond;
	}

	public Pen(String customerNameSecond, int noOfPensSecond, String addressOfSecond, int priceOfThird,
			String ownerNameThird, String customerNameThird, int noOfPensThird, String addressOfThird) {

		this.customerNameSecond = customerNameSecond;
		this.noOfPensSecond = noOfPensSecond;
		this.addressOfSecond = addressOfSecond;
		this.priceOfThird = priceOfThird;
		this.ownerNameThird = ownerNameThird;
		this.customerNameThird = customerNameThird;
		this.noOfPensThird = noOfPensThird;
		this.addressOfThird = addressOfThird;

	}

	@Override

	public String toString() {

		System.out.println("this is string representation");

		return "[price===" + price + ", ownerName===" + ownerName + ", customerName===" + customerName + ", noOfPens==="
				+ noOfPens + ",address===" + address + ", priceOfSecond===" + priceOfSecond + ", ownerNameSecond==="
				+ ownerNameSecond + ", customerNameSecond===" + customerNameSecond + ", noOfPensSecond==="
				+ noOfPensSecond + ", addressOfSecond===" + addressOfSecond + ", priceOfThird===" + priceOfThird
				+ ", ownerNameThird===" + ownerNameThird + ", customerNameThird===" + customerNameThird
				+ ", noOfPensThird===" + noOfPensThird + ", addressOfThird===" + addressOfThird + "]";
	}

	@Override

	public boolean equals(Object obj) {

		System.out.println("this is equals method");

		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (this.getClass() != obj.getClass()) {
			return false;
		}

		if (!(this instanceof Object)) {
			return false;
		}

		Pen pen = (Pen) obj;

		return this.price == pen.price && this.ownerName.equals(pen.ownerName)
				&& this.customerName.equals(pen.customerName) && this.noOfPens == pen.noOfPens
				&& this.address.equals(pen.address) && this.priceOfSecond == pen.priceOfSecond
				&& this.ownerNameSecond.equals(pen.ownerNameSecond)
				&& this.customerNameSecond.equals(pen.customerNameSecond) && this.noOfPensSecond == pen.noOfPensSecond
				&& this.addressOfSecond.equals(pen.addressOfSecond) && this.priceOfThird == pen.priceOfThird
				&& this.ownerNameThird.equals(pen.ownerNameThird)
				&& this.customerNameThird.equals(pen.customerNameThird) && this.noOfPensThird == pen.noOfPensThird
				&& this.addressOfThird.equals(pen.addressOfThird);

	}

	@Override
	
	public int hashCode() {
		
		final int prime=29;
		int results=1;
		
		results=results*prime+price;
		results=results*prime+ownerName.hashCode();
		results=results*prime+customerName.hashCode();
		results=results*prime+noOfPens;
		results=results*prime+address.hashCode();
		results=results*prime+priceOfSecond;
		results=results*prime+ownerNameSecond.hashCode();
		results=results*prime+customerNameSecond.hashCode();
		results=results*prime+noOfPensSecond;
		results=results*prime+addressOfSecond.hashCode();
		results=results*prime+priceOfThird;
		results=results*prime+ownerNameThird.hashCode();
		results=results*prime+customerNameThird.hashCode();
		results=results*prime+noOfPensThird;
		results=results*prime+addressOfThird.hashCode();
				
		return results;
		
		
	}

}
