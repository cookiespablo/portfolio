// Ammaar Yakoob 6B
import java.util.Scanner;

public class MoneyExchange {
	public static double round(double nr, int decimalen){
		double mult = Math.pow(10, decimalen);
		return Math.round(nr * mult)/mult;
	}
	public static final double EURO = 0.945760628;
	public static final double EURO2 = 1.17813;
	public static final double EURO3 = 0.00826121909;
	public static final int MININUM = 2;
	public static final int MAXIMUM = 15;
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("Valuta (1 = US dollar, 2 = GB pound, 3 = Yen, 0 = stop");
			int valuta = input.nextInt();
			if(valuta== 0){
				break;
			}
			if(valuta <1){
				System.out.println("error probeer het opnieuw");
				continue;
				
			}
			if(valuta >3){
				System.out.println("error probeer het opnieuw");
				continue;
			}
				
			System.out.println("In te wisselen bedrag(geheele getallen):");
			int wisselen = input.nextInt();
			double dollarR = round((wisselen * EURO),2);
			double poundR = round((wisselen * EURO2),2);
			double yenR = round(wisselen * EURO3,2);
			
			double transactieR = round(1.5*(dollarR/100),2);
			double transactieR2 = round(1.5*(poundR/100),2);
			double transactieR3 = round(1.5*(yenR/100),2);
		   
			double eindbedragR = round((dollarR - transactieR),2);
		    double eindbedrag2R = round((poundR - transactieR2),2);
		    double eindbedrag3R = round((yenR - transactieR3),2);
			
			
			if (valuta == 1){
				System.out.println("Voor" + " " + (wisselen) + " " + "US dollars krijgt u" + " " + (dollarR) + " " + "euro");
				if (transactieR < 2){
					System.out.println("De transactiekosten bedragen" + " " + (MININUM) + " " + "euro.");
					System.out.println("U ontvangt" + " " + (dollarR - MININUM) + " " + "euro.");
				}
				else if (transactieR > 15){
					System.out.println("De transactiekosten bedragen" + " " + (MAXIMUM) + " " + "euro.");
					System.out.println("U ontvangt" + " " + (dollarR - MAXIMUM) + " " + "euro.");
				}
				else if(transactieR > 2 && transactieR < 15){
					System.out.println("De transactiekosten bedragen" + " " + (transactieR) + " " + "euro.");
					System.out.println("U ontvangt" + " " + (eindbedragR) + " " + "euro.");
				}
	
					
				}
			
			else if (valuta == 2){
				System.out.println("Voor" + " " + (wisselen) + " " + "GB pound krijgt u" + " " + (poundR) + " " + "euro");
				if (transactieR2 < 2){
					System.out.println("De transactiekosten bedragen" + " " + (MININUM)+ " " + "euro.");
					System.out.println("U ontvangt" + " " + (poundR - MININUM) + " " + "euro.");
				}
				else if (transactieR2 > 15){
					System.out.println("De transactiekosten bedragen" + " " + (MAXIMUM) + " " + "euro.");
					System.out.println("U ontvangt" + " " + (poundR - MAXIMUM) + " " + "euro.");
				}
				else if(transactieR2 > 2 && transactieR2 < 15){
					System.out.println("De transactiekosten bedragen" + " " + (transactieR2) + " " + "euro.");
					System.out.println("U ontvangt" + " " + (eindbedrag2R) + " " + "euro.");
				}
			}
			else if (valuta == 3){
				System.out.println("Voor" + " " + (wisselen) + " " + "yen krijgt u" + " " + (yenR) + " " + "euro");
			    if(transactieR3 < 2){
			    	System.out.println("De transactiekosten bedragen" + " " + (MININUM)+ " " + "euro.");
			    	System.out.println("U ontvangt" + " " + (yenR - MININUM) + " " + "euro.");
			    	
			    }
			    else if (transactieR3 > 15){
			    	System.out.println("De transactiekosten bedragen" + " " + (MAXIMUM)+ " " + "euro.");
			    	System.out.println("U ontvangt" + " " + (yenR - MAXIMUM) + " " + "euro.");
			    }
			    else if(transactieR3 > 2 && transactieR3 < 15){
					System.out.println("De transactiekosten bedragen" + " " + (transactieR3) + " " + "euro.");
					System.out.println("U ontvangt" + " " + (eindbedrag3R) + " " + "euro.");
				}
			}

		}
	}

}

