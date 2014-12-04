import java.io.*;
/**
 * A test to determine the Myers-Briggs personality type of a subject whose answers to the questions have been documented in an existing file
 * Participant was asked 46 true or false questions
 * Questions are in comments
 */
/**
 * @author ruthcanavan
 *
 */
public class finalProject {
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		//Call the additional classes 
		introvertOrExtrovert ioe = new introvertOrExtrovert(); 
		ioe.load1();
		sensingOrIntuition son = new sensingOrIntuition();
		son.load2();
		thinkingOrFeeling tof = new thinkingOrFeeling();
		tof.load3();
		perceivingOrJudging poj = new perceivingOrJudging();
		poj.load4();

	}

}

