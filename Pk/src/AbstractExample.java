abstract class Bike{
	abstract void run();
}
public class AbstractExample extends Bike{
	void run(){
		System.out.println("Running");
	}
	public static void main(String[] args) {
		Bike obj = new AbstractExample();
		obj.run();
	}
}
