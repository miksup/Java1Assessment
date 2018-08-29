import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Filer {
	
	private BufferedWriter bw = null;
	private FileWriter fw = null;
	
	public void writer(String fileContents) {
		try {
			
			fw = new FileWriter("C:\\Users\\Admin\\Desktop\\eclipse-workspace\\WorkWithFiles\\people.txt");
			bw = new BufferedWriter(fw);
			bw.write(fileContents);
			bw.newLine();
			System.out.println("done");
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			try {
				
				if (bw != null) {
					bw.close();
				}
				
				if (fw != null) {
					fw.close();
				}
				
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
}
