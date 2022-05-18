package p244;

public class Person {
	final String nation = "Korea"; // MASK-ROM
	final String ssn; // P-ROM
	String name; // EEP-ROM, EP-ROM
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
