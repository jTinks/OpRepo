
import java.util.Scanner;

public class BigLetters {

	
	
	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("What is your first name?");
	
	String firstName = keyboard.next();
	
	char a = firstName.charAt(0);
	

	if (Character.toString(a).equalsIgnoreCase("a"))
	{
		printA();
	}
		
	}

	
	public static void printA(){
  
		System.out.println("  A  ");
		System.out.println(" A A ");
		System.out.println("A   A");
		System.out.println("AAAAA");
		System.out.println("A   A");
		System.out.println("A   A");
		System.out.println("A   A");
	
   }
	
	public static void printB(){
		
		System.out.println("BBBB ");
		System.out.println("B   B");
		System.out.println("B   B");
		System.out.println("BBBB ");
		System.out.println("B   B");
		System.out.println("B   B");
		System.out.println("BBBB ");
		
	}
	
	public static void printC(){
		
	}
   
   
   }
	

