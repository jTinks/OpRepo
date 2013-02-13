import static java.lang.System.out;
import java.util.Scanner;



public class ReverseSentence {
	
	
	
	public static void main(String[] args){
		
		
	//	out.println("Enter a string to reverse.");
		
	//	Scanner keyboard = new Scanner(System.in);
		
	//	StringBuilder sb = new StringBuilder(keyboard.nextLine());
		
	//	keyboard.close();
		
		StringBuilder sb = new StringBuilder("my name is jaysen");
		
		String reverse = new StringBuilder(sb).reverse().toString();
		
		out.println("Reversed string: " + reverse);
		
		
	}

}
