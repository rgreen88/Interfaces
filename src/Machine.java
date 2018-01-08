
public class Machine implements Info{
	
	private int id = 7;
	
	public void start(){
		
		System.out.println("Machine started");
	
	}

	
	//auto-generated or typed in to call method showInfo() from Info class to define Machine specific information
	@Override
	public void showInfo() {

		System.out.println("Machine ID is: " + id);
		
	}

}
