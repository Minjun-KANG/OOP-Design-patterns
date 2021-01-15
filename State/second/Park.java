package Second.State.second;

public class Park implements State{

	CarState state;
	public Park(CarState carState) {
		// TODO Auto-generated constructor stub
		state = carState;
	}

	@Override
	public void Start_car() {
		// TODO Auto-generated method stub
		System.out.println("The car has stopped.");
	}

	@Override
	public void Driving() {
		// TODO Auto-generated method stub
		System.out.println("Already driven.");
	}

	@Override
	public void parking() {
		// TODO Auto-generated method stub
		System.out.println("The car stops.");
		state.setState(state.getStop());
	}

	@Override
	public void Stop_car() {
		// TODO Auto-generated method stub
		System.out.println("Not parked yet.");
		
	}

}
