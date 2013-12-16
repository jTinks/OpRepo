import java.util.Random;


public class randomTests {
	
	public static void main(String args[]){
		
		Random r1 = new Random();
		
		int randomInt = r1.nextInt(100) + 1;
		
		System.out.println(randomInt);
		
		
	}

}
