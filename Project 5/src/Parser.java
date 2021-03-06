import java.io.*;
import java.util.*;

/**
 * @author ruthcanavan
 *
 */
public class Parser { 

	//put variables into an array
	public Rain[] rain;
	public Parser() throws FileNotFoundException {
		//Read in the file
		Scanner fileReader = new Scanner(new File("src/corkRain.txt"));
		
		// size the array
		numLines lines = new numLines();
		this.rain = new Rain[lines.lineCount()];
		
		int i = 0;
		while (fileReader.hasNext()) {	
			//Get the year
			String year = fileReader.next();
			//Get the month
			String month = fileReader.next();
			//Get the millimeters of rain
			int mm = fileReader.nextInt();
			//Add a Rain object to the array with the values
			rain[i] = new Rain(year, month, mm);
			//Increment i
			i++;
		}

		//Close file reader
		fileReader.close(); 
	}
}