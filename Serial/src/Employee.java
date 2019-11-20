import java.io.Serializable;

//Class must be serializable

public class Employee implements Serializable  {
	
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Employee(String firstName, String lastName, int birthYear) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	
	public Employee()
	{
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	
	
}
