
public class App {

	public static void main(String[] args) {
		Cat c = new Cat("Tam the",false);
		Dog d = new Dog("Bull",true);
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		IAnimal c1 = new Cat("Meowtwo",false);
		System.out.println(c1.toString());
		IAnimal d1 = new Dog("Husky",true);
		System.out.println(d1.toString());
	}

}
