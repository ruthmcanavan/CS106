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
public class FinalProject {
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		//Call the additional classes 
		IntrovertOrExtrovert ioe = new IntrovertOrExtrovert(); 
		ioe.load1();
		SensingOrIntuition son = new SensingOrIntuition();
		son.load2();
		ThinkingOrFeeling tof = new ThinkingOrFeeling();
		tof.load3();
		PerceivingOrJudging poj = new PerceivingOrJudging();
		poj.load4();

	}

}

