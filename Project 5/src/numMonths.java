import java.io.*;
import java.util.*;


/**
 * @author ruthcanavan
 *A class to analyze the data and count how many months have over 100mm of rainfall 
 */
	public class numMonths {  
	
	public int analysis() {
		
	//Find how many months have over 100mm of rainfall in Cork
	int numMonths = 0; 
	int i = 0;
	//Don't know what to do with the for loop
	for(Rain i: rain) {
	
	if (MM[i] >= 100){
		numMonths++;	
	  }
    }
	return numMonths;
  }
}
}