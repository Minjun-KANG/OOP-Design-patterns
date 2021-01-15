package Second.Iterator.first;

import java.util.ArrayList;

public class NaturalScienceBookIterator implements Iterator {
	ArrayList<CategoriesBook> ns_books;
	int position = 0;
 
	public NaturalScienceBookIterator(ArrayList<CategoriesBook> books) {
		this.ns_books = books;
	}
 
	public Object next() {
		Object ns_book = ns_books.get(position);
		position = position + 1;
		return ns_book;
	}
 
	public boolean hasNext() {
		if (position >= ns_books.size()) {
			return false;
		} else {
			return true;
		}
	}
}
