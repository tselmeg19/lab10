package lab10;

public class PersonApp {
	public static void main(String[] args) {
		Address myAddress = new Address("Main Street 123", 87731, "Greenville","UT");
		
		Person myPerson = new Person("Tara", "Jhonson", myAddress);
		
		System.out.println(myPerson);
		System.out.println();
		System.out.println("Modify local variable myAddress: ");
//myAddress.setCity("Moab");
//myAddress.setZip(84532);
		myAddress = new Address("Main Setreet 123", 84532, "Moab", "UT");
		
		System.out.println(myAddress);
		System.out.println(myPerson);
	}

}
