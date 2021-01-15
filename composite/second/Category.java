package Second.composite.second;


import java.util.ArrayList;
import java.util.Iterator;


public class Category extends CategoriesComponents {
	ArrayList<CategoriesComponents> categoriesComponents = new ArrayList<CategoriesComponents>();
	String name;
	String description;
  
	public Category(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public void add(CategoriesComponents categoriesComponents) {
		categoriesComponents.add(categoriesComponents);
	}
	
	public void remove(CategoriesComponents categoriesComponents) {
		categoriesComponents.remove(categoriesComponents);
	}
 
	public CategoriesComponents getChild(int i) {
		return (CategoriesComponents)categoriesComponents.get(i);
	}
 
	public String getName() {
		return name;
	}
 
	public String getDescription() {
		return description;
	}
 
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
  
		Iterator<CategoriesComponents> iterator = categoriesComponents.iterator();
		while (iterator.hasNext()) {
			CategoriesComponents categoriesComponents = 
				(CategoriesComponents)iterator.next();
			categoriesComponents.print();
		}
		//PholymophismÀ» Àû±ØÀÌ¿ë.
	}
}

