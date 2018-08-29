import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;


public class Runner {

	public static void main(String[] args) throws IOException {
		
		///////////////////////////////////////////////////////////////DATA
		
		ArrayList<Person> peopleDem = new ArrayList<Person>();
		
		Person adam = new Person("Adam", "Poet", 23);
		Person brenda = new Person("Brenda", "Painter", 33);
		Person clive = new Person("Clive", "Plumber", 23);
		Person deloris = new Person("Deloris", "Pediatrician", 43);
		Person earl = new Person("Earl", "Pensioner", 73);
		
		peopleDem.add(adam);
		peopleDem.add(earl);
		peopleDem.add(deloris);
		peopleDem.add(clive);
		peopleDem.add(brenda);
		
		///////////////////////////////////////////////////////////////WRITE
		
		String fileContents = "";
		//Filer newFile = new Filer();

		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Admin\\Desktop\\eclipse-workspace\\WorkWithFiles\\people.txt"));
		

		int lineNum = 0;
		for (Person p : peopleDem) {
			
			fileContents = p.getAll();
			bw.write(fileContents + "/");
			//bw.newLine();
			lineNum++;
			System.out.println("Details from object " + lineNum + " added to file");
			
		}
		
		bw.close();
		//newFile.writer(fileContents);
		
		
		//////////////////////////////////////////////////////////////READ

		ArrayList<String> personsDem = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\Admin\\\\Desktop\\\\eclipse-workspace\\\\WorkWithFiles\\\\people.txt"));
		String line;
		
		while ((line = br.readLine()) != null) {
			
			String[] parts = line.split("/");
			
				for (int x = 0; x < parts.length; x++) {
					
					personsDem.add(parts[x]);
					System.out.println("Details of person " + x + " added to array from file");
				
			}
			//lineNum++;
			//System.out.println("Line " + lineNum + " added from file to array");
		}
		
		br.close();
		System.out.println("");
		
		for (String l : personsDem) {
			
			System.out.println(l);
			
		}
		
	}

}
