import java.util.Random;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		float winCountCPU = 0;
		float winCountPlayer = 0;
		float drawCount = 0;
		float currentMost = 0;
		
		String[] move= {"Rock","Lizard","Spock","Scissors","Paper","Stop","Invalid Input"};
		boolean a = true;
		
		Scanner sc = new Scanner(System.in);

		float[] moveCounter = {0,0,0,0,0,0,0};
		
		while (a) {
			System.out.println("Make a move..");
			
			int position = 6;
			String playerMove = sc.nextLine();
			String mostUsed = "";
			
			Random rand = new Random();
			int n = rand.nextInt(5);
			
			float totalGames = drawCount + winCountCPU + winCountPlayer;
			
			for (int i = 0 ; i < move.length; i++) {
				if (playerMove.equals(move[i])) {
					position = i;
					moveCounter[i] = moveCounter[i] +1;
				}
				if (i<5) {
					System.out.println(moveCounter[i]);
					if (moveCounter[i] > currentMost) {
						mostUsed = move[i];
					}
				}
			}
		
			System.out.println("You went " + move[position] + " And the Computer went " + move[n]);
			
			if (position == n) {
				System.out.println("Roll again!");
				drawCount++;
			}
			else if ((position == ((n-1)%5 + 5)%5) || (position == ((n+2)%5 + 5)%5)) {
				System.out.println("Player Wins!");
				winCountPlayer++;
			}
			else if ((position == ((n+1)%5 + 5)%5) || (position == ((n-2)%5 + 5)%5)) {
				System.out.println("CPU Wins!");
				winCountCPU++;
			}
			else if ((position == 5)){
				System.out.println("The system will close"
						+ "\nTotal Games Played: " + totalGames
						+ "\nComputer Wins: " + winCountCPU + " " + ((winCountCPU/totalGames)*100) + "%"
						+ "\nPlayer Wins: " + winCountPlayer + " " + ((winCountPlayer/totalGames)*100) + "%"
						+ "\nDraws: " + drawCount + " " + ((drawCount/totalGames)*100) + "%"
						+ "\nMost Used Weapon: " + (mostUsed));
				a = false;
			}
		}
	}
}
