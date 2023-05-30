package n1exercici1;

public class NoGenericMethods<T> {

	//ATTRIBUTES
	private T o1;
	private T o2;
	private T o3;
	
	//CONSTRUCTOR
	public NoGenericMethods(T o1, T o2, T o3) {
		this.o1 = o1;
		this.o2 = o2;
		this.o3 = o3;
	}
	
	//GETTERS & SETTERS
	public T getO1() {
		return o1;
	}
	public void setO1(T o1) {
		this.o1 = o1;
	}
	public T getO2() {
		return o2;
	}
	public void setO2(T o2) {
		this.o2 = o2;
	}
	public T getO3() {
		return o3;
	}
	public void setO3(T o3) {
		this.o3 = o3;
	}
}
