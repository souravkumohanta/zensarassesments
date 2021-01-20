package bean;

public class Account {
	
	private int Accno;
	private String Name;
	private int Amount;
	
	Account()
	{
		Accno=1010;
		Name="Unknown";
		Amount=500;
	}

	public int getAccno() {
		return Accno;
	}

	public void setAccno(int accno) {
		Accno = accno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}
	
	

}
