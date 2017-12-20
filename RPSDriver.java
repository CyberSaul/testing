import java.util.Scanner;
import java.util.Random;

public class RPSDriver {

	public static void main(String[] args) {
		Random random = new Random();
		boolean gameOver = false;
		HandSigns playerMove = HandSigns.ROCK;
		HandSigns computerMove;
		int numTrials = 0, comWon = 0, playerWon = 0, tie = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Rock! Paper! Scissor! SHOOT! ");
		boolean validInput;
		
		while(!(gameOver)) {
			
			//Player move
			do {
				System.out.println("Enter r for Rock, p for Paper,"
						+ "\ns for Scissor.");
				System.out.println("Enter q to Quit.");
				char inChar = input.next().toLowerCase().charAt(0);
				validInput = true;
				
				switch(inChar) {
				case 'q':
					gameOver = true;
					break;
				case 'r':
					playerMove = HandSigns.ROCK;
					break;
				case 'p':
					playerMove = HandSigns.PAPER;
					break;
				case 's':
					playerMove = HandSigns.SCISSOR;
					break;
				default:
					System.out.println("Invalid input please try again...");
					validInput = false;
				}	//end switch
				
				
			}while(!(validInput));
			
			//Computer decision
			if(!(gameOver)) {
				int ranNumGen = random.nextInt(3);	// random int between 0 (inclusive) and 3 (exclusive)
				
				if(ranNumGen == 2) {
					computerMove = HandSigns.SCISSOR;
					System.out.println("T-1000 chose SCIZZORS!");
				} else if(ranNumGen == 1) {
					computerMove = HandSigns.PAPER;
					System.out.println("T-1000 chose PAPER!");
				} else {
					computerMove = HandSigns.ROCK;
					System.out.println("T-1000 chose ROCKS!");
				}
				
				if(computerMove == playerMove) {
					++tie;
				} else if((computerMove == HandSigns.ROCK) &&(playerMove == HandSigns.SCISSOR)) {
					++comWon;
				} else if((computerMove == HandSigns.PAPER) &&(playerMove == HandSigns.ROCK)) {
					++comWon;
				} else if((computerMove == HandSigns.SCISSOR) &&(playerMove == HandSigns.PAPER)) {
					++comWon;
				} else {
					++playerWon;
				}
				
				++numTrials;
			}	//end if
			
		}	//end while
		
		// Print statistics
		System.out.printf("%nNumber of trials: " + numTrials);
		System.out.printf("\nI won %d(%.2f%%). You won %d(%.2f%%).%n", comWon, 
				100.0*comWon/numTrials, playerWon, 100.0*playerWon/numTrials);
		System.out.println("Bye! ");
	}	//end main

}	//end RPSDriver
