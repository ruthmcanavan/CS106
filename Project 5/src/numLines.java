import java.io.File;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author ruthcanavan
 * a class to count the number of lines in the file
 */
public class numLines {
	//Count number of lines in the file
	throws FileNotFoundException;
	int numLines = 0;
	Scanner fileReader = new Scanner(new File("src/corkRain.txt")); {
	while (fileReader.hasNextLine()) {	
	fileReader.nextLine();
		numLines++;
		}
	}
}