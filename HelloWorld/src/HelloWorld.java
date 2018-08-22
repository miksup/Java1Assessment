
public class HelloWorld {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		
		String message = gimmeMsg();
		System.out.println(message);
		
		printMsg(message);
		
		int ex = 7;
		int why = 8;
		boolean biggerOrNah = ex < why;
		
		for (int i = 0; i < 10; i++) {
			int newInt = gimmeInt(ex, why, biggerOrNah);
			System.out.println(newInt);		
		}	
		
		System.out.println("?????????????????????????????????????");
		
		int[] array1 = {0,2,54,42,12,45,76,8,9,60};
		for (int j = 0; j < array1.length - 1; j++) {
			int intNew = gimmeInt(array1[j],array1[j+1], biggerOrNah);
			System.out.println(intNew);
		}
		
		System.out.println("?????????????????????????????????????");
		
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		System.out.println("?????????????????????????????????????");
		
		int[] blank = new int[10];
		for(int i = 0; i < blank.length; i++) {
			int j = i + (1+i);
			blank[i] = j;
			System.out.println(blank[i]);
		}
		
		System.out.println("????????????????????????????????????");

		int[] newArr = new int[10];		
		newArr = arrayMultiplied(blank);
	}

		
	public static void printMsg(String s) {
		System.out.println(s);
	}
	
	public static String gimmeMsg() {
		String msg = "Hello World!";
		return msg;
	}
	
		
	public static int gimmeInt(int x, int y, boolean t) {
		if (x > 0 && y > 0) {
		int sum = x + y;
		return sum;
		} else if (x == 0) {
			return y;
		}  else {
			return 1;
		}
	}
	
	public static int[] arrayMultiplied(int[] x) {
		int[] newArr = new int[x.length];
		for(int i = 0; i < x.length; i++) {
			newArr[i] = x[i]*10;
			System.out.println(newArr[i]);
		}
		return newArr;
	}
}
