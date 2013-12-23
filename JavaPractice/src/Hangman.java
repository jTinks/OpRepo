
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Hangman {

	
	static String wordList[] = {"penny", "hand", "calling", "orange", "next", "song"}; 
	
	static int numberOfMisses = 0;
	static int numberOfGuesses = 0;
	
	static ArrayList<String> guessList = new ArrayList<String>();
	
	static String word[];
	static String workingWord[];
	
	static Scanner keyboard = new Scanner(System.in);
	
	static String guess;
	
	public static void main(String[] args) {
		
		
		String theWord = chooseWord();
		
		word = new String[theWord.length()];
		
		for (int i = 0; i < theWord.length(); i++){
			word[i] = theWord.substring(i, i+1);
			
		}
	
		workingWord = new String[word.length];
		
		System.out.println("Welcome to the Hangman game. A random word will be selected and you must discover it by guessing individual letters.");
		
		for (int i = 0; i < workingWord.length; i++){
			workingWord[i] = "_";
		}
		
		for (int i = 0; i < word.length; i++){
		}	
		
		while(!Arrays.equals(word, workingWord)){
			
			System.out.print("\n--------------------------");
			System.out.print("\nWord:  ");
			for (int i = 0; i < workingWord.length; i++){
				System.out.print(workingWord[i] + " ");
			}
			
			System.out.print("\nMisses: ");
			for(int i = 0; i < guessList.size(); i++){
				System.out.print(guessList.get(i));
			}
			
			System.out.print("\nInput a guess:");
			guess = keyboard.next();
			
			if (Arrays.asList(word).contains(guess)){
				numberOfGuesses++;
				for (int i = 0; i < word.length; i++){
					if (guess.equals(word[i])){
						workingWord[i] = guess;
						
					}
				}
				
			} else {
				numberOfMisses++;
				numberOfGuesses++;
				
			    guessList.add(guess);
				
				System.out.print("\nMisses: ");
				for (int i = 0; i < guessList.size(); i++){
					System.out.print(guessList.get(i));
				}
			}
			
		}
		
		System.out.print("\n--------------------------");
		System.out.print("\nWord:  ");
		for (int i = 0; i < workingWord.length; i++){
			System.out.print(workingWord[i] + " ");
		}
		
		System.out.print("\nMisses: ");
		for(int i = 0; i < guessList.size(); i++){
			System.out.print(guessList.get(i));
		}
		
		System.out.print("\nYou guessed the word after " + numberOfGuesses + " tries!");
		
	}
		
	
	
	public static String chooseWord(){
	
	String chosenWord = "";
	
	Random rando = new Random();
	chosenWord = wordList[rando.nextInt(wordList.length)]; // chooses a word from the wordList array.
	
	return chosenWord;

	}
	
	
}
