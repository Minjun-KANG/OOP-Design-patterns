package Second.composite_Iterator_third;

import java.util.Iterator;
  
public class View {
	CategoryComponent allMenus;
 
	public View(CategoryComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
  
}
