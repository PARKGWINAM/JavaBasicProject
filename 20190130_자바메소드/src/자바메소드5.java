// 리턴형X, 매개변수 X
/*
 * 	전체 목록을 출력할 때 : 
 * 	리턴형X, 매개변수(O) : 글쓰기, 수정, 삭제...
 * 
 * 	구구단 전체 출력
 * 
 * 	->변수는 중복이름을 설정할 수 없다
 *   메소드는 중복이름을 설정할 수 있다.
 */
public class 자바메소드5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan();
	}
	static void gugudan() //보내준값도 없고 받는값도 없이 그냥 출력
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=2; j<=9; j++) //단
			{
				System.out.printf("%d*%d=%2d\t",j,i,j*i);//구구단 출력 지점
			}
			System.out.println();
		}
	}
}
