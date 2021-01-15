package Second.Proxy.first;

public class Proxy implements Order{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("You have now passed the order.");
		Order secretary = new Secretary();
		secretary.run();
	}
	
}
