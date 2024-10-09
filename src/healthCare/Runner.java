package healthCare;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		ArrayList<Hospital> hospitalList = new ArrayList<Hospital>();
		
		UserInterface screen = new UserInterface(hospitalList);
		screen.welcomeScreen();
	}

}
