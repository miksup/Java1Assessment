
public class ReverseFactorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseFactorial(120));
	}

	public static String reverseFactorial(int a) {
		int b = 2;
		int result = a;

		while (result%b==0) {
				result = result / b;
				b++;
			}

	if(result==1)

	{
		b = b-1;
		return Integer.toString(b) + "!";
	}else
	{
		return "NONE";
	}

}

}
