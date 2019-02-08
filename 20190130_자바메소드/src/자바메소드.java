/*
 * 		메소드
 * 	-자바 클래스 구성요소
 * 1)변수
 * 2)메소드=연산자+제어문
 * 
 * 메소드 정의) 명령문의 집합, 메소드는 한가지 기능만 수행 ex)사칙연산 -> 4개의 메소드로 만들어진다
 * 만들어지는 시점) 1. 재사용이 가능한 부분만 메소드로 만든다
 *            2. 반복처리가 될때           **구조적 프로그램 
 *      장난감 만들기 : 완제품 -> 절차적(수정, 추가가 여려움) / 조립(레고) -> 메소드(구조적) -> 수정이 쉬움
 *      SM -> 객체지향
 * 메소드 형식) 리턴형(결과값) 메소드명(매개변수...)=선언부
 *                   ===== 변수의 식별자와 동일 -> 소문자로 시작한다.
 * {
 * 	구현부
 * }
 * 
 * 	리턴형 : 처리후에 요청 결과 값
 * 	====결과값이 1개(여러개일 때 배열, 클래스로 묶어서 전송)
 * 	매개변수 : 사용자가 보내준 값 (여러개 설정 가능)
 *  ====보내는 데이터가 많은 경우는 -> 배열, 클래스 전송   **3개이상 초과하지 않는다.
 *  
 *  -유형
 *  =====================
 *     리턴형         매개변수
 *  =====================
 *      O       O    -> String substring(int begin, int end)
 *                      ======리턴형                  ======매개변수========
 *  =====================
 *      O       X    -> double random()
 *                     ==리턴형==      ==매개변수X
 *  =====================
 *      X       O    -> void println(String data)     **void: 처리후에 결과값이 없다.
 *                      =리턴형=       =====매개변수===
 *      
 *  =====================
 *      X       X    -> void println()
 *                      ==X==       =X=
 *  =====================
 *  
 *  3.메소드 호출 -> static -> 클래스를 인터프리터시 자동으로 메모리 저장
 *   1)static(O) : 클래스메소드
 *     ->클래스명.메소드명  ex)Math.random(), String.valueOf()
 *   2)static(X) : 인스턴스메소드
 *     ->Scanner scan=new Scanner(System.in)
 *       Scan.nextInt()
 *       
 *       String s="";
 *       s.trim()
 */

//두개의 정수를 받아서 덧셈하기
import java.util.Scanner;
public class 자바메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++)
		{
			add(); //호출
		}
		
	}

	static void add() //묶어놓고 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.println("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
}
