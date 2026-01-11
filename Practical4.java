import java.util.Scanner;
public class Practical4{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("\nRitika Pandey");
		System.out.println("Enrollment No.: 240390107041\n");
		System.out.println("Enter Your Weigth In Pounds: ");
		double w = sc.nextDouble();
		
		System.out.println("Enter Your Height in Inches: ");
		double h = sc.nextDouble();
		
		double kg= w * 0.45359237;
		System.out.printf("Your Weight in Kilograms: %.4f", kg, " kgs.\n");
		
		double meter= h * 0.0254;
		System.out.println("\nYour Height in Meters: "+ meter+ " meter.");
		
		double bmi = kg / (meter * meter);
		System.out.printf("Your BMI %.3f: ", bmi);
		
		sc.close();
	}
}
