

public class App {

	public static void main(String[] args) {

		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Ryne");
		person1.greet();
		
		//creating showInfo() method, but both classes are not the same, so we make use of interfaces
		//creating new class objects allocate memory to store variables
		
		Info info1 = new Machine(); //can create info object off of Machine class since Machine implements Info
		info1.showInfo();
		
		Info info2 = person1;//info2 points at person1. person1 points at Person. Person implements Info.
		info2.showInfo();
		
		//adding a break to separate outputs more clearly
		System.out.println();
		
		//created method below can use anything point towards the class that implements Info
		outputInfo(mach1);  //calls showInfo() in Machine
		outputInfo(person1);//calls showInfo() in Person
	}
	
	private static void outputInfo(Info info) { //static because there is no new App object
		
		info.showInfo(); //only method defined in Info interface. more methods are possible.
		
	}

}
