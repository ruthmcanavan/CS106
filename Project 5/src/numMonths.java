
/**
 * @author ruthcanavan
 *A class to analyze the data and count how many months have over 100mm of rainfall 
 *@param numMonths number of months with over 100mm of rain
 *@return numMonths
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
