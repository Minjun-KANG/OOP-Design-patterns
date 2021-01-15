package Second.Proxy.third;

public class Wait implements State{

	WindowMessageHandler handler;
	
	public Wait(WindowMessageHandler windowMessageHandler) 
	{
		handler = windowMessageHandler;
	}
	
	@Override
	public void WM_Destory() {
		// TODO Auto-generated method stub
		handler.setState(handler.getAfterDestory());
		handler.WM_Destory();
	}

	@Override
	public void WM_Paint() {
		// TODO Auto-generated method stub
		handler.setState(handler.getCommandDraw());
		handler.WM_Paint();
	}

	@Override
	public void WM_Create() {
		// TODO Auto-generated method stub
		System.out.println("The window is already made.");
	}

	@Override
	public void WM_HitKey() {
		// TODO Auto-generated method stub
		handler.setState(handler.getCommandHitkey());
		handler.WM_HitKey();
	}

	@Override
	public void WM_LBtnDown() {
		// TODO Auto-generated method stub
		handler.setState(handler.getCommandLBDown());
		handler.WM_LBtnDown();
	}

	@Override
	public void WM_Wait() {
		handler.WM_Wait();
	}
	
}
