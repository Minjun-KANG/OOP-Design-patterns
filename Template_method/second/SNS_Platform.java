package Second.Template_method.second;
import java.io.*;

public abstract class SNS_Platform {
	final void prepareSNS() {
		
		write();
		board();
		like();
		if (customerWantsCondiments()) {
			delete();
		}
	}
	
	public void write()
	{
		System.out.println("User writes.");
	}
	
	
	
	public void delete()
	{
		System.out.println("User deletes text.");
	}
	abstract public void like();
	abstract void board();
	
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

		System.out.print("Are you sure you want to delete the written text (y/n)? ");

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
