import java.awt.Color;
import java.awt.Rectangle;


public class OperatorPractice {

	
	public static void main(String[] args){
		
		int b = 2;
		int a = 7;		
		
		b += 4;		// b = b + 4 
		
		b++;	// b = b + 1
		
		b = b + 1;
		
		b -= 2; 	// b = b - 2
		
		
		System.out.println("b = " + b);
		
		
		/** if (a > b){
		 * 		max = a;
		 * 	}
		 * 	else{
		 * 		max = b;
		 * }
		 * 
		 * The conditional operator below is a shortcut for this code. 
		 * 
		 * Boolean-expression ? expression-1 : expression-2
		 */
		
		String word = (a >= b) ? "banana":"houseboat";
		
		System.out.println("The word is " + word);
		
		String name = "Udacity";
		System.out.println(name.length());
		System.out.println(name.substring(3, 7));
		System.out.println(name.indexOf("c"));
		System.out.println("Hello" + name);
		
		
		
		
		
		
		
	}
	
	
}
