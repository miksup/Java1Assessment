import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		
		Paint CheapoMax = new Paint("CheapMax", 19.99, 20, 10);
		CheapoMax.setName("CheapoMax");
		Paint AverageJoes = new Paint("AverageJoes", 17.99, 15, 11);
		Paint DP = new Paint("DuluxourousPaints", 25, 10, 20);
		
		ArrayList<Paint> paintCatalog = new ArrayList<Paint>();
		paintCatalog.add(CheapoMax);
		paintCatalog.add(AverageJoes);
		paintCatalog.add(DP);
		
		System.out.println(paintCatalog.get(1).getName());
		
		Wizard wiz = new Wizard(200, paintCatalog);
		
		System.out.println(wiz.leastWasteful());
		System.out.println(wiz.cheapestPerLitre());
		
	}
}
