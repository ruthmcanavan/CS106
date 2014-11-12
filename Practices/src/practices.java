import java.util.*;
/**
 * 
 */

/**
 * @author ruthcanavan
 *
 */
public class practices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("");
		
		Iterator<String> i = list.iterator(); 
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("");
	
	LinkedList<String> myList = new LinkedList<String>();
	myList.add("D");
	myList.add("C");
	myList.add("B");
	myList.add("A");
	
	for (String a : myList) {
		System.out.println(a);
	}
	System.out.println("");
	
	Iterator<String> b = myList.iterator(); 
	while (b.hasNext()) {
		System.out.println(b.next());
	}
	System.out.println("");
		
	TreeSet<String> mySet = new TreeSet<String>();
	mySet.add("A");
	mySet.add("B");
	mySet.add("A");
	mySet.add("C");
	
	for (String c : mySet) {
		System.out.println(c);
	}
	System.out.println("");
	
	Iterator<String> d = mySet.iterator(); 
	while (d.hasNext()) {
		System.out.println(d.next());
	}
	
	}
}


