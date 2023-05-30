package n2exercici2;

public class GenericMethods<T> {

	public static <T> void printObjects(T... objects) {
		
		for(int i = 0; i<objects.length; i++) {
			
			System.out.println(objects[i]);
		}
	}
	
	public static <T extends Iterable<?>> void printObjects2(T list) {
		
		for(Object element : list) {
			
			System.out.println(element);
		}
	}
}
