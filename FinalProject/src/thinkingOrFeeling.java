/**
 * 
 */

/**
 * @author ruthcanavan
 *Determine if the subject is T or F
 */
public class thinkingOrFeeling {
	//declare variables
	int thinking = 0;
	int feeling = 0; {
	
	//1. I enjoy technical and scientific fields where logic is important 
		if (anwser = true){
			thinking++;
		} else {
			thinking--;
		}
	
	//2. I make decisions with my heart and want to be compassionate 
		if (anwser = true){
			feeling++;
		} else {
			feeling--;
		}
	
	//3. I look for logical explanations or solutions to most everything 
		if (anwser = true){
			thinking++;
		} else {
			thinking--;
		}
	
	//4. Others sometimes see me as too idealistic, mushy, or indirect 
		if (anwser = true){
			feeling++;
		} else {
			feeling--;
		}
	
	//5. I make decisions with my head and want to be fair 
		if (anwser = true){
			thinking++;
		} else {
			thinking--;
		}
	
	//6. I believe being tactful is more important than telling the cold truth 
		if (anwser = true){
			feeling++;
		} else {
			feeling--;
		}
	
	//7. I can be seen as too task-oriented, uncaring, or indifferent 
		if (anwser = true){
			thinking++;
		} else {
			thinking--;
		}
	
	//8. I have a people or communications orientation 
		if (anwser = true){
			feeling++;
		} else {
			feeling--;
		}
	
	//9. I believe telling the truth is more important than being tactful 
		if (anwser = true){
			thinking++;
		} else {
			thinking--;
		}
	
	//10. I am concerned with harmony and nervous when it is missing 
		if (anwser = true){
			feeling++;
		} else {
			feeling--;
		}
	
	//11. I look for what is important to others and express concern for others 
		if (anwser = true){
			feeling++;
		} else {
			feeling--;
		}
	
	//12. Sometimes I miss or don't value the "people" part of a situation 
		if (anwser = true){
			thinking++;
		} else {
			thinking--;
		}
		
		if(thinking > feeling) {
			return thinking;
		}else if(feeling > thinking) {
			return feeling;
		}else
			return null;
		
}
}
