public class MethodOverloading{
	public static void main(String[] args){
		
		university();
			
		short priceExpected = 10000;
		company(100, 1.65F, 78655L, priceExpected);
		
		call(7387L, 2.20F, 53689, "Tumkur");
	}
	
		public static void university(){
			System.out.println("Kuvempu University");
		};
		
	public static void university(String name){
		System.out.println("Banglore University");
	};
	
	public static void university(String names, int value){
		System.out.println("Christ University");
	};
	
	public static void university(String naming, int strenght, long measure){
		System.out.println("Delhi University");
	};
	
	public static void university(String mention, char grade, int clsStrength, float percentage){
		System.out.println("Anna University");
	};
	
	//using datatypes 
	
	public static void company(){
		System.out.println("Mumbai Porter");
	}
	 
	public static void company(String name){
		System.out.println("Sony Company");
	}
	
	public static void company(String names, int peoples){
		System.out.println("Google Company");
	}
	
	public static void company(String naming, long workers, byte service){
		System.out.println("Amazon shopping");
	}
	
	public static void company(int costFrom, float salary, long customer, short priceExpected){
		System.out.println("Flipkart");
	}
	
	//changing order
	
	public static void call(String name, int number, short value, double score){
		System.out.println("Call Selena");
	}
	
	public static void call(int value, short people, double percentage, String place){
		System.out.println("Calling a person");
	}
	
	public static void call(short fare, int count, String area, double permitivity){
		System.out.println("value of permitivity");
	}
	
	public static void call(long number, String city, int members, float interest){
		System.out.println("Call her name");
	}
	
	public static void call(long number, float interest, int count, String city){
		System.out.println("Do call");
	}
}