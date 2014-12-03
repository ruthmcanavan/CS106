/**
 * 
 */

/**
 * @author ruthcanavan
 *Determine if the subject is I or E
 */
public class introvertOrExtrovert {
	//declare variables
	int introversion = 0;
	int extroversion = 0; {
	
	//1. I feel comfortable being alone
		if (anwser = true){
			introversion++;
		} else {
			introversion--;
		}
	
	//2. I have a wide range of friends and know lots of people
		if (anwser = true){
			extroversion++;
		} else {
			extroversion--;
		}
	
	//3. I sometimes spend too much time reflecting and don't move into action quickly enough
		if (anwser = true){
			introversion++;
		} else {
			introversion--;
		}
	
	//4. I like to work in groups
		if (anwser = true){
			extroversion++;
		} else {
			extroversion--;
		}
	
	//5. I prefer to know just a few people well
		if (anwser = true){
			introversion++;
		} else {
			introversion--;
		}
	
	//6. I am seen as outgoing or as a people person
		if (anwser = true){
			extroversion++;
		} else {
			extroversion--;
		}
	
	//7. I like things I can do on my own
		if (anwser = true){
			introversion++;
		} else {
			introversion--;
		}
	
	//8. I feel comfortable in crowds
		if (anwser = true){
			extroversion++;
		} else {
			extroversion--;
		}
	
	//9. I am seen as reflective or reserved
		if (anwser = true){
			introversion++;
		} else {
			introversion--;
		}
	
	//10. i sometimes jump too quickly into activity and don't allow enough time to think it over
		if (anwser = true){
			extroversion++;
		} else {
			extroversion--;
		}
		
		if(introversion > extroversion) {
			return introversion;
		}else if(extroversion > introversion) {
			return extroversion;
		}else
			return null;
		
}
}
