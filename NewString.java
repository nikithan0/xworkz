public class NewString{
	public static void main(String[] arg){
		String animal = "Panda";
		String animalName = new String("Panda");
		
		String cartoon = "Oggy";
		String cartoonName = new String("Oggy");
		
		String city = "Manglore";
		String cities = new String ("Manglore");
		
		String fruit = "Papaya";
		String fruitInTree = new String("Papaya");
		
		String snack = "Biscuit";
		String snacks = new String("Biscuit");
		
		System.out.println(animal==animalName);
		System.out.println(cartoon==cartoonName);
		System.out.println(city==cities);
		System.out.println(fruit==fruitInTree);
		System.out.println(snack==snacks);
	}
}