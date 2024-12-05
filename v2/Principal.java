package p;
import java.util.*;

public class Principal {
	
	static Scanner KB = new Scanner(System.in);
	
	public static void main (String [] args) throws InvalidValueException, NoRecommendationException {
		
		Client c = new Client(Home.Family, Activity.Studying, 25);
		int op;
		boolean quit = false;
		System.out.println("Welcome to the account selector!");
		while(!quit) {
			System.out.println("Do you wish to:");
			System.out.println("1. See current client profile.");
			System.out.println("2. Modify client profile.");
			System.out.println("3. Show recommended account.");
			System.out.println("4. Exit.");
			op = read();
			if (op < 0 || op > 4) {
				throw new InvalidValueException();
			}
			else {
				switch(op) {
				case 1:
					System.out.println(c.toString());
					break;
				case 2:
					c = creator();
					break;
				case 3:	
					accountChooser(c);
					break;
				case 4:
					quit = true;
				}
			}
		}
	}
	
	public static Client creator() throws InvalidValueException {
		int age, op;
		Activity a = null;
		Home h = null;
		System.out.println("Please input your age");
		op = read();
		if (op < 0) {
			throw new InvalidValueException();
		}
		age = op;
		System.out.println("Do you live alone or with your parents?"); 
		System.out.println("1--> Alone / 0--> With Parents");
		op = read();
		if(op < 0 || op > 1) {
			throw new InvalidValueException();
		}
		switch(op) {
		case 1:
			h = Home.Self;
			break;
		case 0:
			h = Home.Family;
			break;
		}
		System.out.println("Do you work or study?"); {
			System.out.println("1--> Work / 0--> Study");
			op = read();
			while(op < 0 || op > 1) {
				throw new InvalidValueException();
			}
			switch(op) {
			case 1:
				a = Activity.Working;
				break;
			case 0:
				a = Activity.Studying;
				break;
			}
		}
		
		return new Client(h, a, age);
		
	}
	
	
	public static int read() throws InputMismatchException {
		int i = 0;
		i = KB.nextInt();
		return i;
	}

	public static void accountChooser(Client c) throws NoRecommendationException {
		int age = c.getAge();
		Home h = c.getHome();
		Activity a = c.getActivity();
		if(age < 18) {
			if(h == Home.Family) {
				if(a == Activity.Working) {
					throw new NoRecommendationException();
				}
				else {
					System.out.println("We recommend the 'Comfort' account");
				}
			}
			else {
				if(a == Activity.Working) {
					throw new NoRecommendationException();
				}
				else {
					throw new NoRecommendationException();
				}
			}
		}
		else if (age >= 18 || age <= 25) {
			if(h == Home.Family) {
				if(a == Activity.Working) {
					System.out.println("We recommend the 'Save Now You Can' account");
				}
				else {
					throw new NoRecommendationException();
				}
			}
			else {
				if(a == Activity.Working) {
					System.out.println("We recommend the 'Jumping Out Of Nest' account");
				}
				else {
					System.out.println("We recommend the 'Let's Go You Can' account");
				}
			}
		}
		else {
			if(h == Home.Family) {
				if(a == Activity.Working) {
					System.out.println("We recommend the 'Independence It's Time' account");
				}
				else {
					throw new NoRecommendationException();
				}
			}
			else {
				if(a == Activity.Working) {
					System.out.println("We recommend the 'Welcome To Adult Life' account");
				}
				else {
					throw new NoRecommendationException();
				}
			}
		}
	}
	
	
	
}
