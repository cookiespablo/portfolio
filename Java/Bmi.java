
import java.util.Scanner;
public class Bmi{
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
		System.out.println("Bmi:"+(Weight/(meters*meters)));
	}
	

}


