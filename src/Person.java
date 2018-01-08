
public class Person implements Info{

	//constructor for Person class
	public Person(String name) {
	
		this.name = name;
	
	}

	private String name;
	
	public void greet(){
		
		System.out.println("Hello there.");
		
	}

	@Override
	public void showInfo() {

		System.out.println("My name is " + name);
		
	}
	
}
