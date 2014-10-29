/**
 * 
 */
import java.io.*;
/**
 * @author ruthcanavan
 *Program to analyze how many months Cork, Ireland has had more than 100mm of rain since 2012 
 */
public class Project5 {
	/**
	 * @param args
	 * Values are made up but based on averages @see http://www.cork.climatemps.com/cork-climate-graph.gif 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Parser parser = new Parser();
		numMonths months = new numMonths();	
		System.out.println(months.analysis(parser.rain) + " months have had over 100mm of rain in Cork since 2012");
	}
}
