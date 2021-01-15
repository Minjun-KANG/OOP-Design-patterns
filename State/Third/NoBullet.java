package Second.State.Third;

public class NoBullet implements State{

	GunState state;
	public NoBullet(GunState gunState) {
		// TODO Auto-generated constructor stub
		state = gunState;
	}

	@Override
	public void shoot() {
		// TODO Auto-generated method stub
		System.out.println("You don't have bullet.");
	}

	@Override
	public void reload(int NumberOfBullet) {
		// TODO Auto-generated method stub
		System.out.println("You don't have supply");
	}

	@Override
	public void nobullet() {
		// TODO Auto-generated method stub
		System.out.println("Oh, there's no bullets.");
		state.setState(state.getReload());
		
	}

	

	

}
