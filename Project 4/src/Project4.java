/**
 * 
 */
import java.util.*;
import java.io.*;
/**
 * @author ruthcanavan
 *@param checking Amount of money in the checking account
 *@param savings Amount of money in the savings account
 *@param credit Amount of money on the credit card
 */
public class Project4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
			throws FileNotFoundException {
		//Count number of lines in the file
			int numLines = 0;
			Scanner fileReader = new Scanner(new File("src/numbers.txt"));
			while (fileReader.hasNextLine()) {	
			fileReader.nextLine();
				numLines++;
			}
			fileReader.close();
			
			//Create arrays
			String[] dates = new String[numLines];
			String[] accounts = new String[numLines];
			String[] transactions = new String[numLines];
			double[] amounts = new double[numLines];
			
			//Read numbers into the arrays
			int i = 0;
			fileReader = new Scanner(new File("src/numbers.txt"));
			while (fileReader.hasNext()) {
				
			//Get the date
			dates[i] = fileReader.next();
			
			//Get the account type
			accounts[i] = fileReader.next();
				if (accounts[i].equals("Credit")) {
					accounts[i] = accounts[i] + " " + fileReader.next();
				}
			
			//Get the transaction type
			transactions[i] = fileReader.next();
				if (transactions[i].equals("Opening")) {
					transactions[i] = transactions[i] + " " + fileReader.next();
				}
			
			//Get the amount
			amounts[i] = fileReader.nextDouble();
			
			//Increment index
			i++;
		}
		fileReader.close();
		
			//Calculate totals	
			double checking = 0.0;
			double savings = 0.0;
			double credit = 0.0;
			for (i = 0; i < dates.length; i++) {
				if (accounts[i].equals("Checking")) {
					if (transactions[i].equals("Withdrawal")) {
						checking -= amounts[i];
					}else {
						checking += amounts[i];
					}
				} else if (accounts[i].equals("Savings")) {
					if (transactions[i].equals("Withdrawal")) {
						savings -= amounts[i];
					}else {
						savings += amounts[i];
					}
				}else { 
					if (transactions[i].equals("Withdrawal")) {
						credit -= amounts[i];
					}else {
						credit += amounts[i];
					}	
				}
			}
			
			System.out.println("Checking Balance: $" + checking);
			System.out.println("Savings Balance: $" + savings);
			System.out.println("Credit Card Balance: $" + credit);
	}
	
}
	
	

