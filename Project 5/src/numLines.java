import java.io.*;
import java.util.Scanner;

/**
 * @author ruthcanavan
 * a class to count the number of lines in the file
 * @param numLines number of lines in the file
 * @return numLines
 */
public class numLines {
	//Count number of lines in the file
	public int lineCount() throws FileNotFoundException {
		int numLines = 0;
		Scanner fileReader = new Scanner(new File("src/corkRain.txt")); {
		while (fileReader.hasNextLine()) {	
		fileReader.nextLine();
			numLines++;
			}
		}fileReader.close();
		
		return numLines;
	}	
	
}
 