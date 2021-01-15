package Second.composite.second;


public class View {
	CategoriesComponents category;
	 
	public View(CategoriesComponents category) {
		this.category = category;
	}
 
	public void printMenu() {
		category.print();
	}
}
