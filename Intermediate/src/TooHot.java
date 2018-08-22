
public class TooHot {

	public static void main(String[] args) {
		int temp = 60;
		boolean isSummer = true;
		
		System.out.println(climate(temp, isSummer));
	}
	
	public static boolean climate(int temp, boolean isSummer) {
		if ((temp >= 60 && temp <= 100) && (isSummer)) {
			return true;
		} else if ((temp >= 60 && temp <= 90) && (!isSummer)) {
			return true;
		} else {
			return false;
		}
	}
}
