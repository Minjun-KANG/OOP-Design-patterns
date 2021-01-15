package Second.State.Third;

public class testcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GunState gun = new GunState(10);
		
		for(int i = 0; i < 9; i++)
			gun.shoot();
		
		gun.shoot();
		
		gun.shoot();
		
		gun.nobullet();
		gun.reload(3);
		
		gun.shoot(); gun.shoot(); gun.shoot(); 
		
		gun.shoot();
		
		gun.shoot();
		gun.nobullet();
		gun.reload(0);
		gun.shoot();
		gun.shoot();
		gun.nobullet();
		gun.reload(0);
		
	}

}
