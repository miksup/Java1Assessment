import java.util.ArrayList;

public class Wizard {
	
	private int roomSizeInM2;
	private ArrayList<Paint> paintCatalog = new ArrayList<Paint>();
	
	public Wizard(int roomSize, ArrayList<Paint> catalog) {
		this.roomSizeInM2 = roomSize;
		this.paintCatalog = catalog;
	}
	
	public String leastWasteful() {
		
		String leastWasteful = "";
		int currentBest = 10000;
		
		for (Paint p : paintCatalog) {
			
			int ratio = roomSizeInM2/p.getCover();
			
			if (ratio < currentBest) {
				
				currentBest = ratio;
				leastWasteful = p.getName();
			} 
		}
		
		return "Least wasteful = "+leastWasteful;
	}
	
	public String cheapestPerLitre() {
		String cheapest = "";
		double currentBest = 1000;
		
		for (Paint p : paintCatalog) {
			double ratio = p.getPrice()/p.getVol();
			
			if (ratio < currentBest) {
				
				currentBest = ratio;
				cheapest = p.getName();
				
			}
			
		}
		
		return "Cheapest per Litre = " + cheapest;
	}
}
