package Second.State.Third;

public class GunState {
	
	State nobullet;
	State reload;
	State shoot;
	int NumberofBullet;
	
	State state;
	public GunState(int NumberOfBullet)
	{
		this.NumberofBullet = NumberOfBullet;
		this.reload = new Reload(this);
		this.nobullet = new NoBullet(this);
		this.shoot = new Shoot(this);
		
		this.state = this.shoot;
	}
	
	public void shoot()
	{
		cur_work();
		state.shoot();
	}
	public void reload(int NumberOfBullet)
	{
		cur_work();
		state.reload(NumberOfBullet);
	}
	public void nobullet()
	{
		cur_work();
		state.nobullet();
	}
	
	void cur_work()
	{
		System.out.println(" -- Curreurt Working is "+ getStateName());
	}
	String getStateName()
	{
		return state.getClass().getSimpleName();
	}
	
	public void setState(State state)
	{
		this.state = state;
	}
	
	public State getNoBullet()
	{
		return nobullet;
	}
	public State getReload()
	{
		return reload;
	}
	public State getShoot()
	{
		return shoot;
	}
	
}
