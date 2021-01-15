package Second.Template_method.first;

public class testcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an = new Carnivore();
		Animal no = new Herbivore();
		
		an.PrepareEat();
		no.PrepareEat();
	}

}
