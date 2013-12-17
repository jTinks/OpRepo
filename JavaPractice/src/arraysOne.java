
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;



public class arraysOne {
	
	public static void main(String args[]) throws IOException {
		
		int p = 10;
		int myNumber = 0;
		int valueCount = 0;
		
		System.out.println("Enter a value to find in the array.");
		
		Scanner keyboard = new Scanner(System.in);
		int value = keyboard.nextInt();
		
		keyboard.close();
		
		Integer numberPool[] = new Integer[p];
		//Scanner diskScanner = new Scanner(new File("NumberPool.txt"));
		
		
		
		//for (int i = 0; i < numberPool.length; i++) {
		//	numberPool[i] = diskScanner.nextInt();
		//}
		
		//diskScanner.close();
			
		for (int i = 0; i < numberPool.length; i++){
			
			Random rando = new Random();
			numberPool[i] = rando.nextInt(10) + 1;
		}
		
		
		for (int i = 0; i < numberPool.length; i++){
			
			if (myNumber < numberPool[i]){
				myNumber = numberPool[i];
			}
			
		}
		
		//Arrays.sort(numberPool, Collections.reverseOrder());
		
		//Arrays.sort(numberPool);
		
		for (int i = 0; i < numberPool.length; i++) {
			
			//if (numberPool[i] % 2 == 0){
			System.out.println(numberPool[i]);		
			
			if (numberPool[i] == value){
				valueCount++;
			}
		}
		
		if (valueCount > 0){
			System.out.println("\n" + value + " is in the array " + valueCount + " time(s)!");
		} else {
			System.out.println("\nSorry, " + value + " is not in the array.");
		}
		
			
		System.out.println("\nThe largest number in the array is " + myNumber + ".");
		
	}
		//for (int myNumber = numberPool.length -1; myNumber >= 0; myNumber --) {
		//	System.out.println(numberPool[myNumber]);
		//}
	
		
	}


