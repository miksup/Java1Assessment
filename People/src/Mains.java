
public class Mains {

	public static void main(String[] args) {
		Person a = new Person();
		a.getInfo("gary", 35, "accountant");
		
		Person b = new Person();
		b.getInfo("percy", 12, "playmate");
		//System.out.println((b.personalInfo());
		
		Person[] array1 = {a,b}; // would be better to use Array List
		
		for (Person i : array1) {
			System.out.println(i.personalInfo());
		}
		
		String searchResult = search("percy", array1).name;
		
		if (searchResult != null) {
		System.out.println(searchResult + " is a real person");
		}
		
	}
	
	public static Person search(String name, Person[] l) {
		Person ret = new Person();
		
		for (Person i : l) {
			if (name == i.name) {
				ret = i;
			} 
		}
		
		return ret;
	}
	
}
