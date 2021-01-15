package Second.State.first;

public interface State {
	/*
	 * WM_Destroy
	 * WM_Paint
	 * WM_Create
	 * WM_HitKey
	 * WM_LBbtnDown
	 */
	public void WM_Destory();
	public void WM_Paint();
	public void WM_Create();
	public void WM_HitKey();
	public void WM_LBtnDown();
	public void WM_Wait();
}
