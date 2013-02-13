import static java.lang.System.out;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class arraysOne {
	
	public static void main(String args[]) throws IOException {
		
		int p = 10;
		
		Integer numberPool[] = new Integer[p];
		Scanner diskScanner = new Scanner(new File("NumberPool.txt"));
		
		
		
		for (int myNumber = 0; myNumber < numberPool.length; myNumber ++) {
			numberPool[myNumber] = diskScanner.nextInt();
		}
		
		diskScanner.close();
		
		//Arrays.sort(numberPool, Collections.reverseOrder());
		
		Arrays.sort(numberPool);
		
		for (int myNumber = 0; myNumber < numberPool.length; myNumber ++) {
			
			if (numberPool[myNumber] % 2 == 0){
			out.println(numberPool[myNumber]);
				
			}
		}
		
	}
		//for (int myNumber = numberPool.length -1; myNumber >= 0; myNumber --) {
		//	out.println(numberPool[myNumber]);
		//}
	
		
	}


