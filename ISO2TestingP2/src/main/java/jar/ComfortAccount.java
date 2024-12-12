package jar;

public class ComfortAccount extends Account{

	public ComfortAccount(Client client) {
		super(client);
		this.setInterestRate(1.5);
	}
}
