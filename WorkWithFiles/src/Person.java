
public class Person {

	private String name;
	private String occupation;
	private int age;

	
	public Person(String name, String occup, int age) {
		this.name = name;
		this.occupation = occup;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
	
	public String getAll() {
		String name = this.name;
		String occup = this.occupation;
		String age = Integer.toString(this.age);
		
		return name + ", " + occup + ", " + age;
	}
	
}
