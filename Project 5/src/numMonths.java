import java.io.*;
import java.util.*;


/**
 * @author ruthcanavan
 *A class to analyze the data and count how many months have over 100mm of rainfall 
 */
	public class numMonths {  
	
		
	public int analysis() {
		Scanner fileReader = new Scanner(new File("src/corkRain.txt")); {
		while (fileReader.hasNext()) {
		}
		
	//Find how many months have over 100mm of rainfall in Cork
	int numMonths = 0; 
	int i = 0;
	//Cannot remember what to do with the for loop
	for()
	{
	if (MM[i] >= 100){
		numMonths++;	
	  }
    }
	return numMonths;
  }
}
}