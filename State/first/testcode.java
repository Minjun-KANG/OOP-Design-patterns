package Second.State.first;

public class testcode {
	public static void main(String[] args)
	{
		WindowMessageHandler handler = new WindowMessageHandler();
		
		//System.out.println(handler);
		//handler.WM_Create();
		
		handler.WM_Create();
		handler.WM_Create(); //transition�� �Ͼ�� ���� ����;
		handler.WM_HitKey();
		handler.WM_Paint();
		handler.WM_Destory(); //�ٽ� Create�� ȣ���ؾ߸� �ٸ� Event ó������
		
	}
}