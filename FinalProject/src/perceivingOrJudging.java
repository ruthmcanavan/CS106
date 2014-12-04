import java.io.*;
import java.util.*;
/**
 
/**
 * @author ruthcanavan
 *Determine if the subject is P or J
 */
public class perceivingOrJudging {
	public void load3() throws FileNotFoundException {
	//read in file with answers
	Scanner fileReader = new Scanner(new File("src/answers.txt"));
	//declare variables
	int count = 0;
	int perceiving = 0;
	int judging = 0; 
	
	while (fileReader.hasNext()) {
	
	boolean answer = fileReader.nextBoolean();
	
	
	//35. I like to have things decided 
		if (count == 34 && answer == true){
			judging++;
		} else {
			judging--;
		}
	
	//36. I like to approach work as play or mix work and play 
		if (count == 35 && answer == true){
			perceiving++;
		} else {
			perceiving--;
		}
	
	//37. I appear to be task oriented 
		if (count == 36 && answer == true){
			judging++;
		} else {
			judging--;
		}
	
	//38. I am stimulated by an approaching deadline 
		if (count == 37 && answer == true){
			perceiving++;
		} else {
			perceiving--;
		}
	
	//39. I work in bursts of energy 
		if (count == 38 && answer == true){
			perceiving++;
		} else {
			perceiving--;
		}
	
	//40. I plan work to avoid rushing just before a deadline 
		if (count == 39 && answer == true){
			judging++;
		} else {
			judging--;
		}
	
	//41. Sometimes I focus so much on the goal that I miss new information 
		if (count == 40 && answer == true){
			judging++;
		} else {
			judging--;
		}
	
	//42. I like to make lists of things to do 
		if (count == 41 && answer == true){
			judging++;
		} else {
			judging--;
		}
	
	//43. I like to stay open to respond to whatever happens 
		if (count == 42 && answer == true){
			perceiving++;
		} else {
			perceiving--;
		}
	
	//44. I like to get my work done before playing 
		if (count == 43 && answer == true){
			judging++;
		} else {
			judging--;
		}
	
	//45. I appear to be loose and casual. I like to keep plans to a minimum 
		if (count == 44 && answer == true){
			perceiving++;
		} else {
			perceiving--;
		}
	
	//46. Sometimes I stay open to new information so long I miss making decisions when they are needed 
		if (count == 45 && answer == true){
			perceiving++;
		} else {
			perceiving--;
		}
		
		count++;
	}	
		//Determine whether subject is P or J and print results
		if(perceiving > judging) {
			System.out.print("                 P");
		}else if(judging > perceiving) {
			System.out.print("                 J");
		}else  //Print X if subject's P score equals their J score
			System.out.print("                 X");
		
		fileReader.close();
		
	}
}

