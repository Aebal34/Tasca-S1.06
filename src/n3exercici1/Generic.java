package n3exercici1;

public class Generic {

	public static <T extends Phone> void callPhoneMethods(T phone){
		
		phone.call();
		phone.photo();
	}
	
	public static <T extends Smartphone> void callSmartphoneMethods(T smartPhone) {
		
		smartPhone.call();
		smartPhone.photo();
	}
}
