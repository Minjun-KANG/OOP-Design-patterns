package Second.Iterator.first;

public class ComputerScienceBook implements Category {
	static final int MAX_CNT = 5;
	int cur_cnt = 0;
	CategoriesBook[] cs_book;
	
	public ComputerScienceBook()
	{
		cs_book = new CategoriesBook[MAX_CNT];
		addItem("Head First Design Patterns", "A book describing the design patterns used in OOP.",
				"Elisabeth Freeman", 36.14);
		addItem("Operating System Concepts", "A book mainly describes the basic concepts of the operating system POSIX.",
				"Avraham Silberschatz", 121.00);
		addItem("Data Communications and Networking", "This book explains OSI 7 Layer in full detail.",
				"Behrouz A. Forouzan", 40.12);
		addItem("Data Structures: A Pseudocode Approach with C", "A book describing basic algorithms and data structures.",
				"Richard F. Gilberg", 97.99);
		addItem("Advanced Programming in the UNIX Environment", "A book that explains in detail the basic POSIX mechanism and API functions.",
				"W. Stevens", 51.00);
	}
	public void addItem(String name, String description, String writer, double price) 
	{
		CategoriesBook book = new CategoriesBook(name, description, writer, price);
		if (cur_cnt >= MAX_CNT) {
			System.err.println("book categories is full!");
		} else {
			cs_book[cur_cnt] = book;
			cur_cnt++;
		}
	}

	public CategoriesBook[] getBooks() {
		return this.cs_book;
	}

	public Iterator createIterator() {
		return new ComputerScienceBookIterator(this.cs_book);
	}
}
