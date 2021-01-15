package Second.Compound.second;

public class Perform implements Order{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Handled the order.");
		ack();
		nak();
		ping();
	}
	

	public void ping() {}


	public void ack()
	{
		System.out.println("Ack");
	}
	public void nak()
	{
		System.out.println("NAK");
	}
}
