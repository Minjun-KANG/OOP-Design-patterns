package Second.Compound.second;

public class Proxy implements Order{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("You have now passed the order.");
		Order per = new Perform();
		per.run();
	}
	
}
