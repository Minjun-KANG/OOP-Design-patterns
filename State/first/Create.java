package Second.State.first;

public class Create implements State{

	WindowMessageHandler handler;
	
	public Create(WindowMessageHandler windowMessageHandler) {
		// TODO Auto-generated constructor stub
		handler = windowMessageHandler;
	}

	@Override
	public void WM_Destory() {
		// TODO Auto-generated method stub
		System.out.println("The window hasn't been made yet.");
	}

	@Override
	public void WM_Paint() {
		// TODO Auto-generated method stub
		System.out.println("The window hasn't been made yet.");
	}

	@Override
	public void WM_Create() {
		// TODO Auto-generated method stub
		System.out.println("Windows was successfully created.");
		handler.setState(handler.getBeforeCreate());
	}

	@Override
	public void WM_HitKey() {
		// TODO Auto-generated method stub
		System.out.println("The window hasn't been made yet.");
	}

	@Override
	public void WM_LBtnDown() {
		// TODO Auto-generated method stub
		System.out.println("The window hasn't been made yet.");
	}

	@Override
	public void WM_Wait() {
		handler.WM_Wait();
		handler.setState(handler.getWait());
	}

}
