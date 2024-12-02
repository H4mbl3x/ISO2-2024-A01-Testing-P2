public class AccountTypeSelector {
	public static void main(String[] args) {
		// Test cases
        Client client1 = new Client(17, true, false, true);
        System.out.println(determineAccountType(client1)); // Comfort Account

        Client client2 = new Client(22, true, false, false);
        System.out.println(determineAccountType(client2)); // Let's Go You Can Account

        Client client3 = new Client(20, false, true, true);
        System.out.println(determineAccountType(client3)); // Save Now You Can Account

        Client client4 = new Client(30, false, true, false);
        System.out.println(determineAccountType(client4)); // Welcome To Adult Life Account
	}
	
	public static String determineAccountType(Client client) {
		if (client.getAge() < 18 && client.isStudying() && client.livesWithParents()) {
            return "Comfort Account";
        } else if (client.getAge() < 25 && client.isStudying() && !client.livesWithParents()) {
            return "Let's Go You Can Account";
        } else if (client.getAge() >= 18 && client.getAge() <= 25 && client.isWorking()) {
            if (client.livesWithParents()) {
                return "Save Now You Can Account";
            } else {
                return "Jumping Out Of Nest Account";
            }
        } else if (client.getAge() > 25 && client.isWorking()) {
            if (client.livesWithParents()) {
                return "Independence It's Time";
            } else {
                return "Welcome To Adult Life Account";
            }
        }

        throw new IllegalArgumentException("No valid account type found for the given client attributes.");
	}
        
    
}
