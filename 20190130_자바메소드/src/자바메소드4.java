// 리턴형
/*
 *  처리 후 -> 출력만 한다 -> sysout
 *      -> 결과 값을 받아서 처리(보낼거냐) -> return
 *      
 *  사용자로부터 단을 한개 받아서 출력해라 -> void (돌려줄 결과 값이 없을 때)
 *  
 */
public class 자바메소드4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan=3;
		gugudan(dan);
		
		star(3);
		System.out.println("국어점수:100");
		star(10);
		System.out.println("영어점수:90");
		star(10);
		System.out.println("수학점수:80");
		
	}
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
	}
	

	static void star(int count) 
	{
		for(int i=0; i<count; i++)
		
		System.out.print("★");
		}
}
