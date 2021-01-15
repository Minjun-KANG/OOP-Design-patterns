package Second.composite.second;

import java.util.Iterator;
@SuppressWarnings("unused")

public class CategoriesBook extends CategoriesComponents{
	String name;
	String description;
	String writer;
	double price;
 
	public CategoriesBook(String name, String description, String writer, double price)
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
	public String toString() {
		return (name + ", $" + price + "\n   " + description);
	}
	public void print() {
		System.out.print("  " + getName());
		System.out.println(", " + getPrice());
		System.out.println("     -- " + getDescription());
		System.out.println("   "+getWriter());
	}
}
