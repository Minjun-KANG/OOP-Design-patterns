package Second.State.second;


public class CarState {
	
	State drive;
	State park;
	State start;
	State stop;
	
	State current_state;
	
	public CarState()
	{
		drive = new Drive(this);
		park = new Park(this);
		start = new StartCar(this);
		stop = new StopCar(this);
		
		current_state = start;
	}
	public void Start_car()
	{
		cur_work();
		current_state.Start_car();
	}
	public void Driving()
	{
		cur_work();
		current_state.Driving();
	}
	public void parking()
	{
		cur_work();
		current_state.parking();
	}
	public void Stop_car()
	{
		cur_work();
		current_state.Stop_car();
	}

	
	void cur_work()
	{
		System.out.println(" -- Curreurt Working is "+ getStateName());
	}
	String getStateName()
	{
		return current_state.getClass().getSimpleName();
	}
	
	public void setState(State state)
	{
		this.current_state = state;
	}
	
	public State getDrive()
	{
		return drive;
	}
	public State getPark()
	{
		return park;
	}
	public State getStart()
	{
		return start;
	}
	public State getStop()
	{
		return stop;
	}
}
