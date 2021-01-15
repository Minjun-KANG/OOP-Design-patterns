package Second.Iterator.first;

import java.util.ArrayList;

public class NaturalScienceBook implements Category {
	ArrayList<CategoriesBook> ns_book;
	
	public NaturalScienceBook()
	{
		ns_book = new ArrayList<CategoriesBook>();
		addItem("Cosmos: A Personal Voyage", "Read on if you want to know about life.",
				"Carl Sagan", 12.99);
		addItem("Surely You¡¯re Joking, Mr. Feynman!", "The lifetime of a pure scientist.",
				"Richard P. Feynman", 13.99);
		addItem("Introduction to Quantum Mechanics", "Introduction to quantum mechanics.",
				"David J. Griffiths", 21.98);
		addItem("The Elegant Universe", "Physics is a language that describes the world.",
				"Richard F. Gilberg", 17.95);
		addItem("The Selfish Gene", "Humans are machines built to live.",
				"Richard Dawkins", 14.45);
	}
	public void addItem(String name, String description, String writer, double price) 
	{
		CategoriesBook book = new CategoriesBook(name, description, writer, price);
		ns_book.add(book);
	}

	public ArrayList<CategoriesBook> getBooks() {
		return this.ns_book;
	}

	public Iterator createIterator() {
		return new NaturalScienceBookIterator(this.ns_book);
	}
}
