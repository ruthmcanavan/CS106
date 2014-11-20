/**
 * 
 */

/**
 * @author ruthcanavan
 *
 */
public class recursionPractice2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(sum(10));
	}		

	private static int sum(int max) {
		if (max>1) {
			return max + sum(max -1);
		}
		return 1;
	}

}


