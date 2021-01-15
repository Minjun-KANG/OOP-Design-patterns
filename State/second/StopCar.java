package Second.State.second;

public class StopCar implements State{

	CarState state;
	public StopCar(CarState carState) {
		// TODO Auto-generated constructor stub
		state = carState;
	}

	@Override
	public void Start_car() {
		// TODO Auto-generated method stub
		System.out.println("Not yet start");
		
	}

	@Override
	public void Driving() {
		// TODO Auto-generated method stub
		System.out.println("The engine is off.");
	}

	@Override
	public void parking() {
		// TODO Auto-generated method stub
		System.out.println("Already stopped.");
	}

	@Override
	public void Stop_car() {
		// TODO Auto-generated method stub
		System.out.println("Turned off.......");
		state.setState(state.getStart());
	}

}
