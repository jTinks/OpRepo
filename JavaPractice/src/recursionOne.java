import static java.lang.System.out;
import java.util.Scanner;


public class recursionOne {

	
	public static void main(String args[]){
		
		
	out.println("Enter a String to reverse.");
	
	Scanner keyboard = new Scanner(System.in);
	
	String p = keyboard.nextLine();
	
	keyboard.close();
	
	out.println("Original string: " + p);
	
	String r = reverse(p);
	out.println("Reversed string: " + r);
	
	}
		public static String reverse(String s){
			if (s.length() <=1){
				return s;
				
			}else{
				return reverse(s.substring(1, s.length())) + s.charAt(0);
		}
	}		
}
		
		
		
		
	
