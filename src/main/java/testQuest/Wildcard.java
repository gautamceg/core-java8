package testQuest;

import java.util.*; 
public class Wildcard {
	public void showSize(List<?> list) {
		System.out.println(list.size());
	} 
	public static void main(String [] args) {
		Wildcard card = new Wildcard();
		//List<?> list = new ArrayList();
		 //List list = new LinkedList();
		 //ArrayList<? super Date> list = new ArrayList(); 
		Vector<? extends Number> list = new Vector();
		card.showSize(list);
		
	}

}
