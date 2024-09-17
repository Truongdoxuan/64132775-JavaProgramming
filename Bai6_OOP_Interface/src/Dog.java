
public class Dog implements IAnimal {
	private String category;
	private boolean gender;
	
	public Dog(String category, boolean gender) {
		super();
		this.category = category;
		this.gender = gender;
	}
	@Override
	public void sound() {
		System.out.println("Gâu gâu");
	}
	@Override
	public String toString() {
		return "Dog [category=" + category + ", gender=" + gender + "]";
	}
	
}
