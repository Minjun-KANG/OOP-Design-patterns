package Second.State.second;

public class StartCar implements State{

	CarState state;
	public StartCar(CarState carState) {
		// TODO Auto-generated constructor stub
		state = carState;
	}

	@Override
	public void Start_car() {
		// TODO Auto-generated method stub
		System.out.println("Turn on the car.");
		state.setState(state.getDrive());
	}

	@Override
	public void Driving() {
		// TODO Auto-generated method stub
		System.out.println("Not yet start.");
	}

	@Override
	public void parking() {
		// TODO Auto-generated method stub
		System.out.println("Not yet start.");
	}

	@Override
	public void Stop_car() {
		// TODO Auto-generated method stub
		System.out.println("Already Stop the car.");
	}

}
