package Second.Proxy.third;

public class Draw implements State{

	WindowMessageHandler handler;
	
	public Draw(WindowMessageHandler windowMessageHandler) {
		// TODO Auto-generated constructor stub
		handler = windowMessageHandler;
	}

	@Override
	public void WM_Destory() {
		// TODO Auto-generated method stub
		System.out.println("The process is running.");
	}

	@Override
	public void WM_Paint() {
		// TODO Auto-generated method stub
		System.out.println("Image is drawn normally.");
	}

	@Override
	public void WM_Create() {
		// TODO Auto-generated method stub
		System.out.println("The process is running.");
	}

	@Override
	public void WM_HitKey() {
		// TODO Auto-generated method stub
		System.out.println("The process is running.");
	}

	@Override
	public void WM_LBtnDown() {
		// TODO Auto-generated method stub
		System.out.println("The process is running.");
	}

	@Override
	public void WM_Wait() {
		handler.WM_Wait();
	}

}
