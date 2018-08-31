import java.util.Random;

public class Box {
	private double x;
	private double y;
	
	public Box() {
		Random r = new Random();
		
		this.x = r.nextInt(20) + 1;
		this.y = r.nextInt(20) + 1;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	
}
