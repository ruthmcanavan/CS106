/**
 * A quiz to determine which Hogwarts house you belong in
 */
	import java.util.*;

/**
 * @author ruthcanavan
 *
 */
public class SortingHat {

	/**
	 *@see http://www.gotoquiz.com/pottermore_sorting_hat_quiz_2 for questions
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//declare variables as key traits of each house
		int bravery = 0; 
		int wisdom = 0;
		int loyalty = 0;
		int cunning = 0;
		
		/*bravery = Gryffindor
		 *wisdom = Ravenclaw
		 *loyalty = Hufflepuff
		 *cunning = Slytherin*/
		
		// Declare scanner
		Scanner console = new Scanner(System.in); 
		
		//Pass variables to first question
		question1(console, bravery, wisdom, cunning, loyalty);
		
	}

	/**
	 * A method to ask the first question
	 * @param console Scanner to prompt for user input
	 * @param bravery principle trait of Gryffindor
	 * @param wisdom principle trait of Ravenclaw
	 * @param loyalty principle trait of Hufflepuff
	 * @param cunning principle trait of Slytherin
	 * @return void
	 */
	
		public static void question1(Scanner console, int bravery, int wisdom, int cunning, int loyalty) {
			//Ask user the question
			System.out.println("If you could create a new potion that would give you one thing, what would you choose?");
			System.out.println("A. Love");
			System.out.println("B. Wisdom");
			System.out.println("C. Glory");
			System.out.println("D. Power");
			
			//Prompt for answer
			//Assign each choice to a house
			System.out.print("What is your answer?");
			String answer = console.next();
			
			while (!answer.equalsIgnoreCase("A")
				&& !answer.equalsIgnoreCase("B")
				&& !answer.equalsIgnoreCase("C")
				&& !answer.equalsIgnoreCase("D"))
			System.out.print("Enter A, B, C, or D");
			
			if (answer.equalsIgnoreCase("A")) {
				loyalty++; 
			} else if (answer.equalsIgnoreCase("B")) {
				wisdom++;
			} else if (answer.equalsIgnoreCase("C")) {
				bravery++;
			} else  {
				cunning++;
			} 
			//Pass variables to second question
			question2(console, bravery, wisdom, cunning, loyalty);
		}
		/**
		 * A method to ask the second question
		 * @param console Scanner to prompt for user input
		 * @param bravery principle trait of Gryffindor
		 * @param wisdom principle trait of Ravenclaw
		 * @param loyalty principle trait of Hufflepuff
		 * @param cunning principle trait of Slytherin
		 * @return void
		 */

		public static void question2(Scanner console, int bravery, int wisdom, int cunning, int loyalty) {
			//Ask user the question
			System.out.println("Which of these is the greatest insult?");
			System.out.println("A. Ignorant");
			System.out.println("B. Ordinary");
			System.out.println("C. Cowardly");
			System.out.println("D. Selfish");
			
			//Prompt for answer
			//Assign each choice to a house
			System.out.print("What is your answer?");
			String answer = console.next();
			if (answer.equalsIgnoreCase("A")) {
				wisdom++; 
			} else if (answer.equalsIgnoreCase("B")) {
				cunning++;
			} else if (answer.equalsIgnoreCase("C")) {
				bravery++;
			} else  {
				loyalty++;
			}
			//Pass variables to third question
			question3(console, bravery, wisdom, cunning, loyalty);
		}
		
		/**
		 * A method to ask the third question
		 * @param console Scanner to prompt for user input
		 * @param bravery principle trait of Gryffindor
		 * @param wisdom principle trait of Ravenclaw
		 * @param loyalty principle trait of Hufflepuff
		 * @param cunning principle trait of Slytherin
		 * @return void
		 */
		
		public static void question3(Scanner console, int bravery, int wisdom, int cunning, int loyalty) {
			//Ask user the question
			System.out.println("How would you like to be remembered in history?");
			System.out.println("A. Being good");
			System.out.println("B. Being wise");
			System.out.println("C. Being great");
			System.out.println("D. Being bold");
			
			//Prompt for answer
			//Assign each choice to a house
			System.out.print("What is your answer?");
			String answer = console.next();
			if (answer.equalsIgnoreCase("A")) {
				loyalty++; 
			} else if (answer.equalsIgnoreCase("B")) {
				wisdom++;
			} else if (answer.equalsIgnoreCase("C")) {
				cunning++;
			} else  {
				bravery++;
			}
			//Pass variables to fourth question
			question4(console, bravery, wisdom, cunning, loyalty);
		}
		
		/**
		 * A method to ask the fourth question
		 * @param console Scanner to prompt for user input
		 * @param bravery principle trait of Gryffindor
		 * @param wisdom principle trait of Ravenclaw
		 * @param loyalty principle trait of Hufflepuff
		 * @param cunning principle trait of Slytherin
		 * @return void
		 */
		
		public static void question4(Scanner console, int bravery, int wisdom, int cunning, int loyalty) {
			//Ask user the question
			System.out.println("You and two friends need to cross a bridge gaurded by a river troll who "
					+ "instists on fighting one of you before he will let you pass. Do you:");
			System.out.println("A. Attempt to confuse the troll into letting all three of you pass without fighting");
			System.out.println("B. Suggest drawing lots to decide who will fight");
			System.out.println("C. Suggest that all three of you fight (Without telling the troll)");
			System.out.println("D. Volunteer to fight");
			
			//Prompt for answer
			//Assign each choice to a house
			System.out.print("What is your answer?");
			String answer = console.next();
			if (answer.equalsIgnoreCase("A")) {
				wisdom++; 
			} else if (answer.equalsIgnoreCase("B")) {
				loyalty++;
			} else if (answer.equalsIgnoreCase("C")) {
				cunning++;
			} else  {
				bravery++;
			}
			//Pass variables to fifth question
			question5(console, bravery, wisdom, cunning, loyalty);
		}
		
		/**
		 * A method to ask the fifth question
		 * @param console Scanner to prompt for user input
		 * @param bravery principle trait of Gryffindor
		 * @param wisdom principle trait of Ravenclaw
		 * @param loyalty principle trait of Hufflepuff
		 * @param cunning principle trait of Slytherin
		 * @return void
		 */
		
		public static void question5(Scanner console, int bravery, int wisdom, int cunning, int loyalty) {
			//Ask user the question
			System.out.println("You are walking alone and you hear a sound. What do you do?");
			System.out.println("A. Tread cautiously with your hand on your concealed wand");
			System.out.println("B. Retreat and wait for the source of the sound to reveal itselt while mentally going over defensive spells");
			System.out.println("C. Draw your wand and stand your ground");
			System.out.println("D. Seek out the source of the sound");
			
			//Prompt for answer
			//Assign each choice to a house
			System.out.print("What is your answer?");
			String answer = console.next();
			if (answer.equalsIgnoreCase("A")) {
				loyalty++; 
			} else if (answer.equalsIgnoreCase("B")) {
				wisdom++;
			} else if (answer.equalsIgnoreCase("C")) {
				cunning++;
			} else  {
				bravery++;
			}
			//Pass variables to result method
			result(bravery, wisdom, cunning, loyalty);
		}
		
	    //Sorting
		//Printed statements for house assignments are (slightly modified) excerpts from the Sorting Hat's Song
		
		/**
		 * A method to sort the user into the appropriate house
		 * @param bravery principle trait of Gryffindor
		 * @param wisdom principle trait of Ravenclaw
		 * @param loyalty principle trait of Hufflepuff
		 * @param cunning principle trait of Slytherin
		 * @return void
		 */
		
		public static void result(int bravery,int wisdom,int cunning,int loyalty) {
		
		if (bravery > wisdom && bravery > cunning && bravery > loyalty) {
			System.out.println("You belong in Gryffindor, Where dwell the brave of heart. "
					+ "Their daring, nerves, and chivalry set Gryffindors apart.");
	 } else if (cunning > bravery && cunning > wisdom && cunning > loyalty) {
			System.out.println("For you it is in Slytherin you'll make your real friends. "
					+ "Those cunning folk use any means to acheive their ends.");
	 } else if (wisdom > cunning && wisdom > bravery && wisdom > loyalty) {
		 	System.out.println("You'll thrive in wise old Ravenclaw, if you've a ready mind. "
		 			+ "Where those of wit and learning will always find their kind.");
	 } else if (loyalty > cunning && loyalty > wisdom && loyalty > bravery) {
		 System.out.println("You belong in Hufflepuff, where they are just and loyal. "
		 		+ "Those patient Hufflepuffs are true and unafraid of toil.");
	 } else
		 System.out.println("You do not clearly fit into any particular house");
	}
}
		
		


