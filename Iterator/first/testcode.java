package Second.Iterator.first;

import java.util.*;
@SuppressWarnings("unused")

public class testcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerScienceBook cs_books = new ComputerScienceBook();
		NaturalScienceBook ns_books = new NaturalScienceBook();
		
		View view = new View(cs_books, ns_books);
		view.printCategories();
	}

}
