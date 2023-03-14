public class ParametersTest{
	public static void main(String[] args){
		call();
		call("Elizabeth", 1678 );
		
		short price = 3000;
		call(price, true);
		
		long regNo = 657L;
		call(657L , "Mysore");
		
		
		call("Manglore", 34223L);
		float marks = 87.76F;
		call('A', 87.76F);
	}
	
	public static void call(){
		System.out.println("Callind one");
	}
	
	public static void call(String name, int value){
		System.out.println("Calling a person");
	}
	
	public static void call(short price, boolean statemnts){
		System.out.println("Run a method");
	}
	
	public static void call(long regNo, String city){
		System.out.println("Call her name");
	}
	
	public static void call(String city, long regNo ){
		System.out.println("Think about efforts");
	}
	
	public static void call(char vitamin, float marks){
		System.out.println("Flower");
	}
}