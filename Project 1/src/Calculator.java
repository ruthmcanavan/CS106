/**
 * 
 */

/**
 * @author ruthcanavan
 *
 */

import java.util.*;

public class Calculator {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@see textbook chapters 2.2 
		Scanner console = new Scanner(System.in);
		
		// declare variables
		//degrees fahrenheit and degrees celsius
		double F = console.nextDouble();
		double C = console.nextDouble();
		
		//print temperature in C 
			System.out.print(celsius(F));
			System.out.println(" Celsius");
			
		//print temperature in F
			System.out.print(fahrenheit(C));
			System.out.print(" Fahrenheit");
	}
	
	public static double celsius(double F) {
		//compute C
		
		double C = (F-32)*(5.0/9.0);
		return C;
	}
	
	public static double fahrenheit(double C) {
		//compute F
	
		double F = (9.0/5.0)*C+32;
		return F;
	}

}
