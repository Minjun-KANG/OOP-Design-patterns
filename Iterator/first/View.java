package Second.Iterator.first;

public class View {
	ComputerScienceBook cs_book;
	NaturalScienceBook ns_book;
 
	public View(ComputerScienceBook cs_books, NaturalScienceBook ns_books) {
		this.cs_book = cs_books;
		this.ns_book = ns_books;
	}
 
	public void printCategories() {
		Iterator CSBookIterator = cs_book.createIterator();
		Iterator NSBookIterator = ns_book.createIterator();

		System.out.println("Category\n----\nComputer Science\n");
		printCategories(CSBookIterator);
		System.out.println("----\n\n\n");
		
		
		System.out.println("Category\n----\nNatural Science\n");
		printCategories(NSBookIterator);
		System.out.println("----");
		
	}
 
	private void printCategories(Iterator CSBookIterator) {
		while (CSBookIterator.hasNext()) {
			CategoriesBook book = (CategoriesBook)CSBookIterator.next();
			System.out.print("Book name : "+book.getName()+", ");
			System.out.println("$"+book.getPrice());
			System.out.println("Book abstract : "+book.getDescription());
			System.out.println("Book writer : "+book.getwriter());
			System.out.println("");
		}
	}
 
}
