package n2exercici2;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		//Method 1
		GenericMethods.printObjects(new Person("Jordi", "Gonzalez", 30), "Estudiante", "true");
		
		GenericMethods.printObjects(new Person("Jordi", "Gonzalez", 30),
									new Person("Juan", "Rodriguez", 25),
									new Person("Ana", "Garcia", 43),
									1, "String", true);
		
		System.out.println(); //So divide both method prints
		//Method 2
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Jordi", "Gonzalez", 30));
		persons.add(new Person("Juan", "Rodriguez", 25));
		persons.add(new Person("Ana", "Garcia", 43));
		persons.add(new Person("Maria", "Sastre", 51));
		
		List<Integer> integers = new LinkedList<Integer>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		
		GenericMethods.printObjects2(persons);
		GenericMethods.printObjects2(integers);
		
	}
}
