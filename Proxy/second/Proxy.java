package Second.Proxy.second;

public class Proxy implements Order{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Order La = new Lamborghini();
		Order Ro = new RollsRoyce();
		
		La.run();		
		System.out.println("\n\n");
		
		Ro.run();
		
		
		
	}

}
