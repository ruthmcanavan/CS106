/**
 * 
 */
import java.util.*;
import java.io.*;
/**
 * @author ruthcanavan
 *
 */
public class Project4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
			throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/numbers.txt"));
			double checkingBalance = 1540.39;
			double savingsBalance = 1000.00;
			double creditBalance = 549.20;
	
				
			while (input.hasNextLine()) {
				//Throw away the date
				input.next();
				
				String account = input.next(); 
				//Keep track of checking account		
				if(input.hasNext("Checking")) {	
					//Subtract from total checking balance if withdrawal
					if(input.hasNext("Withdrawal")) {
						input.next();
						checkingBalance -=  input.nextDouble();
					//Add to total checking balance if deposit
					}else if(input.hasNext("Deposit")) {
						input.next();
						checkingBalance +=  input.nextDouble();
					//Do nothing if opening balance
					}else {
						input.next();
						input.next();
						input.next();
				}	
				
			}
				//Keep track of savings account		
				else if(input.hasNext("Savings")) {	
					input.next();
					//Add to total savings balance if deposit
					if(input.hasNext("Deposit")) {
						input.next();
						savingsBalance += input.nextDouble();
					//Do nothing if opening balance
					}else {
						input.next();
						input.next();
						input.next();
				}	
				
			}
				
				//Keep track of credit card 		
	          else {	
					//skip the word "card"
					input.next();
				}
					//Subtract from total credit balance if withdrawal
					if(input.hasNext("Withdrawal")) {
						input.next();
						creditBalance -= input.nextDouble();
					}else if(input.hasNext("Deposit")) {
						input.next();
						creditBalance += input.nextDouble();
					//Do nothing if opening balance
					}else {
						input.next();
						input.next();
						input.next();
				}	
				
			}
				
			System.out.println(checkingBalance);
			System.out.println(savingsBalance);
			System.out.println(creditBalance);
				
								
}
}
	
	
	
	

