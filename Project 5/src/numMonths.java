import java.io.*;
import java.util.*;
/**
 * @author ruthcanavan
 *A class to analyze the data and count how many months have over 100mm of rainfall 
 */
	public class numMonths {  
	
	public int analysis(Rain[] r) {
		
	//Find how many months have over 100mm of rainfall in Cork
	int numMonths = 0; 
	
	for(Rain i: r) {
	
	if (i.mm >= 100){
		numMonths++;	
	  }
    }
	return numMonths;
  }

}
