package Second.Template_method.first;

public abstract class Animal {
	final void PrepareEat()
	{
		Search();
		Approaches();
		Drink();
		Eat();
	}
	
	public abstract void Search();
	public abstract void Approaches();
	public void Drink()
	{
		System.out.println("Drink");
	}
	public void Eat()
	{
		System.out.println("Eat");
	}
}
