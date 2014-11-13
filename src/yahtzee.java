import java.util.Scanner;
import java.util.Random;

public class yahtzee {
	private static final Random randomNumber = new Random();
	private static final Scanner input = new Scanner(System.in);
	public static int s1, s2, s3, s4, s5;
	public static int rollPerTurn;
	private static int[] dice = new int[5];

	private static final int ID_PLAY = 1;
	private static final int ID_HELP = 2;
	private static final int ID_QUIT = 3;

	public static void main (String[] args){
		
		while (true){
			System.out.println("_______Menu______");
			System.out.println("1. Play Yahtzee");
			System.out.println("2. Help");
			System.out.println("3. Quit");
			System.out.println("__________________");
			int selection = input.nextInt();
			
			switch ( selection ){
			case ID_PLAY:
				firstRoll();
				break;
			case 2:
				yahtzeeHelp();
				break;
			case 3:
				exit();
				break;
			default:
				System.out.println("No such selection");
			}
			
		
		while (rollPerTurn < 3){
			System.out.println();
			s1 = input.nextInt();
			s2 = input.nextInt();
			s3 = input.nextInt();
			s4 = input.nextInt();
			s5 = input.nextInt();
			reRoll();
		}
		}
	}
	public static int firstRoll() {
		
		for (int i = 0; i < dice.length; i++) {
			dice[i] = rollDice();
		}
		
		System.out.println("Select which dice to reroll.");
		for (int a = 0; a < dice.length; a++) {
			System.out.print(dice[a] + " ");
		}
		
		rollPerTurn = 1;
		return rollPerTurn;
	
	}

	public static int[] reRoll() {
		
		if (s1 == 1) {
			dice[0] = rollDice();
		}
		if (s2 == 1) {
			dice[1] = rollDice();
		}
		if (s3 == 1) {
			dice[2] = rollDice();
		}
		if (s4 == 1) {
			dice[3] = rollDice();
		}
		if (s5 == 1) {
			dice[4] = rollDice();
		}
		rollPerTurn++;
		for (int b = 0; b < dice.length; b++) {
			System.out.print(dice[b] + " ");
		}
		return dice;
	}

	public static int rollDice() {
		int die = 1 + randomNumber.nextInt(6);
		return die;
	}
	/*public int sortForStraight( int[] diceArray){
		int straightCount = 1;
		for( int i = 1; i < diceArray.length; i++){
			if ( (diceArray[i-1]+1) == diceArray[i]){
				straightCount++;
			}
			return straightCount;
		}
		public String[] scoreSmallStraight( int straightCount){
			if(straightCount >3){
				total = SMALL_STRAIGHT;
			}
			else{
				total = 0;
			}
			String stringtotal = String.valueOf(total);
			score[10] = stringtotal;
			return score;
		}
		public String[] scoreLargeStraight( int straightCount){
			if(straightCount >4){
				total = LARGE_STRAIGHT;
			}
			else{
				total = 0;
			}
			String stringtotal = String.valueOf(total);
			score[11] = stringtotal;
			return score;
		}
	}*/
	

	public static void yahtzeeHelp() {
		while (true){	
		System.out.println("Your dice will show up and you will input a 1 or a 0");
		System.out.println("under each die. A 1 indicates you wish to re-roll");
		System.out.println("that particular die, and a 0 means you wish to keep it.");
		System.out.println("1. Go back");
		System.out.println("2. Quit");
		int selection = input.nextInt();
		switch ( selection ){
		case 1:
		//	main();
			break;
		case 2:
			System.exit(1);
			break;
		default:
			System.out.println("No such selection");
	}}}
	
	//public static void restart(){
	//	Restart();
	//}
	public static void exit() {
		System.exit(0);
	}
	public static void errorexit(){
		System.exit(1);
	}
	}
