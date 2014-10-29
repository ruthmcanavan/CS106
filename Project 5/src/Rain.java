/**
 * 
 */

/**
 * @author ruthcanavan
 * a class to create the necessary variables
 * @param year the year
 * @param month month of the year
 * @param mm millimeters of rainfall
 */
public class Rain {
	//list year, month and millimeters of rain variables
	public String year;
	public String month;
	public int mm;
	
	public Rain(String year, String month, int mm) {
		//set variables
		this.year = year;
		this.month = month;
		this.mm = mm;
	}
}