package n1exercici1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NoGenericMethods<String> test = new NoGenericMethods<String>("segundo", "primero", "tercero");
		
		NoGenericMethods<Integer> test2 = new NoGenericMethods<Integer>(3, 2, 1);
		
		System.out.println(test2.getO2());
		
		System.out.println(test.getO3());
	}

}
