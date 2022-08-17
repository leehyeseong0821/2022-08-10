package projectA13;

public class projectA1305 {

	public static void main(String[] args) {
		 String data =null;
		 
		 try {
		 System.out.println("결과는"+data.toString());
		 }catch(NullPointerException e) {
			 data="확인";
					System.out.println(data);
		 }
	}

}
