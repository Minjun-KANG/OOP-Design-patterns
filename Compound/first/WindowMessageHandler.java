package Second.Compound.first;
//gumball machine.
/*
 * Observer pattern을 사용하여, 이미 Device에게 Windows Event Message가 전달된 상황에서,
 * 각 State별로 행동을 정의.
 * 
 * 
 */
public class WindowMessageHandler implements Order{
	
	public void run()
	{
		this.WM_Create();
		this.WM_Create(); //transition이 일어나는 것을 방지;
		this.WM_HitKey();
		this.WM_Paint();
		this.WM_Destory(); //다시 Create를 호출해야만 다른 Event 처리가능
	}
	
	State BeforeCreate;
	State AfterDestory;
	State CommandDraw;
	State CommandHitkey;
	State CommandLBDown;
	State Wait;
 
	State state;
 
	public WindowMessageHandler() {
		BeforeCreate = new Create(this);
		AfterDestory = new Destory(this);
		CommandDraw = new Draw(this);
		CommandHitkey = new HitKey(this);
		CommandLBDown = new BTNDown(this);
		Wait = new Wait(this);
		
		state = BeforeCreate;
	}
	public void WM_Destory()
	{
		state.WM_Destory();
	}
	public void WM_Paint()
	{
		state.WM_Paint();
		WM_Complete();
	}
	public void WM_Create() // Event Wait Procedure
	{
		state.WM_Create();
		WM_Complete();
	}
	public void WM_HitKey()
	{
		state.WM_HitKey();
		WM_Complete();
	}
	public void WM_LBtnDown()
	{
		state.WM_LBtnDown();
		WM_Complete();
	}
	void WM_Complete()
	{
		System.out.println("Working is Completed : " + getStateName());
		WM_Wait();
		state = Wait;
	}
	void WM_Wait()
	{	
		System.out.println("Waiting Event..");
	}
	
	public String getStateName()
	{
		return state.getClass().getSimpleName();
	}
	
	public void setState(State state)
	{
		this.state = state;
	}
	public State getState()
	{
		return state;
	}
	
	public State getBeforeCreate()
	{
		return BeforeCreate;
	}
	 
	public State getAfterDestory()
	{
		return AfterDestory;
	}
	public State getCommandDraw()
	{
		return CommandDraw;
	}
	public State getCommandHitkey()
	{
		return CommandHitkey;
	}
	public State getCommandLBDown()
	{
		return CommandLBDown;
	}
	public State getWait()
	{
		return Wait;
	}
	
}
