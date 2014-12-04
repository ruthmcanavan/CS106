import java.io.*;
import java.util.*;
/**
 * 
 */

/**
 * @author ruthcanavan
 *Determine if the subject is I or E
 */

public class introvertOrExtrovert  {
	public void load1() throws FileNotFoundException {
	//read in file with answers
	Scanner fileReader = new Scanner(new File("src/answers.txt"));
	//declare variables
	int count = 0;
	int introversion = 0;
	int extroversion = 0;
	
	while (fileReader.hasNext()) {
	
	boolean answer = fileReader.nextBoolean();

	
	
	
	//1. I feel comfortable being alone
		if (count == 0 && answer == true){
			introversion++;
		} else {
			introversion--;
		}
	
	//2. I have a wide range of friends and know lots of people
		if (count == 1 && answer == true){
			extroversion++;
		} else {
			extroversion--;
		}
	
	//3. I sometimes spend too much time reflecting and don't move into action quickly enough
		if (count == 2 && answer == true){
			introversion++;
		} else {
			introversion--;
		}
	
	//4. I like to work in groups
		if (count == 3 && answer == true){
			extroversion++;
		} else {
			extroversion--;
		}
	
	//5. I prefer to know just a few people well
		if (count == 4 && answer == true){
			introversion++;
		} else {
			introversion--;
		}
	
	//6. I am seen as outgoing or as a people person
		if (count == 5 && answer == true){
			extroversion++;
		} else {
			extroversion--;
		}
	
	//7. I like things I can do on my own
		if (count == 6 && answer == true){
			introversion++;
		} else {
			introversion--;
		}
	
	//8. I feel comfortable in crowds
		if (count == 7 && answer == true){
			extroversion++;
		} else {
			extroversion--;
		}
	
	//9. I am seen as reflective or reserved
		if (count == 8 && answer == true){
			introversion++;
		} else {
			introversion--;
		}
	
	//10. i sometimes jump too quickly into activity and don't allow enough time to think it over
		if (count == 9 && answer == true){
			extroversion++;
		} else {
			extroversion--;
		}
		
		count++;
	}
		//Determine whether subject is I or E and print results
		if(introversion > extroversion) {
			System.out.print("I");
		}else if(extroversion > introversion) {
			System.out.print("E");
		}else //Print X if subject's I score equals their E score
			System.out.print("X");
		
		fileReader.close();
	}
}

