/**
 * A quiz to determine which Hogwarts house you belong in
 */
	import java.util.*;

/**
 * @author ruthcanavan
 *
 */
public class Project2 {

	/**
	 *@see http://www.gotoquiz.com/pottermore_sorting_hat_quiz_2 for questions
	 * @param args
	 * @param bravery, principle trait of Gryffindor
	 * @param wisdom, principle trait of Ravenclaw
	 * @param loyalty, principle trait of Hufflepuff
	 * @param cunning, principle trait of Slytherin
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

		public static void question1(Scanner console, int bravery, int wisdom, int cunning, int loyalty) {
			System.out.println("If you could create a new potion that would give you one thing, what would you choose?");
			System.out.println("a. Love");
			System.out.println("b. Wisdom");
			System.out.println("c. Glory");
			System.out.println("d. Power");
			
			//Prompt for answer
			//Assign each choice to a house
			System.out.print("What is your answer?");
			String s = console.next();
			if (s.equals("a")) {
				loyalty++; 
			} else if (s.equals("b")) {
				wisdom++;
			} else if (s.equals("c")) {
				bravery++;
			} else  {
				cunning++;
			} 
			//Pass variables to second question
			question2(console, bravery, wisdom, cunning, loyalty);
		}
	

		public static void question2(Scanner console, int bravery, int wisdom, int cunning, int loyalty) {
			System.out.println("Which of these is the greatest insult?");
			System.out.println("a. Ignorant");
			System.out.println("b. Ordinary");
			System.out.println("c. Cowardly");
			System.out.println("d. Selfish");
			
			//Prompt for answer
			//Assign each choice to a house
			System.out.print("What is your answer?");
			String s = console.next();
			if (s.equals("a")) {
				wisdom++; 
			} else if (s.equals("b")) {
				cunning++;
			} else if (s.equals("c")) {
				bravery++;
			} else  {
				loyalty++;
			}
			//Pass variables to third question
			question3(console, bravery, wisdom, cunning, loyalty);
		}
		
		public static void question3(Scanner console, int bravery, int wisdom, int cunning, int loyalty) {
			System.out.println("How would you like to be remembered in history?");
			System.out.println("a. Being good");
			System.out.println("b. Being wise");
			System.out.println("c. Being great");
			System.out.println("d. Being bold");
			
			//Prompt for answer
			//Assign each choice to a house
			System.out.print("What is your answer?");
			String s = console.next();
			if (s.equals("a")) {
				loyalty++; 
			} else if (s.equals("b")) {
				wisdom++;
			} else if (s.equals("c")) {
				cunning++;
			} else  {
				bravery++;
			}
			//Pass variables to fourth question
			question4(console, bravery, wisdom, cunning, loyalty);
		}
		
		public static void question4(Scanner console, int bravery, int wisdom, int cunning, int loyalty) {
			System.out.println("You and two friends need to cross a bridge gaurded by a river troll who "
					+ "instists on fighting one of you before he will let you pass. Do you:");
			System.out.println("a. Attempt to confuse the troll into letting all three of you pass without fighting");
			System.out.println("b. Suggest drawing lots to decide who will fight");
			System.out.println("c. Suggest that all three of you fight (Without telling the troll)");
			System.out.println("d. Volunteer to fight");
			
			//Prompt for answer
			//Assign each choice to a house
			System.out.print("What is your answer?");
			String s = console.next();
			if (s.equals("a")) {
				wisdom++; 
			} else if (s.equals("b")) {
				loyalty++;
			} else if (s.equals("c")) {
				cunning++;
			} else  {
				bravery++;
			}
			//Pass variables to fifth question
			question5(console, bravery, wisdom, cunning, loyalty);
		}
		
		public static void question5(Scanner console, int bravery, int wisdom, int cunning, int loyalty) {
			System.out.println("You are walking alone and you hear a sound. What do you do?");
			System.out.println("a. Tread cautiously with your hand on your concealed wand");
			System.out.println("b. Retreat and wait for the source of the sound to reveal itselt while mentally going over defensive spells");
			System.out.println("c. Draw your wand and stand your ground");
			System.out.println("d. Seek out the source of the sound");
			
			//Prompt for answer
			//Assign each choice to a house
			System.out.print("What is your answer?");
			String s = console.next();
			if (s.equals("a")) {
				loyalty++; 
			} else if (s.equals("b")) {
				wisdom++;
			} else if (s.equals("c")) {
				cunning++;
			} else  {
				bravery++;
			}
			//Pass variables to result method
			result(console, bravery, wisdom, cunning, loyalty);
		}
		
	    //Sorting
		//Printed statements are (slightly modified) excerpts from the Sorting Hat's Song
		public static void result(Scanner console,int bravery,int wisdom,int cunning,int loyalty) {
		
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
		
		


