package bean;

public class Account {
	
	private int Accno;
	private String Name;
	private int Amount;
	
	
	public Account(int Accno,String Name,int Amount)
	{
		this.Accno=Accno;
		this.Name=Name;
		this.Amount=Amount;
	}


	public int getAccno() {
		return Accno;
	}


	public void setAccno(int accno) {
		this.Accno = accno;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		this.Name = name;
	}


	public int getAmount() {
		return Amount;
	}


	public void setAmount(int amount) {
		this.Amount = amount;
	}


	
	
}
  


