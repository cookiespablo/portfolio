import java.util.Scanner;

public class Leeftijdberkenen {
	public static final float v = 0.62f;
	public static final int TOEKOMST = 2017;
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Wat is je naam?");
		String naam = input.nextLine();
		System.out.println("Wat is je geboortejaar?");
		int geboortejaar = input.nextInt();
		System.out.println("Beste " + naam + ",in 2017 zal je leeftijd " +(TOEKOMST-geboortejaar +" zijn."));
		System.out.println("En je leeftijd is dan " + (TOEKOMST-geboortejaar) /v +" in venus jaren.");
	}
}
