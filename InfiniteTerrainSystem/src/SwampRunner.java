

public class SwampRunner {


	public static void main(String[] args) {
		
		//can use scanner here + equation in box to generate new location
		double x = 1;
		double y = 1;
		
		Player p1 = new Player();
		Box b1 = new Box(x, y);
		Swamp s = new Swamp(p1, b1);

		///////////Logical Progression////////////
		
//		p1.magicCompass(b1);
//		p1.makeMove("N");
//		System.out.println("box location: " + (b1.getX()) + "," + (b1.getY()) + "\n");

//		p1.magicCompass(b1);
//		p1.makeMove("E");
//		System.out.println("box location: " + (b1.getX()) + "," + (b1.getY()) + "\n");
//		p1.magicCompass(b1);
		
		//////////////SwampClass///////////////
		
		s.play();
	}
		/////////////////////////////////////////////
	
//		for(int i = 0; i < 1; i++) {
//			if (p1.getDist() != 0) {
//				
//				String cmd = s.nextLine();
//				p1.makeMove(cmd);
//				p1.magicCompass(b1);
//				i--;
//				
//			} else {
//			
//				i++;
//			
//		}
//		}
		
		////////////////////////////////////////////
		
//		do {	
			
//			String cmd = s.next();
//			p1.makeMove(cmd);
//			p1.magicCompass(b1);
			
//		} while(p1.getDist() != 0);
		
		
		
//		System.out.println("default: " + p1.getX() + ", " + p1.getY());
//		p1.magicCompass(b1);
//		p1.makeMove("N");
//		System.out.println("box location: " + (b1.getX()) + "," + (b1.getY()) + "\n");
//		//System.out.println(p1.getX());
//		p1.magicCompass(b1);
//		p1.makeMove("E");
//		System.out.println("box location: " + (b1.getX()) + "," + (b1.getY()) + "\n");
//		p1.magicCompass(b1);
		//p1.makeMove("S");
		//p1.magicCompass(b1);
		
		


}
