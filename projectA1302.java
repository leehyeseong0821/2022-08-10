package projectA13;

public class projectA1302 {

	public static void main(String[] args) {
         Integer[] intValue = new Integer[10];
		
		for(Integer i=0;i<10;i++) {
			intValue[i] = i;
			
		}
		try {
			
		
		for(Integer i=0;i<=10;i++) {
			 System.out.println(intValue[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
//			
		}
//		 
		System.out.println("실행 프로그램 다음 내용들....");
		
		
	}

}

