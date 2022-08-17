package projectA13;

public class exit {

	public static void main(String[] args) {
		     
		
		Account account = new Account();
		
		account.depoist(10000);
		System.out.println("예금액:"+account.getBlance());
		
		try {
			account.withdraw(40000);
			
		}catch(BalanceInsufficientException e) {
			
			String message = e.getMessage();
			System.out.println(message);
			
		}

	}

}
