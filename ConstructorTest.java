public class ConstructorTest{
	
	public ConstructorTest(){
	System.out.println("First method name");
	}
	
	public ConstructorTest(String message){
		this(67.99F);
		System.out.println("Second method name");
	}
	
	public ConstructorTest(float percentage){
		this('a');
		System.out.println("Third method name");
	}
	
	public ConstructorTest(boolean defaultValue){
		this();
		System.out.println("Fourth method name");
	}
	
	public ConstructorTest(char grade){
		this(true);
		System.out.println("Fifth method name");
	}
	
	public static void main(String[] args){
		ConstructorTest subject = new ConstructorTest("Hello");
	}
}