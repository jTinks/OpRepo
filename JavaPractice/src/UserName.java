import static java.lang.System.out;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * I want to create an array of existing usernames that I can reference when a user attempts to log in. 
 * If their specified username is not on the list I will give them the option to create an account. 
 * Creating an account will simply add their chosen username to the local array. A check will be ran to make 
 * sure that the username is not already in use. Passwords will come later. 
 */

public class UserName {
	
	

	public static void main(String[] args) throws IOException{
		
		
		List<String> nameList = new ArrayList<String>();
		
		Scanner diskScanner = new Scanner(new FileReader("UserNames.txt"));
		
		while(diskScanner.hasNextLine()){
			nameList.add(diskScanner.nextLine());
		}
	
		diskScanner.close();
		
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Username: ");
		String username = keyboard.nextLine();
		
		out.print("Password: ");
		String password = keyboard.nextLine();
		
		
			
		if (nameList.contains(username) && password.equals("secret")){
				out.println("Access Granted - Welcome " + username + "!");
			
			}else{
				out.println("Your username or password is incorrect - Access Denied");
				out.println("Would you like to create an account? yes or no");
				
			if(keyboard.nextLine().equalsIgnoreCase("yes")){
				out.println("Enter a username.");
				
				String s = keyboard.nextLine();
				out.println("Username created!");
				FileWriter accountWriter = new FileWriter("UserNames.txt", true);
					accountWriter.write(" \n" + s);
					accountWriter.close();
				
			}else{
				out.println("Goodbye.");
				}
			}
		
		
		keyboard.close();	
		
		}

	}
	

	
	
			
	


