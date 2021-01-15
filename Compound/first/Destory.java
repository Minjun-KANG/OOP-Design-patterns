package Second.Compound.first;

public class Destory implements State{

	WindowMessageHandler handler;
	
	public Destory(WindowMessageHandler windowMessageHandler) {
		// TODO Auto-generated constructor stub
		handler = windowMessageHandler;
	}

	@Override
	public void WM_Destory() {
		// TODO Auto-generated method stub
		System.out.println("Windows shut down successfully.");
	}

	@Override
	public void WM_Paint() {
		// TODO Auto-generated method stub
		System.out.println("The program has already been terminated.");
	}

	@Override
	public void WM_Create() {
		// TODO Auto-generated method stub
		handler.setState(handler.getBeforeCreate());
		handler.WM_Create();
	}

	@Override
	public void WM_HitKey() {
		// TODO Auto-generated method stub
		System.out.println("The program has already been terminated.");
	}

	@Override
	public void WM_LBtnDown() {
		// TODO Auto-generated method stub
		System.out.println("The program has already been terminated.");
	}

	@Override
	public void WM_Wait() {
		System.out.println("The program has already been terminated.");
	}

}
