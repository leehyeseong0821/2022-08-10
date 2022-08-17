package projectA13;

public class Account {
   
	
	private long blance;
	public Account() {
		
	}
	public long getBlance() {
		return blance;
	}
	public void depoist(int money) {
		blance +=money;
	}
	public void withdraw(int money)throws BalanceInsufficientException{
		if(blance<money) {
			throw new BalanceInsufficientException("잔고부족"+(money-blance)+"모자라다.");
		}
		blance -= money;
	}
	
}
