import static java.lang.System.out;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class RecursivePrint {
	
public static void main(String args[]) throws IOException {
		
		int p = 10;
		
		Integer numberPool[] = new Integer[p];
		Scanner diskScanner = new Scanner(new File("NumberPool.txt"));
		
		
		
		for (int myNumber = 0; myNumber < numberPool.length; myNumber ++) {
			numberPool[myNumber] = diskScanner.nextInt();
		}
		
		diskScanner.close();
		
		}


		public static Integer printAll(Integer[] intArray, int index){
			if (index < intArray.length){
					return index;
					
			}else{
				return printAll()
			}
		}
	

}
		
	



