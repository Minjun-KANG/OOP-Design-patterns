package Second.State.second;

public class Drive implements State{

	CarState state;
	public Drive(CarState carState) {
		// TODO Auto-generated constructor stub
		state = carState;
	}

	@Override
	public void Start_car() {
		// TODO Auto-generated method stub
		System.out.println("Already started.");
	}

	@Override
	public void Driving() {
		// TODO Auto-generated method stub
		System.out.println("Driving safely.");
		state.setState(state.getPark());
	}

	@Override
	public void parking() {
		// TODO Auto-generated method stub
		System.out.println("The car is driving.");
	}

	@Override
	public void Stop_car() {
		// TODO Auto-generated method stub
		System.out.println("The car is driving.");
	}

}
