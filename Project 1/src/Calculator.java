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
		//@see textbook chapters 2.2 and 3.3
		Scanner console = new Scanner(System.in);
		
		// declare variables
		//degrees fahrenheit and degrees celsius
		double F = console.nextDouble();
		double C = console.nextDouble();
		celsius(F);
		fahrenheit(C);
	}
	public static void celsius(double F) {
		//compute C
	   
		double C = (F-32)*(5.0/9.0);
		
		//print temperature in C 
		System.out.print(C);
		System.out.println(" Celsius");
	}
	public static void fahrenheit(double C) {
		//compute F
	
		double F = (9.0/5.0)*C+32;
		
		//print temperature in F
		System.out.print(F);
		System.out.print(" Fahrenheit");

		
	}

}
