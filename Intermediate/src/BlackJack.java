
public class BlackJack {

	public static void main(String[] args) {
		System.out.println(dealer(22,22));
	}
	
	public static int dealer(int x, int y) {
		if ((x == 0 || y == 0) || (x > 21 && y > 21)) {
			return 0;
		}
		else if ((21 - x < 21 - y) && (x <= 21) || ((21 - y) < 0)){
			return x;
		}
		else if ((21 - y < 21 - x) && (y <= 21) || ((21 - x) < 0)){
			return y;
		}
		else {
			return 0;
		}
	}

}
