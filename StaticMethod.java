public class StaticMethod{
	public static void main(String[] args){
		
		StaticDone.call();
		StaticDone.read();
		
		StaticDone fact = new StaticDone();
		System.out.println(fact.salary);
		System.out.println(fact.city);
		System.out.println(fact.students);
		
		
		System.out.println(StaticDone.people);
		System.out.println(StaticDone.fruitsRate);
		System.out.println(StaticDone.statement);
		System.out.println(StaticDone.elements);
		System.out.println(StaticDone.fees);
	}
	
	public static class StaticDone{
		static int people;
		static byte fruitsRate;
		static boolean statement;
		static char elements;
		static short fees;
		float salary=2.8F;
		int students=40000;
		String city = "Shivamogga";
		
		static{
			people = 1500;
			fruitsRate=100;
			statement=true;
			elements='N';
			fees=20000;
		}
		
		public StaticDone(){
			System.out.println("Make a decion");
		}
		public static void call(){
			System.out.println("Call her");
		}
		public static void read(){
		System.out.println("Read news");
		}
	}
	
}
