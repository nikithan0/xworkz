public class Parameters{
	public static void main(String[] args){
		 firstAdding(20);
		 
		 secondAdding(10, "Zoe");
		 
		 thirdAdding (20000, "Beast", 75.789F);
		 
		 fourthAdding(64567L, true, 'b', "Realme");
	}
	
	public static int firstAdding(int value){
		System.out.println(30);
		return 1000;
	}
	
	public static short secondAdding(int cost, String cat){
		System.out.println(cost);
		System.out.println(cat);
		return 200;
	}
	
	public static String thirdAdding(int fare, String movie, float marks){
		System.out.println(fare);
		System.out.println(movie);
		System.out.println(marks);
		return "movie";
	}
	
	public static char fourthAdding(long bookNum, boolean statement, char options, String cellName){
		System.out.println(bookNum);
		System.out.println(statement);
		System.out.println(options);
		System.out.println(cellName);
		return 'a';
	}
}