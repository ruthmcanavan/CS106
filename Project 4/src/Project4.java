/**
 * 
 */
import java.util.*;
import java.io.*;
/**
 * @author ruthcanavan
 *@param checkingBalance Amount of money in the checking account
 *@param savingsBalance Amount of money in the savings account
 *@param creditBalance Amount of money on the credit card
 */
public class Project4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
			throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/numbers.txt"));
			double checkingBalance = 0.0;
			double savingsBalance = 0.0;
			double creditBalance = 0.0;
	
				
			while (input.hasNextLine()) {
				//Throw away the date
				input.next();
				
				 
				//Keep track of checking account		
				if(input.hasNext("Checking")) {	
					input.next();
					//Subtract from total checking balance if withdrawal
					if(input.hasNext("Withdrawal")) {
						input.next();
						checkingBalance -=  input.nextDouble();
					//Add to total checking balance if deposit
					}else if(input.hasNext("Deposit")) {
						input.next();
						checkingBalance +=  input.nextDouble();
					//Add to total checking balance if opening balance
					}else {
						input.next();
						input.next();
						checkingBalance += input.nextDouble();
				}	
				
			}
				//Keep track of savings account		
				else if(input.hasNext("Savings")) {
					input.next();
					//Add to total savings balance if deposit
					if(input.hasNext("Deposit")) {
						input.next();
						savingsBalance += input.nextDouble();
					//Subtract from total savings balance if withdrawal
					}else if(input.hasNext("Withdrawal")) {
						input.next();
						savingsBalance -= input.nextDouble();
					//Add to total savings balance if opening balance
					}else {
						input.next();
						input.next();
						savingsBalance += input.nextDouble();
				}	
				
			}
				
				//Keep track of credit card 		
	          else {	
					//skip the words "credit card"
					input.next();
					input.next();
					//Subtract from total credit balance if withdrawal
					if(input.hasNext("Withdrawal")) {
						input.next();
						creditBalance -= input.nextDouble();
					//Add to total credit balance if deposit
					}else if(input.hasNext("Deposit")) {
						input.next();
						creditBalance += input.nextDouble();
					//Add to total credit balance if opening balance
					}else {
						input.next();
						input.next();
						creditBalance += input.nextDouble();
				}	
				}
				
			}
				
			//Open PrintStream to print to a file
			PrintStream output = new PrintStream(new File("src/output.txt"));
			
			//Print results to the new file
			
			output.println("Checking Balance $" + checkingBalance);
			output.println("Savings Balance $" + savingsBalance);
			output.println("Credit Card Balance $" + creditBalance);
				
			
			//Close PrintStream
			output.close();
								
	}
}
	
	
	
	

