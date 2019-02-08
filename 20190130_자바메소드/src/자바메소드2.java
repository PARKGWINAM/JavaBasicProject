import java.util.Scanner; //결과값 받아서 출력
/*
 * 	덧셈=두개의 정수 (사용자 전송)
 *             =======매개변수2개
 *      결과값 받아서 출력 하는 프로그램
 *      ===리턴형 1개
 */
public class 자바메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		자바메소드.add(); // 다른 클래스에서 호출할 때 -> 자바메소드가 갖고 있는 add메소드를 호출 해라 -> 재사용
		int a=10;
		int b=20;
		//덧셈 요청
		int c=add(a,b);
		System.out.println(c);
		
		int d=minus(a,b);
		System.out.println(d);
		
		int e=multi(a,b);
		System.out.println(e);
		
		double f=div(a,b);
		System.out.println(f);
	}
	//덧셈
	/*
	 * static int add(int a,int b)
	 *        ===일치 -> 크다(long, double, float)
		{
		return a+b;
			   ===
		}
	 */
	static int add(int a,int b)
	{
	return a+b;
	}

	static int minus(int a, int b)
	{
		return a-b;
	}
	
	static int multi(int a, int b)
	{
		return a*b;
	}
	
	static double div(int a, int b)
	{
		return a/(double)b;
	}
	
}


