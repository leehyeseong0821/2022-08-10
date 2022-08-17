package projectA13;

import java.util.Scanner;

public class projectA1301 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 int dividend;
		 int divisor;
		 
		 while(true) {
			 System.out.println("나눔수를 입력하시오");
			 dividend = in.nextInt();
			 System.out.println("나뉫수를 입력하시오");
			 divisor = in.nextInt();
			 try {
				 System.out.println("결과:"+dividend/divisor);
				 break;
			 }catch(Exception e) {
				 System.out.println("0으로 나눌수 없습니다.");
			 }
		 }
		 System.out.println("프로그램 종료");
		 in.close();

	}

}
