//import java.util.ArrayList;

public class Player {
	
	private double[][] loc = {{0},{0}};
	private double dist = -1;
	
	public Player() {
		
	}
	
	public Player(double x, double y, double dist) {
		
		loc[0][0] = x;
		loc[1][0] = y;
		this.dist = dist;
		
	}
	
	///////////////////////////////////////////////////////////////
	
	public double magicCompass(Box box) {
			
		
		double x = 0; // distance X
		double y = 0; // distance Y
		
		double xB = box.getX();
		double yB = box.getY();
		
		//set distance x
		if (this.loc[0][0] != xB) {
			x = this.loc[0][0] - xB;
		} 
			
		//set distance y
		if (this.loc[1][0] != yB) {
			y = this.loc[1][0] - yB;
		}
		
		
		//set hyp distance
		this.dist = Math.sqrt((x*x) + (y*y));
	
		System.out.println("distance: " + this.dist + "\n");	//testing
		
		if (this.dist == 0) {
			System.out.println("You found a box! You win! \n");
		}
		
		return this.dist;
	}
	
	///////////////////////////////////////////////////////////////////////
	//MAKING MOVES///////////////////////////////Could include characters to make player jump 10 steps
	
	public double[][] makeMove(String dir) {
		
		//System.out.println("The dial reads " + this.dist + "m");
		double y = 0;
		double x = 0;
		double[][] xNy = this.loc;
		
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
		
		this.loc = xNy;
		
		System.out.println("x: " + loc[0][0]);
		System.out.println("y: " + loc[1][0] + "\n");
		
		return this.loc;
	}

	//////////////////////////////////////////////////////////////////////
	//GETTERS & SETTERS/////////////////////////

	public double getDist() {
		double dist = this.dist;
		
		return dist;	
	}

	public void setLoc(double[][] loc) {
		this.loc = loc;
	}

	public double[][] getLoc() {
		double[][] loc = this.loc;
		
		return loc;
	}
	
}
