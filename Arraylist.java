package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
	public static void calc(ArrayList<Integer> ob) {
		double sum=0;
		for(int i=0;i<=ob.size();i++)
		{
			sum= sum+i;
			}
	System.out.println("sum="+sum);
	double Mean = sum / ob.size();
	System.out.println("Mean = " +Mean);
	}
	public static double Median(ArrayList<Integer> ob) {
		Collections.sort(ob);
		if(ob.size() % 2==1)
			return ob.get((ob.size() + 1)/2-1);
		else {
			double low= ob.get(ob.size()/2-1);
			double high= ob.get(ob.size()/2);
			return (low + high)/2.0;
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(4);
		ob.add(3);
		ob.add(2);
		ob.add(1);
		System.out.println(ob);
		calc(ob);
		System.out.println("median is"+Median(ob));
	}

}
