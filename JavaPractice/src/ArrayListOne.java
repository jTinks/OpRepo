
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class ArrayListOne {

	
	public static void main(String args[]) throws IOException{
		
		ArrayList<Integer> numberPool = new ArrayList<Integer>();
		Scanner diskScanner = new Scanner(new FileReader("NumberPool.txt"));
		
		
		while(diskScanner.hasNextInt()){
			numberPool.add(diskScanner.nextInt());
		}
		
		diskScanner.close();
		
		//Collections.sort(numberPool);
		Collections.sort(numberPool, Collections.reverseOrder());
		
		
		for(int i = 0; i < numberPool.size(); i++){
			int item = numberPool.get(i);
			System.out.println(item);
		}
		

		if(numberPool.size() == 0){
		   System.out.println("ArrayList is empty");

		}
	}
	
}
