public class ConstructorProgram{
	
	public ConstructorProgram(){
		
		System.out.println("Constructor Program");
	}
	
	public ConstructorProgram(String land){
		this('A');
		System.out.println("Parameter of naming");
	}
	
	public ConstructorProgram(float marks){
		this(true);
		System.out.println("Calling Value");
	}
	
	public ConstructorProgram(char grade){
		this(99.77f);
		System.out.println("Total effort");
	}
	
	public ConstructorProgram(boolean statement){
		this();
		System.out.println("The statement maybe true");
	}
	
	public static void main(String[] args){
		ConstructorProgram thing = new ConstructorProgram("Subject");
		}
}