public class StaticProgram{
	public static void main(String[] args){
		
		Program subject = new Program();
		System.out.println(subject.animal);
		System.out.println(subject.number);
		System.out.println(subject.packets);
		System.out.println(subject.vitamin);
		System.out.println(subject.value);

		System.out.println(Program.company);
		System.out.println(Program.amount);
		System.out.println(Program.factsMayBe);
		System.out.println(Program.potassiumSymbol);
		System.out.println(Program.counts);
	}
		
		public static class Program{
		
		public Program(){
			System.out.println("Calling a people");
		}
		String animal = "Lion";
		short number = 25000;
		byte packets = 67;
		char vitamin = 'D';
		int value = 5265;
		static String company = "Orchid";
		static int amount = 1500;
		static boolean factsMayBe = true;
		static char potassiumSymbol = 'K'; 
		static long counts = 1234L;
		
		
	}
		
}