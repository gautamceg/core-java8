package stream;

import java.util.Arrays;
import java.util.List;

import lambdaExpressions.Person;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
										new Person("Ram", "Kumar", 32),
										new Person("Shyam", "Sharma", 34),
										new Person("Ramesh", "Varma", 35),
										new Person("Peter", "Gupta", 45));
		
		personList.stream()
		.filter((p) -> p.getFirstName().startsWith("R"))
		.forEach(p -> System.out.println(p));
		
		 long count = personList.stream()
		.filter((p) -> p.getLastName().startsWith("G"))
		.count();
		 
		 System.out.println("\ncount: "+count);
		

	}

}
