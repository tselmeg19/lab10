package lab10;

public class Address {
	private String street;
	private int zip;
	private String city;
	private String state;
		
	public Address (String street, int zip, String city, String state ) {
		this.street = street;
		this.zip = zip;
		this.city = city;
		this.state = state;
	}

//	public void seStreet (String street) {
//		this.street = street;
//	}
	
	public String getStreet() {
		return street;
	}
	
//	public void setZip(int zip) {
//		this.zip = zip;
//	}
	
	public int getZip() {
		return zip;
	}
	
//	public void setCity(String city) {
//		this.city = city;
//	}
	
	public String getCity() {
		return city;
	}
	
//	public void setState(String state) {
//		this.state = state;
//	}
	
	public String getState() {
		return state;
	}
	
	@Override
	public String toString() {
		return street + " " + city + " " + state + " " + zip;
	}

}
