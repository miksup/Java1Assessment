import java.util.ArrayList;

public class Doggo {
	public static void main(String[] args) {
	
		System.out.println(place(4));
	}
	

	public static ArrayList<String> place(int i) {
				
		ArrayList<String> places = new ArrayList<String>();
		
		
		for (int l = 1; l < 101; l++) {
			
			String x = ""+l;
			
			
			switch(x) {
			 case "1":
				 x = x + "st";
				 break;
			 case "21":
				 x = x + "st";
				 break;
			 case "31":
				 x = x + "st";
				 break;
			 case "41":
				 x = x + "st";
				 break;
			 case "51":
				 x = x + "st";
				 break;
			 case "61":
				 x = x + "st";
				 break;
			 case "71":
				 x = x + "st";
				 break;
			 case "81":
				 x = x + "st";
				 break;
			 case "91":
				 x = x + "st";
				 break;
			 case "2":
				 x = x + "nd";
				 break;
			 case "22":
				 x = x + "nd";
				 break;
			 case "32":
				 x = x + "nd";
				 break;
			 case "42":
				 x = x + "nd";
				 break;
			 case "52":
				 x = x + "nd";
				 break;
			 case "62":
				 x = x + "nd";
				 break;
			 case "72":
				 x = x + "nd";
				 break;
			 case "82":
				 x = x + "nd";
				 break;
			 case "92":
				 x = x + "nd";
				 break;
			 case "3":
				 x = x + "rd";
				 break;
			 case "23":
				 x = x + "rd";
				 break;
			 case "33":
				 x = x + "rd";
				 break;
			 case "43":
				 x = x + "rd";
				 break;
			 case "53":
				 x = x + "rd";
				 break;
			 case "63":
				 x = x + "rd";
				 break;
			 case "73":
				 x = x + "rd";
				 break;
			 case "83":
				 x = x + "rd";
				 break;
			 case "93":
				 x = x + "rd";
				 break;
			default:
				x = x + "th";
				break;
			}
			
			
			
			if (l != i) {
				
				places.add(x);
				
			}
		
		}
		
		

		return places;
	}
	
}