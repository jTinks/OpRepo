import java.util.Scanner;

public class pigLatinConverter {

	
	
	
	public static void main(String[] args) 
	{
	
	System.out.println("Enter a string to convert:");
		
	Scanner keyboard = new Scanner(System.in);
	String a = keyboard.nextLine();
	keyboard.close();
		
	//String a = ("convert this shit to pig latin bro");
	a = piggyConverter(a);
	System.out.println(a);
	
	System.out.println("-------------");
	
	System.out.println("There are " + countWords(a) + " words in the sentence.");

	}
	
	
	public static String piggyConverter(String s)
	{
		
		String words[] = s.split(" ");
		StringBuilder builder = new StringBuilder();
		
		for ( int i = 0; i < words.length; i++)
		{
			StringBuilder builds = new StringBuilder(words[i]);
			String k = builds.substring(1, builds.length()) + builds.charAt(0);
			StringBuilder sb = new StringBuilder(k);
			sb.insert(sb.length()-1, "-");
			String t = new String(sb);
			t = t + "ay";
			builder.append(t);
			
			if (i < words.length -1 )
			{
				builder.append(" ");
			}	
		}
		
		return builder.toString();
	}

	public static int countWords(String x)
	{
		String words[] = x.split(" ");
		
		return words.length;
		
	}
}
