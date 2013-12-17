import java.util.Random;
import javax.swing.*;


public class randomTests {
	
	public static void main(String args[]){
		
		Random r1 = new Random();
		

		

		int randomInt = r1.nextInt(100) + 1;

		
		System.out.println(randomInt);
		
		
		String name = JOptionPane.showInputDialog("What is your name?");
		
		String input = JOptionPane.showInputDialog("How old are you?");
		int age = Integer.parseInt(input);
		
		System.out.print("Hello, " + name + ". ");
		System.out.println("Next year you will be " + (age+1));
	}

}
