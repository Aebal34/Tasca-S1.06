package n1exercici2;

public class GenericMethods<T, S, V> {

	public static <T, S, V> void printObjects(T o1, S o2, V o3) {
		
		System.out.println("Elemento 1: "+o1+"\n"+
						   "Elemento 2: "+o2+"\n"+
						   "Elemento 3: "+o3);
	}
}
