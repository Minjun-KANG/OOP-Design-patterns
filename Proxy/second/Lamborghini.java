package Second.Proxy.second;

public class Lamborghini extends Car{

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Vroom Du Du Du..");
	}

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("VVVVVroom VVVVVVVVVVroom");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Leaving a skid mark. Kiik~");
	}

}
