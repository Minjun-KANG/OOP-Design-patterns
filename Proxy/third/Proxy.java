package Second.Proxy.third;

public class Proxy implements Order{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Order handler = new WindowMessageHandler();
		handler.run();
		//System.out.println(handler);
		//handler.WM_Create();
		
		
	}

}
