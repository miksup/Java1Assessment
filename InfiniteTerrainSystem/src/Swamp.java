import java.util.Scanner;

public class Swamp {
	
	private Player p;
	private Box b;
	private static Scanner s = new Scanner(System.in);
	private double[][] xNy;
	
	public Swamp(Player p, Box b) {
		this.p = p;
		this.b = b;
		this.xNy = p.getLoc();
	}
	
public double[][] makeMove(String dir) {
		
		//System.out.println("The dial reads " + this.dist + "m");
		double y = 0;
		double x = 0;
		
		if ((dir == "north") || (dir == "North") || (dir == "N")) {
			y++;
			xNy[1][0] = y;
		} else if ((dir == "south") || (dir == "South") || (dir == "S")) {
			y--;
			xNy[1][0] = y;
		} else if ((dir == "east") || (dir == "East") || (dir == "E")) {
			x++;
			xNy[0][0] = x;
		} else if ((dir == "west") || (dir == "West") || (dir == "W")) {
			x--;
			xNy[0][0] = x;
		} 
		
		
		System.out.println("x: " + xNy[0][0]);
		System.out.println("y: " + xNy[1][0] + "\n");
		p.setLoc(xNy);
		return xNy;
	}
	
	public void play() {
		double dist = p.magicCompass(b);
		
		do {
			
			String cmd = s.nextLine();
			this.xNy = makeMove(cmd);
			dist = p.magicCompass(b);
			
		} while (dist != 0);
	}
		
}
