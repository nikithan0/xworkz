public class ReturnTypeTest{
	 public static void main(String[] args){
		 
		 int priceOfThing =  price();
		 System.out.println(priceOfThing);
		 
		 byte studentsNo = number();
		 System.out.println(studentsNo);
		 
		 float resultMayBe = result();
		 System.out.println(resultMayBe);
		 
		 boolean statementIs = write();
		 System.out.println(statementIs);
		 
		 long phoneNumber = integer();
		 System.out.println(phoneNumber);
		 
	 }
	 
	 public static int price(){
	 int number  = 546;
	 return number;
	 }
	 
	 public static byte number(){
		byte count = 100;
		return count;
	 }
	 
	 public static float result(){
		 float score = 87.78F;
		 return score;
	 }
	 
	 public static boolean write(){
		 boolean value = true;
		 return value;
	 }
	 
	 public static long integer(){
		 long number = 201952;
		 return number;
	 }
	 
}