public class ReturnType{
	public static void main(String[] args){
		byte numBooks = books();
		System.out.println(numBooks);
		
		short count = countShort();
		System.out.println(count);
		
		int fees = totalFees();
		System.out.println(fees);
		
		long account = accountName();
		System.out.println(account);
		
		float totalCurrency = currency();
		System.out.println(totalCurrency);
		
		double water = percentage();
		System.out.println(water);
		
		boolean correction = correcting();
		System.out.println(correction);
		
		char totalGrade = grade();
		System.out.println(totalGrade);
	 
	    String placeName = place();
		System.out.println(placeName);
	}
	public static byte books(){
		byte num = 50;
		return num;
	}
	
	public static short countShort(){
		short count = 2000;
		return count;
	}
	
	public static int totalFees(){
		int value = 20000;
		return value;
	}
	
	public static long accountName(){
		long total = 10878787;
		return total;
	}
	
	public static float currency(){
		float totalCurrency = 75.8765f;
		return totalCurrency;		
	}
	
	public static double percentage(){
		double prcnt = 71.00111;
		return 71.00111;
	}
	
	public static boolean correcting(){
		boolean statement = false;
		return statement;
	}
	
	public static char grade(){
		char grd = 'A';
		return grd;
	}
	
	public static String place(){
		String somePlace = "Hsnr";
		return somePlace;
	}
}
