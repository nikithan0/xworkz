public class LoopAMethod{
	public static void main(String[] args){
		String[] names = {"Emi","Alena","Gracy","Taylor", "Christy","Marium","Adel"};
		char[] symbolsOfElements = {'H', 'B', 'C', 'N', 'O', 'F', 'K', 'P', 'S'};
		short[] CostMaybe = {1000, 1500, 2000, 2500,3000, 10000, 15000, 20000};
		
		for(int i=0; i<=6; i++){
			System.out.println(names[i]);
		};
		
		for(int j=0; j<=8; j++){
			System.out.println(symbolsOfElements[j]);
		}
		
		Method.bookPage = 100;
		Method.percentage = 87.99F ;
		Method.fees = 20000;
		Method.grade ='A';
		String tree = "Coconut";
		
		
		if(Method.bookPage==100){
		System.out.println("This is true");
	}
	else{
		System.out.println("This is false");
	}
	
	
	if (Method.percentage!=87.99F){
		System.out.println("This is true");
	}
	else{
		System.out.println("This is false");
	}
	
	if(Method.fees==5000){
		System.out.println("This is true");
	}
	else{
		System.out.println("This is false");
	}
		
		if(16*2==32){
			System.out.println("This is true");
		}
		else{
			System.out.println("This is false");
		}
		
		if(tree!="coconut"){
			System.out.println("This is true");
		}
		else{
			System.out.println("This is false");
		}
}	
	public static class Method {
		
		
		static byte bookPage;
		static float percentage = 87.99F;
		static short fees = 20000;
		static char grade = 'A';
		}	
}