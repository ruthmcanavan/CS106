import java.io.*;
import java.util.*;
/**
 
/**
 * @author ruthcanavan
 *Determine if the subject is P or J
 */
public class perceivingOrJudging 
	throws FileNotFoundException {
	//read in file with answers
	fileReader = new Scanner(new File("src/answers.txt"));
	while (fileReader.hasNext()) {
	
	
	//declare variables
	int perceiving = 0;
	int judging = 0; {

	//35. I like to have things decided 
		if (anwser = true){
			judging++;
		} else {
			judging--;
		}
	
	//36. I like to approach work as play or mix work and play 
		if (anwser = true){
			perceiving++;
		} else {
			perceiving--;
		}
	
	//37. I appear to be task oriented 
		if (anwser = true){
			judging++;
		} else {
			judging--;
		}
	
	//38. I am stimulated by an approaching deadline 
		if (anwser = true){
			perceiving++;
		} else {
			perceiving--;
		}
	
	//39. I work in bursts of energy 
		if (anwser = true){
			perceiving++;
		} else {
			perceiving--;
		}
	
	//40. I plan work to avoid rushing just before a deadline 
		if (anwser = true){
			judging++;
		} else {
			judging--;
		}
	
	//41. Sometimes I focus so much on the goal that I miss new information 
		if (anwser = true){
			judging++;
		} else {
			judging--;
		}
	
	//42. I like to make lists of things to do 
		if (anwser = true){
			judging++;
		} else {
			judging--;
		}
	
	//43. I like to stay open to respond to whatever happens 
		if (anwser = true){
			perceiving++;
		} else {
			perceiving--;
		}
	
	//44. I like to get my work done before playing 
		if (anwser = true){
			judging++;
		} else {
			judging--;
		}
	
	//45. I appear to be loose and casual. I like to keep plans to a minimum 
		if (anwser = true){
			perceiving++;
		} else {
			perceiving--;
		}
	
	//46. Sometimes I stay open to new information so long I miss making decisions when they are needed 
		if (anwser = true){
			perceiving++;
		} else {
			perceiving--;
		}
		
		//Determine whether subject is P or J and print results
		if(perceiving > judging) {
			System.out.print("   P");
		}else if(judging > perceiving) {
			System.out.print("   J");
		}else  //Print X if subject's P score equals their J score
			System.out.print("   X");
		
}
}
}

