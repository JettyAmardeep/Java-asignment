package casestudy;

import java.util.Scanner;

public class testmain {

	public static void main(String[] args) {
			Scanner e = new Scanner(System.in);
			System.out.println("Enter continent name from ASIA,EUROPE,AFRICA ");
			String continent=e.nextLine();
			Flowerdemo fd = new Flowerdemo();
			fd.displayFlower(continent);
	}

	}


