public class Physics{
	
	String subject = "Subject physics";
	String subject1 = "Maths";
	char symbolOfVelocity = 'V';
	String wireMeasureBy = "Screw Gauge";
	int numberOfPlanets = 8;
    float gravitationalForce = 9.8F;
	static char unitJouleDenotesIn = 'J';
	static float protonMass = 1.672F;
	static String auroraAlsoIs = "Polar Lights";
	static double chargeOfElectron = 1.60217663D;
	static double eulersNumber = 2.71828d;
	final String propertyOfLiquidIs = "Viscosity";
	final String water = "Liquid";
	final double plancksConstant = 6.626F;
	final char symbolOfMass = 'M';
	final static boolean sunIsAStar = true;
	final double rydbergConstant = 10.9737D;
	//Radiations typesOfIonisingRadiations;
	//Law newtonsLawsOfMotion;
	//Decay threeTypesOfDecay;
	//Reaction nuclearReactions;
	//Laws thermodynamicsLaws;
	
		//public Physics(Radiations typesOfIonisingRadiations,Law newtonsLawsOfMotion,Decay threeTypesOfDecay,Reaction nuclearReactions,Laws thermodynamicsLaws){
			//this.typesOfIonisingRadiations = typesOfIonisingRadiations;
			//this.newtonsLawsOfMotion = newtonsLawsOfMotion;
			//this.threeTypesOfDecay = threeTypesOfDecay;
			//this.nuclearReactions = nuclearReactions;
			//this.thermodynamicsLaws = thermodynamicsLaws;
		//}
		
	
	public static void main(String[] args){
		itsValueOf(2.71828);
		fromStartsWithR("Measuring");
		endsWithR1("This subjects");
		indexOfR2("Method");
		toStringR3("This method");
		isEmptyR4("Method");
	 	offsetByCodePointsR5("Viscosity");
		lastIndexOfR6("The value");
		toLowerCaseR7("Colour");
		equalsR8();
		
	
	}
		public static String itsValueOf(double eulersNumber){
	 	String count = eulersNumber.valueOf(2.71828);
		System.out.println(count);
		return count;	
		}	
		
		public static boolean fromStartsWithR(String wireMeasureBy){
		boolean measure = wireMeasureBy.startsWith("Screw");
		System.out.println(measure);
		return true;
		}
		
	    public static boolean endsWithR1(String subject){
			boolean call1 = subject.endsWith("physics");
			System.out.println(call1);
			return true;
		}
		
		public static int indexOfR2(String subject1){
			int call2 = subject1.indexOf('a');
			System.out.println(call2);
			return 5625;
		}
		
		public static String toStringR3(String subject1){
			String subjectOf = subject1.toString();
			System.out.println(subjectOf);
			return "Cat";
		}
		
		public static boolean isEmptyR4(String water){
		boolean values = water.isEmpty();
		System.out.println(values);
		return true;
		}
		
		public static int offsetByCodePointsR5(String propertyOfLiquidIs ){
			int value = propertyOfLiquidIs.offsetByCodePoints(0,3);
			System.out.println(value);
			return 646;
		}
		
		public static int lastIndexOfR6(String water){
			int result = water.lastIndexOf('q');
			System.out.println(result);
			return 688;
		}
		
		public static String toLowerCaseR7(String auroraAlsoIs){
			System.out.println(auroraAlsoIs.toLowerCase());
			return "Green";
		}
		
		public static void equalsR8(){
			String Theory1 = new String("Practical1");
			String Theory2 = new String("Practical2");
			System.out.println(Theory1.equals(Theory2));
		}
		
}

         //enum Radiations{
		 //ALPHA, BETA, GAMMA;
         //}

          //enum Law{
	      //FIRST LAW, SECOND LAW, THIRD LAW;
          //}

          //enum Decay{
       	  //ALPHA DECAY, BETA DECAY, GAMMA DECAY;
          //}
		  
		  //enum Reaction{
		   // NUCLEAR FISSION, NUCLEAR FUSION, RADIOACTIVE, TRANSMUTATION;
		 // }
		  
		 // enum Laws{
			  //TEMPERATURE,HEAT,WORK,ENTROPY;
		  //}