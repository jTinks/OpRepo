import java.util.Random;
import java.util.Scanner;


public class CoinFlip {
	
	public static void main(String[] args){
		
		int numberHeads = 0;
		int numberTails = 0;
		
		System.out.println("Type 'flip' to flip a coin!");
		
		
		Scanner keyboard = new Scanner(System.in);
		String answerString = keyboard.next();
		
		if (answerString.equalsIgnoreCase("flip")){
			
			String result = flipCoin();
			
			System.out.println("\nThe coin landed " + result + "!");
			
			if (result.equalsIgnoreCase("heads")){
				numberHeads++;
			} else {
				numberTails++;
			}
				
		} else {
			System.out.println("\nInvalid entry. Closing application.");
			System.exit(0);
		}
		
		
		System.out.println("\nWould you like to flip again? y/n");
		answerString = keyboard.next();
		
		while (answerString.equalsIgnoreCase("y")){
			String result = flipCoin();
			System.out.println("\nThe coin landed " + result + "!");
			
			if (result.equalsIgnoreCase("heads")){
				numberHeads++;
			} else {
				numberTails++;
			}
			
			System.out.println("\nWould you like to flip again? y/n");
			answerString = keyboard.next();
		}
		
		keyboard.close();
		
		System.out.print("\nThanks for playing! You flipped ");
		System.out.print(numberHeads);
		System.out.print(" Heads and ");
		System.out.print(numberTails);
		System.out.print(" Tails!");
		
		
		
	}
	
	public static String flipCoin(){
		
		Random r1 = new Random();
		int randomNumber = r1.nextInt(100) + 1;
		
		if (randomNumber % 2 == 0){
			return "Heads";
		} else {
			return "Tails";
		}
		
		
	}

}
