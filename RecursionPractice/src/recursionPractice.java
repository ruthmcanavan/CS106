/**
 * 
 */

/**
 * @author ruthcanavan
 *
 */
public class recursionPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	counter(10);
		
	}
	public static void counter(int max) {
		
		if (max>0) {
			counter(max -1);
			System.out.print(max + " ");
			
	}
		
	
	}
}