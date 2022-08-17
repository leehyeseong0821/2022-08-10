package projectA13;

public class projectA1308 {

	public static void main(String[] args) {
		String []data=new String[] {"1","ㅁ"};
		
		
		try {
			
			String data1= data[0];
			String data2= data[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result= value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("값의 지정이 잘못되었습니다.");
		}catch(Exception e) {
			System.out.println("한글로 변경할수없습니다.");
		}finally {
			System.out.println("다시확인하고 설정하세요");
		}

	}

}
