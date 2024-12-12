package jar;

public class JumpingOutOfNestAccount extends Account{

	public JumpingOutOfNestAccount(Client client) {
		super(client);
		this.setInterestRate(3.5);
	}

}
