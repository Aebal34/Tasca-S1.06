package n2exercici1;

public class App {

	public static void main(String[] args) {
		
		GenericMethods.printObjects(new Person("Jordi", "Gonzalez", 30), "Estudiante", "true");
		
		GenericMethods.printObjects(new Person("Alba", "Larren", 39), 1500, "Sueldo");
		
	}
}
