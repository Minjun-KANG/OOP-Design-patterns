package Second.State.Third;

public class Shoot implements State{
	GunState state;
	public Shoot(GunState gunState) {
		// TODO Auto-generated constructor stub
		state = gunState;
	}

	@Override
	public void shoot() {
		// TODO Auto-generated method stub
		if(state.NumberofBullet > 0) {
			System.out.println("bam!");
			state.NumberofBullet--;
		}
		if(state.NumberofBullet == 0)
		{
			state.setState(state.getNoBullet());
		}
	}

	@Override
	public void reload(int NumberOfBullet) {
		// TODO Auto-generated method stub
		System.out.println("Are you serious? You're shooting?");
	}

	@Override
	public void nobullet() {
		// TODO Auto-generated method stub
		System.out.println("We've got a lot of bullets left, dude!");
	}

	

	

}
