
public class Person {
	
	public String name;
	public int age;
	private String jobTitle;
	
	public Person() {
		
	}
	
	public void getInfo(String n, int a, String j){
		this.name = n;
		this.age = a;
		this.jobTitle = j;
	}
	
	public String personalInfo() {
		String output = String.format("Personal Information: %s, %d, %s", name, age, jobTitle );
		return output;
	}
	
}