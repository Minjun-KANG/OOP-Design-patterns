package Second.Compound.third;

 
import java.util.*;
  
public class CompositeIterator implements Iterator {
	Stack stack = new Stack();
   
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
   
	public Object next() {
		if (hasNext()) {
			Iterator iterator = (Iterator) stack.peek();
			CategoryComponent component = (CategoryComponent) iterator.next();
			if (component instanceof Category) {
				stack.push(component.createIterator());
			} 
			return component;
		} else {
			return null;
		}
	}
  
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator iterator = (Iterator) stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
   
	public void remove() {
		throw new UnsupportedOperationException();
	}
}


