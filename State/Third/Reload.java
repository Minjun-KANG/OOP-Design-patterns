package Second.State.Third;
import java.util.Scanner;

public class Reload implements State{
	Scanner sc = new Scanner(System.in);
	GunState state;
	public Reload(GunState gunState) {
		// TODO Auto-generated constructor stub
		state = gunState;
	}

	@Override
	public void shoot() {
		// TODO Auto-generated method stub
		System.out.println("You're loading it now!");
	}
	
	@Override
	public void reload(int NumberOfBullet) {
		// TODO Auto-generated method stub
		System.out.println("Reloading!");
		if(NumberOfBullet == 0)
		{
			
			System.out.println("How many bullets?");
			int temp = sc.nextInt();
			if(temp == 0)
			{
				state.setState(state.getNoBullet());
			}else if(temp < 0)
			{
				System.out.println("We lost gun..");
				System.exit(0);
			}else {
				state.NumberofBullet = temp;
				System.out.println("Complete loading.");
				state.setState(state.getShoot());
			}
		}else
		{
			state.NumberofBullet = NumberOfBullet;
			state.setState(state.getShoot());
		}
		
		
	}

	@Override
	public void nobullet() {
		// TODO Auto-generated method stub
		System.out.println("You're loading it now!");
		
	}


	

	
}
