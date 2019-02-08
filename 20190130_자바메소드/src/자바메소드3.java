import java.util.Scanner;
public class 자바메소드3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=input();
		int b=input();
		
		System.out.println("a="+a+",b="+b);
	}
	static int input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력:");
		int num=scan.nextInt();
		
		return num;
	}
}
