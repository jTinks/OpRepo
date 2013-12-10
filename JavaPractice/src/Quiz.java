import java.util.Scanner;

public class Quiz {
	
	public static void main(String[] args){
		
		String readiness;
		String answerOne = "0";
		String answerTwo = null;
		String answerThree = null;
		int numberCorrect = 0;
		
		System.out.println("Are you ready for the quiz?");
		
		Scanner keyboard = new Scanner(System.in);
		readiness = keyboard.next();
		
		if (readiness.equalsIgnoreCase("no")){
			System.out.println("Sorry, Sally. Let's do this.");
		} else if (readiness.equalsIgnoreCase("yes")){
			System.out.println("Good, here we good");
		} else {
			System.out.println("Goodnight");
			System.exit(0);
		}
		
		System.out.println();
		System.out.println("What is the capital of Alaska?");
		System.out.println("     1) Melbourne");
		System.out.println("     2) Anchorage");
		System.out.println("     3) Juneau");
		
		answerOne = keyboard.next();
		
		if (answerOne.equals("3")){
			numberCorrect = numberCorrect ++;
			System.out.println("That's correct! Next Question.");
		} else {
			System.out.println("Sorry, that's incorrect. Next Question");
		}
		
		System.out.println();
		System.out.println("Can you store the value 'cat' in a variable of type int?");
		System.out.println("     1) Yes");
		System.out.println("     2) No");
		
		answerTwo = keyboard.next();
		
		
	
		
		
		
		
		
	}

}
