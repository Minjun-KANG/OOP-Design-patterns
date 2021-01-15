package Second.Iterator.first;

public class CategoriesBook {
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
  
	public String getwriter() {
		return writer;
	}
	public String toString() {
		return (name + ", $" + price + "\n   " + description);
	}
}
