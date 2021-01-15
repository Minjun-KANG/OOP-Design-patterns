package Second.composite.second;


public abstract class CategoriesComponents {

	public void add(CategoriesComponents book) {
		throw new UnsupportedOperationException();
	}
	public void remove(CategoriesComponents menuComponent) {
		throw new UnsupportedOperationException();
	}
	public CategoriesComponents getChild(int i) {
		throw new UnsupportedOperationException();
	}
  
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public String getWriter() {
		throw new UnsupportedOperationException();
	}
  
	public void print() {
		throw new UnsupportedOperationException();
	}
	
}
