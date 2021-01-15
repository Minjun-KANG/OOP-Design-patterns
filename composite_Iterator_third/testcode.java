package Second.composite_Iterator_third;

import java.util.*;

public class testcode {
	public static void main(String[] args) 
	{
		
		CategoryComponent cs_book = 
			new Category("Computer Science Book", "Computer Science Book Category");
		CategoryComponent ns_book = 
			new Category("Natural Science Book", "Natural Science Book Category");
		
  
		CategoryComponent category = new Category("ALL Category", "All categories combined");
		
		//category.add(category);
		category.add(cs_book);
		category.add(ns_book);
		//x
		
		cs_book.add(new CategoryBook("Head First Design Patterns", "A book describing the design patterns used in OOP.",
				"Elisabeth Freeman", 36.14));
		cs_book.add(new CategoryBook("Operating System Concepts", "A book mainly describes the basic concepts of the operating system POSIX.",
				"Avraham Silberschatz", 121.00));
		cs_book.add(new CategoryBook("Data Communications and Networking", "This book explains OSI 7 Layer in full detail.",
				"Behrouz A. Forouzan", 40.12));
		cs_book.add(new CategoryBook("Data Structures: A Pseudocode Approach with C", "A book describing basic algorithms and data structures.",
				"Richard F. Gilberg", 97.99));
		cs_book.add(new CategoryBook("Advanced Programming in the UNIX Environment", "A book that explains in detail the basic POSIX mechanism and API functions.",
				"W. Stevens", 51.00));
		
		ns_book.add(new CategoryBook("Cosmos: A Personal Voyage", "Read on if you want to know about life.",
				"Carl Sagan", 12.99));
		ns_book.add(new CategoryBook("Surely You¡¯re Joking, Mr. Feynman!", "The lifetime of a pure scientist.",
				"Richard P. Feynman", 13.99));
		ns_book.add(new CategoryBook("Introduction to Quantum Mechanics", "Introduction to quantum mechanics.",
				"David J. Griffiths", 21.98));
		ns_book.add(new CategoryBook("The Elegant Universe", "Physics is a language that describes the world.",
				"Richard F. Gilberg", 17.95));
		ns_book.add(new CategoryBook("The Selfish Gene", "Humans are machines built to live.",
				"Richard Dawkins", 14.45));
  
 
		View view = new View(category);
   
		view.printMenu();
	}
}
