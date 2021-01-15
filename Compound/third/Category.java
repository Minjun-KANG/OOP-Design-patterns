package Second.Compound.third;

import java.util.Iterator;
import java.util.ArrayList;

public class Category extends CategoryComponent {
 
	ArrayList<CategoryComponent> menuComponents = new ArrayList<CategoryComponent>();
	String name;
	String description;
  
	public Category(String name, String description) {
		this.name = name;
		this.description = description;
	}
 
	public void add(CategoryComponent categoryComponent) {
		menuComponents.add(categoryComponent);
	}
 
	public void remove(CategoryComponent categoryComponent) {
		menuComponents.remove(categoryComponent);
	}
 
	public CategoryComponent getChild(int i) {
		return (CategoryComponent)menuComponents.get(i);
	}
 
	public String getName() {
		return name;
	}
 
	public String getDescription() {
		return description;
	}

  
	public Iterator<?> createIterator() {
		return new CompositeIterator(menuComponents.iterator());
	}
 
 
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
  
		Iterator<CategoryComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			CategoryComponent categoryComponent = 
				(CategoryComponent)iterator.next();
			categoryComponent.print();
		}
	}
}
