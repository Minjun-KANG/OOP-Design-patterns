package Second.State.first;

public class testcode {
	public static void main(String[] args)
	{
		WindowMessageHandler handler = new WindowMessageHandler();
		
		//System.out.println(handler);
		//handler.WM_Create();
		
		handler.WM_Create();
		handler.WM_Create(); //transition이 일어나는 것을 방지;
		handler.WM_HitKey();
		handler.WM_Paint();
		handler.WM_Destory(); //다시 Create를 호출해야만 다른 Event 처리가능
		
	}
}
