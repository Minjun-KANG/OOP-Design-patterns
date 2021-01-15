package Second.Compound.third;

import java.util.*;

public abstract class CategoryComponent {
   
	public void add(CategoryComponent categoryComponent) {
		throw new UnsupportedOperationException();
	}
	public void remove(CategoryComponent categoryComponent) {
		throw new UnsupportedOperationException();
	}
	public CategoryComponent getChild(int i) {
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

	public abstract Iterator createIterator();
 
	public void print() {
		throw new UnsupportedOperationException();
	}
}
