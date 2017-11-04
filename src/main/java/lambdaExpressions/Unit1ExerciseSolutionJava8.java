package lambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("Ram", "Kumar", 32), new Person("Shyam", "Sharma", 34),
				new Person("Ramesh", "Varma", 35), new Person("Peter", "Gupta", 45));

		// Step 1 - Sort list by lastName
		Collections.sort(personList, (p1, p2) ->  p1.getLastName().compareTo(p2.getLastName()));

		// Step 2 - Create a method that print all elements in the List
		System.out.println("###### Create a method that print all elements in the List");
		printConditionaly(personList, p -> true);

		// Step 3 - Print all person whose first starting with 'R'
		System.out.println("\n###### Print all person whose first starting with 'R'");
		printConditionaly(personList, p -> p.getFirstName().startsWith("R"));

		// Step 4 - Print all person whose last name starting with 'G'
		System.out.println("\n###### Print all person whose last name starting with 'G'");
		printConditionaly(personList, p -> p.getFirstName().startsWith("G"));

	}


	private static void printConditionaly(List<Person> personList, Condition condition) {
		for (Person p : personList) {
			if (condition.test(p))
				System.out.println(p.toString());
		}
	}

}

