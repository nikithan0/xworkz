public class Institute{
	public Institute(){
		System.out.println("In other area");
	}
	
	public Institute(String city){
		System.out.println("Institute name");
	}
	
	public Institute(int number){
		System.out.println("Call number");
	}
	
	public Institute(float score){
		System.out.println("Total score");
	}
	
	public Institute(boolean about){
		System.out.println("The Institute is good");
	}
	
	
	public static void main(String[] args){
		
		Institute area = new Institute();
		
		Institute city = new Institute("Mumbai");
		
		Institute number = new Institute(34848);
		
		Institute score = new Institute(81.33F);
		
		Institute about = new Institute(true);
	}
	
	
}