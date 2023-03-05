public class ArrayLoop {
	public static void main(String[] arg){
		int[] registerNumbers = {2011001,1011002,3011003,3011005,4011005,3011006,7011008,9011364};
		long[] vehicleNumbers = {201452L,201565L,201179L,201389L,201953L,202388L,202377L,201199};
		float[] heightOfHuman = {3.6510F,6.0000F,6.1200F,5.7512F,4.1430F,4.1200F,6.5200F,5.4200F};
		double[] percentageInSujects ={55.5400D,72.77D,85.78D,89.10D,99.76D,94.12D,80.35D,68.66D} ;
		boolean[] statements = {true,true,false,true,false,true,false,true};
        char[] anyAlphabets = {'A', 'G', 'N', 'I', 'P', 'J', 'D', 'L' };
		
		for(int i=0; i<=7; i++){
			System.out.println(registerNumbers[i]);
		};
		
    System.out.println(vehicleNumbers[7]);
	System.out.println(heightOfHuman[6]);
	System.out.println(percentageInSujects[3]);
	System.out.println(statements[3]);
	System.out.println(anyAlphabets[5]);
	}
}