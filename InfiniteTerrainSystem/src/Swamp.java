import java.util.Scanner;

public class Swamp {
	
	private Player p;
	private Box b;
	private static Scanner s = new Scanner(System.in);
	private double[][] xNy;
	double y = 0;
	double x = 0;
	
	public Swamp(Player p, Box b) {
		this.p = p;
		this.b = b;
		this.xNy = p.getLoc();
	}
	
	public double[][] makeMove(String dir) {
		
		//System.out.println("The dial reads " + this.dist + "m");
		double y = this.y;
		double x = this.x;
		
//		if ((dir.equals("north")) || (dir == "North") || (dir == "N")) {
//			y++;
//			xNy[1][0] = y;
//		} else if ((dir == "south") || (dir == "South") || (dir == "S")) {
//			y--;
//			xNy[1][0] = y;
//		} else if ((dir.equals("east")) || (dir == "East") || (dir == "E")) {
//			x++;
//			xNy[0][0] = x;
//		} else if ((dir == "west") || (dir == "West") || (dir == "W")) {
//			x--;
//			xNy[0][0] = x;
//		} 
		
		switch(dir) {
			case("north"):
			case("North"):
			case("N"):
				y++;
				xNy[1][0] = y;
				break;
			case("south"):
			case("South"):
			case("S"):
				y--;
				xNy[1][0] = y;
				break;
			case("east"):
			case("East"):
			case("E"):
				x++;
				xNy[0][0] = x;
				break;
			case("west"):
			case("West"):
			case("W"):
				x--;
				xNy[0][0] = x;
				break;
			default:
				System.out.println("Try another Direction");
				break;
		}
		
		
		System.out.println("x: " + xNy[0][0]);
		System.out.println("y: " + xNy[1][0] + "\n");
		this.y = y;
		this.x = x;
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
