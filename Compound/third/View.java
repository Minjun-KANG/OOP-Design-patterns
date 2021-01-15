package Second.Compound.third;

import java.util.Iterator;
  
public class View extends Proxy{
	CategoryComponent allMenus;
 
	public View(CategoryComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
  
}
