package jar;

public class AccountTypeSelector {
	public static void main(String[] args) {
		// Test cases
		try {
			Client client1 = new Client(17, true, false, true);
			System.out.println(determineAccountType(client1).getClass().getName()); // Comfort Account
		} catch (IllegalArgumentException e) {
			System.out.println("Failed to determine account type: " + e.getMessage());
		}
		
		try {
			Client client2 = new Client(-22, true, false, false);
			try {
				System.out.println(determineAccountType(client2).getClass().getName()); // Let's Go You Can Account
			} catch (IllegalArgumentException e) {
				System.out.println("Failed to determine account type: " + e.getMessage());
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Failed to create client: " + e.getMessage());
		}

		try {
			Client client3 = new Client(20, false, true, true);
			System.out.println(determineAccountType(client3).getClass().getName()); // Save Now You Can Account
		} catch (IllegalArgumentException e) {
			System.out.println("Failed to determine account type: " + e.getMessage());
		}

		try {
			Client client4 = new Client(30, false, true, false);
			System.out.println(determineAccountType(client4).getClass().getName()); // Welcome To Adult Life Account
		} catch (IllegalArgumentException e) {
			System.out.println("Failed to determine account type: " + e.getMessage());
		}
	}

	public static Account determineAccountType(Client client) throws IllegalArgumentException {
		if (client.getAge() < 18 && client.isStudying() && client.livesWithParents()) {
			return new ComfortAccount(client);
		} else if (client.getAge() < 25 && client.isStudying() && !client.livesWithParents()) {
			return new LetsGoYouCanAccount(client);
		} else if (client.getAge() >= 25 && client.isWorking()) {
			if (client.livesWithParents()) {
				return new IndependenceItsTimeAccount(client);
			} else {
				return new WelcomeToAdultLifeAccount(client);
			}
		} else if (client.getAge() >= 18 && client.isWorking()) {
			if (client.livesWithParents()) {
				return new SaveNowYouCanAccount(client);
			} else {
				return new JumpingOutOfNestAccount(client);
			}
		}

		throw new IllegalArgumentException("No valid account type found for the given client attributes.");
	}

}
