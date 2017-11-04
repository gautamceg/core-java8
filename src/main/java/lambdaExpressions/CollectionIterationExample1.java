package lambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample1 {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("Ram", "Kumar", 32),
				new Person("Shyam", "Sharma", 34),
				new Person("Ramesh", "Varma", 35),
				new Person("Peter", "Gupta", 45));
		
		//for loop
		System.out.println("for loop");
		for(int i=0; i < personList.size(); i++)
			System.out.println(personList.get(i));
		
		//for-in loop
		System.out.println("\nfor-in loop");
		for(Person p : personList)
			System.out.println(p);
		
		//for-each loop
		System.out.println("\for-each loop");
		personList.forEach(p -> System.out.println(p));
		
		//for-each loop with method reference
		System.out.println("\nfor-each loop with method reference");
		personList.forEach(System.out :: println);

	}

}
