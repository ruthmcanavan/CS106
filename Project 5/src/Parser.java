import java.io.*;
import java.util.*;
/**
 * 
 */

/**
 * @author ruthcanavan
 *
 */
public class Parser {
//turn variables into arrays
	public Rain[] rain;
	public Parser() {
	
	Scanner fileReader = new Scanner(new File("src/corkRain.txt")); {
		throw FileNotFoundException; {
		int i = 0;
		while (fileReader.hasNext()) {	
		//Get the year
		String year = fileReader.next();
		//Get the month
		String month = fileReader.next();
		//Get the mm of rain
		int mm = fileReader.nextInt();
		}
		//Add a Rain object to the array with the values
		rain[i] = new Rain(year, month, mm);
		//Increment i
		i++;
	}
}
	//Close file reader
	fileReader.close();
}
}