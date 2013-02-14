import static java.lang.System.out;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class SplitString 
{

	
	public static void main(String[] args)
	{
		
		//out.println("Enter a string to reverse!");
		
		//Scanner keyboard = new Scanner(System.in);
		
		//String s = keyboard.nextLine();
		
		String s = "my name is jaysen";
		
		String[] words = s.split(" ");
		
		Collections.reverse(Arrays.asList(words));
		
		//Collections.shuffle(Arrays.asList(words));
		
		for (String word : words)
		{
			out.print(word + " ");
		}
		
	}
	
}
