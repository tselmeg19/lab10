package lab10;

public class Person {
	private String firstName;
	private String lastName;
	private Address address;
	public Person(String fName, String LName, Address a) {
		this.firstName = fName;
		this.lastName = LName;
		this.address= a;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setAddress(Address a) {
		this.address = a;
	}
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return firstName + " " + lastName + " " + address.toString();
	}
	

}
