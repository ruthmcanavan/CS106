/**
 * 
 */

/**
 * @author ruthcanavan
 * Determine if the subject is S or N
 */
public class sensingOrIntuition {
	//declare variables
	int sensing = 0;
	int intuition = 0; {
	
	//11. I solve problems by working through facts until I understand the problem 
		if (anwser = true){
			sensing++;
		} else {
			sensing--;
		}
	
	//12. I trust impressions, symbols, and metaphors more than what I actually experienced 
		if (anwser = true){
			intuition++;
		} else {
			intuition--;
		}
	
	//13. I am pragmatic and look to the "bottom line"   
		if (anwser = true){
			sensing++;
		} else {
			sensing--;
		}
	
	//14. Sometimes I think so much about new possibilities that I never look at how to make them a reality 
		if (anwser = true){
			intuition++;
		} else {
			intuition--;
		}
	
	//15. I remember events as snapshots of what actually happened 
		if (anwser = true){
			sensing++;
		} else {
			sensing--;
		}
	
	//16. I am interested in doing things that are new and different 
		if (anwser = true){
			intuition++;
		} else {
			intuition--;
		}
	
	//17. I trust experience first and trust words and symbols less 
		if (anwser = true){
			sensing++;
		} else {
			sensing--;
		}
	
	//18. I start with facts and then form a big picture 
		if (anwser = true){
			sensing++;
		} else {
			sensing--;
		}
	
	//19. I solve problems by leaping between different ideas and possibilities 
		if (anwser = true){
			intuition++;
		} else {
			intuition--;
		}
	
	//20. I like to see the big picture, then to find out the facts 
		if (anwser = true){
			intuition++;
		} else {
			intuition--;
		}
	
	//21. Sometimes I pay so much attention to facts that I miss new possibilities 
		if (anwser = true){
			sensing++;
		} else {
			sensing--;
		}
	
	//22. I remember events by what I read "between the lines" about their meaning 
		if (anwser = true){
			intuition++;
		} else {
			intuition--;
		}
		
		//Determine whether subject is N or S and print results
		if(intuition > sensing) {
			System.out.print(" N");
		}else if(sensing > intuition) {
			System.out.print(" S");
		}else  //Print X if subject's N score equals their  score
			System.out.print(" X");
}
}
