package n2exercici2;

public class Person {

	//ATTRIBUTES
	private String name;
	private String surname;
	private int age;
	
	//CONSTRUCTOR
	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname=surname;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}
}
