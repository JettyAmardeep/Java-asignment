package casestudy2;

import java.util.Scanner;


public class testmain {

	public static void main(String[] args) {
		Fair rd=new Fair();
		Scanner sc = new Scanner(System.in);
		int adult;
        System.out.println("How many adults");
        adult=sc.nextInt();
        int child;
        System.out.println("How many children");
        child=sc.nextInt();
        System.out.println("Which ride");
       

		System.out.println("1.Alibaba");
		System.out.println("2.Alpine slide");
		System.out.println("3.Bumpper Cars");
		System.out.println("4. Baloon Race");
		System.out.println("Select an option");
		int opt;
		opt=sc.nextInt();
		System.out.println("How many hours want to take ride");
		int hrs;
		hrs=sc.nextInt();
		int tothrs;
		tothrs=(adult+child)*hrs;
		System.out.println("Total hours of Ride = "+tothrs);
		
		int adride=rd.adultRide(adult, opt, hrs);
		System.out.println("Adult Ride Fare = $ "+ adride);
		int childride=rd.childRide(child, opt, hrs);
		System.out.println("Child Ride Fare = $ "+childride);
		int totamount=adride+childride;
		System.out.println("Total Ride Fare = $ "+ totamount);
		
		
		
		
        
	}



}


