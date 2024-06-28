package Conta.entities;

public class Conta {
	private Integer number;
	private String holder;
	private Double balance;
	
	public Conta () {
		
	}
	public Conta(Integer number, String holder, Double balance) {
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	

	public Conta(Integer number, String holder) {
		
		this.number = number;
		this.holder = holder;
		balance = 0.00;
	}
	
	



	public String getHolder() {
		return holder;
	}



	public void setHolder(String holder) {
		this.holder = holder;
	}



	public void deposit(Double amount ) {
		balance+= amount;
	}
	
	public void withdraw(Double amount) {
		balance = balance - amount - 5.00;
	}



	@Override
	public String toString() {
		return "Account " 
				+ number +
				", Holder: "
				+ holder +
				", Balance:$ " 
				+ String.format("%.2f", balance) ;
	}
	
	
	

}
