public class VariablesMethod{
	
	String petName;
	int value;
	short fees;
	byte count;
	long population;
	String bike;
	float interest;
	double percentage;
	boolean statement;
	char option;
	
	public VariablesMethod(){
	System.out.println("Default constructor");	
	}
	public VariablesMethod(String petName){
		this.petName=petName;
		System.out.println(petName);
		
	}
	public VariablesMethod(String petName, int value){
		this.petName=petName;
		this.value=value;
		System.out.println(petName);
		System.out.println(value);
	}
	public VariablesMethod(String petName, int value, short fees){
		this.petName=petName;
		this.value=value;
	    this.fees=fees;
		System.out.println(petName);
		System.out.println(value);
        System.out.println(fees);
	}
	public VariablesMethod(String petName, int value, short fees, byte count){
		this.petName=petName;
		this.value=value;
	    this.fees=fees;
		this.count=count;
		System.out.println(petName);
		System.out.println(value);
        System.out.println(fees);
		System.out.println(count);
	}
	public VariablesMethod(String petName, int value, short fees, byte count, long population){
		this.population=population;
		System.out.println(population);
	}
	public VariablesMethod(String petName, int value, short fees, byte count, long population, String bike){
		this.bike=bike;
		System.out.println(bike);
	}
	public VariablesMethod(String petName, int value, short fees, byte count, long population, String bike, float interest){
		this.interest=interest;
		System.out.println(interest);
	}
	public VariablesMethod(String petName, int value, short fees, byte count, long population, String bike, float interest, double percentage){
		this.percentage=percentage;
		System.out.println(percentage);
	}
	public VariablesMethod(String petName, int value, short fees, byte count, long population, String bike, float interest, double percentage, boolean statement){
		this.statement=statement;
		System.out.println(statement);
	}
	public VariablesMethod(String petName, int value, short fees, byte count, long population, String bike, float interest, double percentage, boolean statement, char option){
		
		this.option=option;
		System.out.println(option);
	}
	
	public static void main(String[] args){
		VariablesMethod method = new VariablesMethod();
		VariablesMethod methodOne = new VariablesMethod("Scooby");
		VariablesMethod methodTwo = new VariablesMethod("Scooby",3455);
		VariablesMethod methodThree = new VariablesMethod("Scooby",3455,(short)20000);
		VariablesMethod methodFour = new VariablesMethod("Scooby",3455,(short)20000,(byte)100);
		VariablesMethod methodFive = new VariablesMethod("Scooby",3455,(short)20000,(byte)100, 677777L);
		VariablesMethod methodSix = new VariablesMethod("Scooby",3455,(short)20000,(byte)100,677777L,"KTM");
		VariablesMethod methodSeven = new VariablesMethod("Scooby",3455,(short)20000,(byte)100,677777L,"KTM",5.88F);
		VariablesMethod methodEight = new VariablesMethod("Scooby",3455,(short)20000,(byte)100,677777L,"KTM",5.88F,87.99D);
		VariablesMethod methodNine = new VariablesMethod("Scooby",3455,(short)20000,(byte)100,677777L,"KTM",5.88F,87.99D,true);
		VariablesMethod methodTen = new VariablesMethod("Scooby",3455,(short)20000,(byte)100,677777L,"KTM",5.88F,87.99D,true,'C');
	}
}