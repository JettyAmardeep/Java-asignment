package casestudy;
import java.util.Scanner;
public class Flowerdemo {
	 public void displayFlower(String continent) {
		 if (continent=="ASIA"||continent=="asia") 
		 {
			 System.out.println("COUNTRY:INDIA\t"   +    "NATIONAL FLOWER:LOTUS");
			 System.out.println("COUNTRY:PAKISTAN\t"   +    "NATIONAL FLOWER:JASMINE");
			 System.out.println("COUNTRY:NEPAL\t"   +    "NATIONAL FLOWER:LAU GURANS");
		 }
		else if(continent=="EUROPE"|| continent=="europe")
		{
				 System.out.println("COUNTRY:GERMANY\t"   +    "NATIONAL FLOWER:CORN FLOWER");
				 System.out.println("COUNTRY:FRANCE\t"   +    "NATIONAL FLOWER:LILY");
				 System.out.println("COUNTRY:GREECE\t"   +    "NATIONAL FLOWER:MOLLIS");

		 }
		else if(continent=="AFRICA"||continent=="africa")
		{
			     System.out.println("COUNTRY:EGYPT\t"   +    "NATIONAL FLOWER: BLUE LOTUS");
				 System.out.println("COUNTRY:NIGERIA\t"   +    "NATIONAL FLOWER: YELLO TRUMPET ");
				 System.out.println("COUNTRY:KENYA\t"   +    "NATIONAL FLOWER:ORCHID");

		}	
	 }	 
}

