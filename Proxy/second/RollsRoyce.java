package Second.Proxy.second;

public class RollsRoyce extends Car{

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle seat automatic adjustment.\r\n" + 
				"Automatic vehicle temperature regulation.\r\n" + 
				"Mute...");
	}

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("Silence...");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Very quietly-slllk..");
	}
	
}
