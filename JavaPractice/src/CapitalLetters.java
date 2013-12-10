import java.util.Arrays;
import java.util.Random;


public class CapitalLetters 
{
	
	public static void main(String args[]) 
	{
		
		char charOne = 'b';
		System.out.println(Character.toUpperCase(charOne));
		System.out.println("-----------------");
		
		StringBuilder sb = new StringBuilder("name");
		sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
		System.out.println(sb);
		System.out.println("-----------------");
		
		String t = "word word word";
		t = capitalizeFirstLetter(t);
		System.out.println(t);
		System.out.println("-----------------");
		
		String aa = "jaysen";
		aa = capitalizeRandoms(aa);
		System.out.println(aa);
		System.out.println("-----------------");
		
		String bb = "thIs is mY aweSome sTRing.";
		bb = capEachFirst(bb);
		System.out.println(bb);
		System.out.println("-----------------");
		
	}
		
		public static String capitalizeFirstLetter(String s)
		{
			
			StringBuilder sbOne = new StringBuilder(s);
			sbOne.setCharAt(0, Character.toUpperCase(sbOne.charAt(0)));
			
			return sbOne.toString();
			
		}
		
		public static String capitalizeRandoms(String d)
		{
				
			StringBuilder sbTwo = new StringBuilder(d);
			Random r1 = new Random();
			
			for (int i = 0; i < sbTwo.length(); i++)
			{	
				int randomInt = r1.nextInt(100);
				if (randomInt % 2 == 0)
				{
					sbTwo.setCharAt(i, Character.toUpperCase(sbTwo.charAt(i)));
				}
			}
			
			return sbTwo.toString();
			
		}

		public static String capEachFirst(String z)

		{
			z = z.toLowerCase();
			String Words[] = z.split(" ");
			StringBuilder builder = new StringBuilder();
		
			for ( int i = 0; i < Words.length; i++)
			{
				StringBuilder builds = new StringBuilder(Words[i]);
				builds.setCharAt(0, Character.toUpperCase(builds.charAt(0)));
				builder.append(builds);
				
				if (i < Words.length - 1)
				{
					builder.append(" ");
				}
			}
				
			return builder.toString();
			
		}
		
}
		


