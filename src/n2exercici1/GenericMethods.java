package n2exercici1;

public class GenericMethods<T, S> {

	public static <T, S> void printObjects(T o1, S o2, String word) {
		
		System.out.println("Elemento 1: "+o1+"\n"+
						   "Elemento 2: "+o2+"\n"+
						   "Elemento 3: "+word);
	}
}
