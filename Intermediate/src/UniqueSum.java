
public class UniqueSum {
	public static void main(String[] args) {
		int x = sum(3,1,3);
		System.out.println(x);
	}
	
	public static int sum(int x, int y, int z) {
		if ((x == y) && (y == z)) {
			return 0;
		} else if (x == y) {
			return z;
		} else if (x == z) {
			return y;			
		} else if (y == z) {
			return x;
		} else {
			int w = x + y + z;
			return w;
		}
	}
}
