package Second.Template_method.third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Car {
	final void prepareCAR() {
		turnOn();
		drive();
		if (customerWantsCondiments()) {
			Oil();
			drive();
		}
		   
		stop();       
		turnOff(); 
	}
	public void Oil()
	{
		stop();
		System.out.println("Filling up gasoline...");
	}
	public void turnOff()
	{
		System.out.println("Startup shutdown.");
	}
	
	abstract void turnOn();    
	abstract void drive();     
	abstract void stop();     
	
	public boolean customerWantsCondiments() {

		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
	
	private String getUserInput() {
		// get the user's response
		String answer = null;

		System.out.print("Would you like to add oil (y/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
	 
}
