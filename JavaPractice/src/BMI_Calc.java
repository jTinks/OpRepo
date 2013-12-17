import java.util.Scanner;


public class BMI_Calc {
	
	public static void main(String[] args){
		
		String measurements;
		double height;
		double weight;
		double bmi = 0;
		String status;
		String insult;
		
		System.out.println("Welcome to the BMI Calculator! Would you like to use Metric or Imperial measurements?");
		
		Scanner keyboard = new Scanner(System.in);
		measurements = keyboard.nextLine();
		
		if(measurements.equalsIgnoreCase("metric")){
			
			System.out.println("Input height(meters):");
			height = keyboard.nextDouble();
			
			System.out.println("Input weight(kg):");
			weight = keyboard.nextDouble();
			
			bmi = convertMetric(height, weight);
			
		} else if (measurements.equalsIgnoreCase("imperial")){
			
			System.out.println("Input height(inches):");
			height = keyboard.nextDouble();
			
			System.out.println("Input weight(lbs):");
			weight = keyboard.nextDouble();
			
			bmi = convertImperial(height, weight);
			
		} else {
			System.out.println("Option not selected. Terminating application.");
			System.exit(0);
		}
		
		keyboard.close();
		
		if (bmi < 18){
			status = "under weight";
			insult = "Eat a sandwhich, bitch.";
		} else if (bmi >= 18 && bmi < 25){
			status = "at a healthy weight";
			insult = "Do you even lift bro?";
		} else if (bmi >= 25 && bmi < 30){
			status = "overweight";
			insult = "Gettin big, brah.";
		} else {
			status = "obese";
			insult = "Hit the gym, butterball.";
		}
		
		System.out.println("--------------------------------");
		System.out.println("You are " + status + " with a BMI of " + bmi + ". " + insult);
		
		
	}
		
	public static double convertMetric(double x, double y){
		
		double bmi = 0;
		
		bmi = y / (x * x);
		
		return bmi;
		
	}
	
	public static double convertImperial(double x, double y){
	
		double bmi = 0;
		
		bmi = (y / (x * x)) * 703;
		
		return bmi;
	}

	
}
