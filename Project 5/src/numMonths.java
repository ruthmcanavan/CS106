import java.io.*;
import java.util.*;

/**
 * 
 */

/**
 * @author ruthcanavan
 *A class to analyze the data and count how many months have over 100mm of rainfall 
 */
	public class numMonths {  
	
		
	public int analysis() {
		Scanner fileReader = new Scanner(new File("src/corkRain.txt")); {
		while (fileReader.hasNext()) {
		}
		
		double [] rain = new double[numLines];
	
	//Skip over the month and year
	input.next();
	input.next();
	
	//Create array for rain
	int r = 0;
	rain[r] = fileReader.nextDouble();
	
	
	//Find how many months have over 100mm of rainfall in Cork
	int numMonths = 0; {
	if (rain >= 100){
		numMonths++;	
	  }
    }
	return numMonths;
  }
}
}