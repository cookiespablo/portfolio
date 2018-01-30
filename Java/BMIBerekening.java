import java.util.Scanner;

public class BMIBerekening {
	public static double round(double nr, int decimalen){
		double mult = Math.pow(10, decimalen);
		return Math.round(nr * mult)/mult;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("What is your weight?");
		double Weight = input.nextDouble();
		System.out.println("What is your length in cm?");
		int Length = input.nextInt();
		double meters = Length/100f;
		System.out.println("Weight in kg:" + Weight);
		System.out.println("Length in cm:" + Length);
		System.out.println("");
		double Bmi = Weight/(meters*meters);
		double BmiR = round(Bmi,1);
		System.out.println("Bmi:" + (BmiR));
		if (Bmi <18.5){
			System.out.println("Je hebt een ondergewicht");
		}
			else if (Bmi <25.0){
				System.out.println("Je hebt een gezond gewicht");
		}
			else if (Bmi <30.0){
				System.out.println("Je hebt een overgewicht");
		}
			else if (Bmi >30.0){
				System.out.println("Je hebt obesitas");
		}
	}
	

}
