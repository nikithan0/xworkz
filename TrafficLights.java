    public class TrafficLights{
		
		 Colours colour ;
         static byte numberOfColours ;
		
		public static void main(String[] args){
			TrafficLights objct = new TrafficLights(Colours.RED, (byte)3);
		
			System.out.println(objct.colour);
			System.out.println(TrafficLights.numberOfColours);
		}
		public TrafficLights(Colours colour, byte numberOfColours){
			this.colour = colour;
			this.numberOfColours=numberOfColours;
		}
	
		 
	}
	
	enum Colours{
		RED, YELLOW, GREEN;
		}