package jar;

import java.util.UUID;

public class Account {
	private Client client;
	private UUID id;
	private double balance, interestRate;
	
	public Account(Client client) {
		this.setClient(client);
		this.setId(UUID.randomUUID());
		this.setBalance(0.0);
		this.setInterestRate(0.0);
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "Account [client=" + this.getClient().toString() + ", id=" + this.getId() + ", balance=" + this.getBalance() + ", interestRate=" + this.getInterestRate()
				+ "]";
	}
	
	
	
}
