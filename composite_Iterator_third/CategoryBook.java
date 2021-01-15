package Second.composite_Iterator_third;

import java.util.Iterator;
import java.util.ArrayList;

public class CategoryBook extends CategoryComponent {
 
	String name;
	String description;
	String writer;
	double price;
    
	public CategoryBook(String name, 
	                String description, 
	                String writer, 
	                double price) 
	{ 
		this.name = name;
		this.description = description;
		this.writer = writer;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
	public String getWriter() {
		return writer;
	}

	public Iterator createIterator() {
		return new NullIterator();
	}
 
	public void print() {
		System.out.print("  " + getName());
		System.out.println(", " + getPrice());
		System.out.println("  "+ getWriter());
		System.out.println("     -- \n" + getDescription());
		
	}
//vv MenuItemCompositeV2Main
}
//^^ MenuItemCompositeV2Main
//^^ MenuItemCompositeV2
