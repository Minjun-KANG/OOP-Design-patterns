package Second.Iterator.first;

public class ComputerScienceBookIterator implements Iterator {
	CategoriesBook[] cs_books;
	int position = 0;
 
	public ComputerScienceBookIterator(CategoriesBook[] books) {
		this.cs_books = books;
	}
 
	public Object next() {
		CategoriesBook cs_book = this.cs_books[position];
		position = position + 1;
		return cs_book;
	}
 
	public boolean hasNext() {
		if (position >= this.cs_books.length || cs_books[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
