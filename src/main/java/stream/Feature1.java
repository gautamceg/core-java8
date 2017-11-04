package stream;

import java.util.Arrays;
import java.util.List;

public class Feature1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("A", 45 , "M");
		Person p2 = new Person("B", 42, "F");
		Person p3 = new Person("C", 85, "M");
		Person p4 = new Person("D", 65, "F");
		Person p5 = new Person("E", 25, "M");
		List<Person> people = Arrays.asList(p1,p2,p3,p4,p5);
		
		int oldest =0;
		//Get the oldest men age  Java7 
		for(Person p : people){
			if("M".equals(p.getGender())){
				int age = p.getAge();
				oldest = Math.max(oldest,age);
			}
		}
		System.out.println("Oldest Male age "+oldest);
		
		//Get the oldest men age  Java8
		int oldestJ8 = people.stream()
				.filter(p -> p.getGender() == "M")
				.mapToInt(p -> p.getAge())
				.max()
				.getAsInt();
		
		System.out.println("Oldest Male age- Java8: "+oldestJ8);

	}

}

class Person{
	private String name;
	private int age;
	private String gender;
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender =gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}