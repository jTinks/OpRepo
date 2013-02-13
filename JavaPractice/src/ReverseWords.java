import static java.lang.System.out;
import java.util.Scanner;
import java.util.StringTokenizer;




public class ReverseWords {
	
	
	public static void main(String[] args){
		
		out.println("Enter a string to reverse.");
		
		Scanner keyboard = new Scanner(System.in);
		
		StringBuilder builder = new StringBuilder(keyboard.nextLine());
	
		keyboard.close();
	
		StringTokenizer st = new StringTokenizer(builder.reverse().toString(), " ");
	
		out.print("Reversed string: ");
		
	
			while(st.hasMoreTokens()){
				StringBuilder sb = new StringBuilder(st.nextToken());
			
				out.print(" " + sb.reverse());
			}
		}

}
