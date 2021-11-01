package casestudy2;

public class Fair {
	
	public int adultRide(int adult,int opt,int hrs)
	{
		int price;
	
		switch (opt) {

	      case 1:
	    	 // ALIBABA
	    	  price=adult*hrs*50;
	    	  return price;
		case 2:
	    	  //Alpline Slide
	    	  price=adult*hrs*60;
	    	  return price;
	    	

	      case 3:
	    	  //Bumpper Cars
	    	  price=adult*hrs*45;
	    	  return price;
	 
	        
	      case 4:
	    	 //Baloon Race
	    	  price=adult*hrs*70;
	    	  return price;  
	  
	      default:
	    	  System.out.println("Invalid Option");
	       return 0;
	}
	}

	
	public int childRide(int child,int opt, int hrs)
	{
		int price;
	
	switch (opt) {

      case 1:
    	 
    	  price=child*hrs*40;
    	  return price;
	case 2:
    	 
    	  price=child*hrs*30;
    	  return price;
    	

      case 3:
    	  
    	  price=child*hrs*25;
    	  return price;
 
        
      case 4:
    	 
    	  price=child*hrs*60;
    	  return price;  
  
      default:
    	  System.out.println("Invalid Option");
       return 0;
		
	}
	
}
}
