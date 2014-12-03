import java.io.*;
import java.util.*;
/**
 * 
 */

/**
 * @author ruthcanavan
 *Determine if the subject is T or F
 */
public class thinkingOrFeeling 
	throws FileNotFoundException {
	//read in file with answers
	fileReader = new Scanner(new File("src/answers.txt"));
	while (fileReader.hasNext()) {
	
	
	
	//declare variables
	int thinking = 0;
	int feeling = 0; {
	
	//23. I enjoy technical and scientific fields where logic is important 
		if (anwser = true){
			thinking++;
		} else {
			thinking--;
		}
	
	//24. I make decisions with my heart and want to be compassionate 
		if (anwser = true){
			feeling++;
		} else {
			feeling--;
		}
	
	//25. I look for logical explanations or solutions to most everything 
		if (anwser = true){
			thinking++;
		} else {
			thinking--;
		}
	
	//26. Others sometimes see me as too idealistic, mushy, or indirect 
		if (anwser = true){
			feeling++;
		} else {
			feeling--;
		}
	
	//27. I make decisions with my head and want to be fair 
		if (anwser = true){
			thinking++;
		} else {
			thinking--;
		}
	
	//28. I believe being tactful is more important than telling the cold truth 
		if (anwser = true){
			feeling++;
		} else {
			feeling--;
		}
	
	//29. I can be seen as too task-oriented, uncaring, or indifferent 
		if (anwser = true){
			thinking++;
		} else {
			thinking--;
		}
	
	//30. I have a people or communications orientation 
		if (anwser = true){
			feeling++;
		} else {
			feeling--;
		}
	
	//31. I believe telling the truth is more important than being tactful 
		if (anwser = true){
			thinking++;
		} else {
			thinking--;
		}
	
	//32. I am concerned with harmony and nervous when it is missing 
		if (anwser = true){
			feeling++;
		} else {
			feeling--;
		}
	
	//33. I look for what is important to others and express concern for others 
		if (anwser = true){
			feeling++;
		} else {
			feeling--;
		}
	
	//34. Sometimes I miss or don't value the "people" part of a situation 
		if (anwser = true){
			thinking++;
		} else {
			thinking--;
		}
		
		//Determine whether subject is T or F and print results
		if(thinking > feeling) {
			System.out.print("  T");
		}else if(feeling > thinking) {
			System.out.print("  F");
		}else  //Print X if subject's T score equals their F score
			System.out.print("  X");
		
}
}
}

