import java.util.Scanner; //����� �޾Ƽ� ���
/*
 * 	����=�ΰ��� ���� (����� ����)
 *             =======�Ű�����2��
 *      ����� �޾Ƽ� ��� �ϴ� ���α׷�
 *      ===������ 1��
 */
public class �ڹٸ޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�ڹٸ޼ҵ�.add(); // �ٸ� Ŭ�������� ȣ���� �� -> �ڹٸ޼ҵ尡 ���� �ִ� add�޼ҵ带 ȣ�� �ض� -> ����
		int a=10;
		int b=20;
		//���� ��û
		int c=add(a,b);
		System.out.println(c);
		
		int d=minus(a,b);
		System.out.println(d);
		
		int e=multi(a,b);
		System.out.println(e);
		
		double f=div(a,b);
		System.out.println(f);
	}
	//����
	/*
	 * static int add(int a,int b)
	 *        ===��ġ -> ũ��(long, double, float)
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


